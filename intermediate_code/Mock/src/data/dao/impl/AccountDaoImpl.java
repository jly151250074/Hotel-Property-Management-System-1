package data.dao.impl;

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

    public AccountDaoImpl(){
        if(map == null){
            dataFactory = new DataFactoryImpl();
            accountDataHelper = dataFactory.getAccountDataHelper();
            map = accountDataHelper.getAccountData();
        }
    }


    public ResultMessage login(int id, String password){
        AccountPo po = map.get(id) ;
        if(po.getPassword().equals(password))
            return ResultMessage.SUCCEED;
        else
            return ResultMessage.FAIL;

    }

    public ResultMessage logout(int id){
        return ResultMessage.SUCCEED;
    }

    public int register(String memberName,String password){
        Iterator<Map.Entry<Integer, AccountPo>> iterator = map.entrySet().iterator();
        int newId = 0 ;
        while(iterator.hasNext()) {
            Map.Entry<Integer, AccountPo> entry = iterator.next();
            newId = entry.getKey();
        }
        newId ++ ;
        AccountPo newPo = new AccountPo(memberName,password,newId);
        map.put(newId,newPo);
        accountDataHelper.updateAccountData(map);
        return newId;

    }

    public ResultMessage modify(int id,String newPassword){
        Iterator<Map.Entry<Integer, AccountPo>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<Integer, AccountPo> entry = iterator.next();
            if( id == entry.getKey() ) {
                AccountPo po = entry.getValue();
                AccountPo newPo = new AccountPo(po.getMemberName(),newPassword,po.getId()) ;
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
        map.put(po.getId(),po);
        return ResultMessage.SUCCEED;
    }

    public ResultMessage update(AccountPo po){
        int id = po.getId() ;
        Iterator<Map.Entry<Integer, AccountPo>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<Integer, AccountPo> entry = iterator.next();
            if (id == entry.getKey()) {
                entry.setValue(po);
                return ResultMessage.SUCCEED;
            }
        }
        return ResultMessage.FAIL;
    }

    public ResultMessage delete(AccountPo po){
        return ResultMessage.SUCCEED;
    }

}
