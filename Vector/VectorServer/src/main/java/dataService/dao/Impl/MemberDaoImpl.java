package dataService.dao.impl;


import common.ResultMessage;
import dataService.dao.service.MemberDao;
import dataService.dataHelper.service.DataFactory;
import dataService.dataHelper.Impl.DataFactoryImpl;
import dataService.dataHelper.service.MemberDataHelper;
import po.MemberPo;


import java.util.Iterator;
import java.util.Map;

/**
 * Created by Administrator on 2016-11-13.
 */

/*
* 注意： id : int 全自行改为 String 类型
*/
public class MemberDaoImpl implements MemberDao {

    private Map<Integer,MemberPo> map;

    private MemberDataHelper memberDataHelper;

    private DataFactory dataFactory;

    private static MemberDaoImpl memberDataServiceImpl;

    public static MemberDaoImpl getInstance(){
        if(memberDataServiceImpl == null){
            memberDataServiceImpl = new MemberDaoImpl();
        }

        return memberDataServiceImpl;
    }

    public MemberDaoImpl(){
        if(map == null){
            dataFactory = new DataFactoryImpl();
            memberDataHelper = dataFactory.getMemberDataHelper();
            map = memberDataHelper.getMemberData();
        }
    }


    public int getCredit(int id){
        return getInfo(id).getCredit();
    }

    public ResultMessage chargeCredit(int id, int amount){
        Iterator<Map.Entry<Integer, MemberPo>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<Integer,MemberPo> entry = iterator.next();
            if( id == entry.getKey() ) {
                MemberPo po = entry.getValue();
                MemberPo newPo = new MemberPo(po.getId(),po.getName(),po.getPhone(),
                        po.getAddress(),po.getSex(),po.getCredit()+amount) ;
                entry.setValue(newPo);
                return ResultMessage.SUCCEED;
            }

        }
        return ResultMessage.FAIL;
    }

    public MemberPo getInfo(int id){
        Iterator<Map.Entry<Integer, MemberPo>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<Integer, MemberPo> entry = iterator.next();
            if (id == entry.getKey()) {
                MemberPo po = entry.getValue();
                return po;
            }
        }
        return null;
    }

    public ResultMessage modifyInfo(int id,MemberPo po){
        Iterator<Map.Entry<Integer, MemberPo>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<Integer, MemberPo> entry = iterator.next();
            if (id == entry.getKey()) {

                entry.setValue(po);
                return ResultMessage.SUCCEED;
            }
        }
        return ResultMessage.FAIL;
    }

}
