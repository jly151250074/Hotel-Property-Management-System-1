package data.dao.Impl;

import common.ResultMessage;
import data.dao.AccountDao;
import data.datahelper.AccountDataHelper;
import data.datahelper.DataFactory;
import data.datahelper.Impl.DataFactoryImpl;
import po.AccountPo;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by Administrator on 2016-11-13.
 */
public class AccountDaoImpl implements AccountDao {

    /* map<Id,AccountPO> */
    private Map<Integer,AccountPo> map;

    private AccountDataHelper accountDataHelper;

    private DataFactory dataFactory;

    private static AccountDaoImpl accountDataServiceImpl;

    public static AccountDaoImpl getInstance(){
        if(accountDataServiceImpl == null){
            accountDataServiceImpl = new AccountDaoImpl();
        }

        return accountDataServiceImpl;
    }

    private AccountDaoImpl(){
        if(map == null){
            dataFactory = new DataFactoryImpl();
            accountDataHelper = dataFactory.getAccountDataHelper();
            map = accountDataHelper.getAccountData();
        }
    }


    public int login(String memberName, String password){
        Iterator<Map.Entry<Integer, AccountPo>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<Integer, AccountPo> entry = iterator.next();
            AccountPo po = entry.getValue();
            if( po.getMemberName().equals(memberName) )
            {
                if(po.getPassword().equals(password)) {
                    if (po.getLogState() == 1)
                        return -2;    //已登入，不能重复登入

                    po.setLogState(1);
                    update(po);       //默认更新po信息成功
                    return po.getId();
                }
                else
                    return -3; //账号存在,密码错误
            }
        }
        return -4; //账号名不存在

    }

    public ResultMessage logout(int id){
        AccountPo po = map.get(id);
        if(po.getLogState()==0)
            return ResultMessage.FAIL;

        po.setLogState(0);
        update(po);
        return ResultMessage.SUCCEED;
    }

    public int register(String memberName,String password){
        Iterator<Map.Entry<Integer, AccountPo>> iterator = map.entrySet().iterator();
        int newId = 0 ;
        /*找到accountPo库最末尾的Id，以方便创建一个新的Id，最后写入
          过程中遍历之前的每一个memberName，如果有重复，直接返回-1
         */
        while(iterator.hasNext()) {
            Map.Entry<Integer, AccountPo> entry = iterator.next();
            if(entry.getValue().getMemberName().equals(memberName))
                return -2;  //-2代表用户名已存在，不能重复注册
            newId = entry.getKey();
        }
        newId ++ ;
        AccountPo newPo = new AccountPo(memberName,password,newId,0);
        insert(newPo);
        return newId;
    }

    public ResultMessage modify(int id,String newPassword){
        Iterator<Map.Entry<Integer, AccountPo>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<Integer, AccountPo> entry = iterator.next();
            if( id == entry.getKey() ) {
                AccountPo po = entry.getValue();
                AccountPo newPo = new AccountPo(po.getMemberName(),newPassword,po.getId(),po.getLogState()) ;
                entry.setValue(newPo);
                return ResultMessage.SUCCEED;
            }
        }
        return ResultMessage.FAIL;
    }

    public ResultMessage find(int id){
        Iterator<Map.Entry<Integer, AccountPo>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<Integer, AccountPo> entry = iterator.next();
            if (id == entry.getKey()) {
                return ResultMessage.SUCCEED;
            }
        }
        return ResultMessage.FAIL;
    }

    public ResultMessage insert(AccountPo po){
        if(!map.containsKey(po.getId())) {
            map.put(po.getId(), po);
            accountDataHelper.updateAccountData(map);
            return ResultMessage.SUCCEED;
        }
        else
            return ResultMessage.FAIL; //已存在
    }

    /**对AccountDaoImpl类持有的map对象进行数据更新，再更新txtData里的数据
    *  完全可由 map.put(int Id,AccountPo po)代替
    */
    public ResultMessage update(AccountPo po){
        int id = po.getId() ;
        Iterator<Map.Entry<Integer, AccountPo>> iterator = map.entrySet().iterator();
        if(map.containsKey(id))
        {
            map.put(id, po);
            accountDataHelper.updateAccountData(map);
            return ResultMessage.SUCCEED;
        }
        else
            return ResultMessage.FAIL;
    }


    public ResultMessage delete(AccountPo po){
        return ResultMessage.SUCCEED;
    }

}
