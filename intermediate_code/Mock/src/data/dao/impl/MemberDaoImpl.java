package data.dao.impl;


import common.InfoType;
import common.ResultMessage;
import data.dao.MemberDao;
import data.datahelper.MemberDataHelper;
import data.datahelper.DataFactory;
import data.datahelper.impl.DataFactoryImpl;

import po.AccountPo;
import po.MemberPo;
import vo.MemberVo;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by Administrator on 2016-11-13.
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

    public MemberVo getInfo(int id){
        Iterator<Map.Entry<Integer, MemberPo>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<Integer, MemberPo> entry = iterator.next();
            if (id == entry.getKey()) {
                MemberPo po = entry.getValue();
                MemberVo vo = new MemberVo(po);
                return vo;
            }
        }
        return null;
    }

    public ResultMessage modifyInfo(int id,MemberVo vo){
        Iterator<Map.Entry<Integer, MemberPo>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<Integer, MemberPo> entry = iterator.next();
            if (id == entry.getKey()) {
                MemberPo po = new MemberPo(vo.getId(),vo.getName(),vo.getPhone(),
                        vo.getAddress(),vo.getSex(),vo.getCredit());
                entry.setValue(po);
                return ResultMessage.SUCCEED;
            }
        }
        return ResultMessage.FAIL;
    }

}
