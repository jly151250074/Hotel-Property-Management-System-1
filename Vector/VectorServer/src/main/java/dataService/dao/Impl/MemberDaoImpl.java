package dataService.dao.Impl;


import java.util.Iterator;
import java.util.Map;

import common.ResultMessage;
import dataService.dao.MemberDao;
import dataService.dataHelper.DataFactory;
import dataService.dataHelper.MemberDataHelper;
import dataService.dataHelper.Impl.DataFactoryImpl;
import po.MemberPo;
import vo.MemberVo;

/**
 * Created by Administrator on 2016-11-27.
 */

public class MemberDaoImpl implements MemberDao {

    private Map<String,MemberPo> map;

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


    public int getCredit(String id) {
    	MemberVo vo = getInfo(id);
    	if(!vo.equals(null))
    		return vo.getCredit();
    	else
    		return -1;
    }

    public ResultMessage chargeCredit(String id, int amount){
    	// amount<0?
        Iterator<Map.Entry<String, MemberPo>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String,MemberPo> entry = iterator.next();
            if( entry.getKey().equals(id) ) {
                MemberPo po = entry.getValue();
                po.setCredit(po.getCredit()+amount);
                update(po);
                return ResultMessage.SUCCEED;
            }

        }
        return ResultMessage.FAIL;
    }

    public MemberVo getInfo(String id){
        Iterator<Map.Entry<String, MemberPo>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, MemberPo> entry = iterator.next();
            if (entry.getKey().equals(id)) {
                MemberPo po = entry.getValue();
                MemberVo vo = new MemberVo(po);
                return vo;
            }
        }
        return null;
    }

    public ResultMessage modifyInfo(MemberVo vo){
        Iterator<Map.Entry<String, MemberPo>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, MemberPo> entry = iterator.next();
            if ( entry.getKey().equals(vo.getId())) {
            	MemberPo po = new MemberPo(vo.getId(),vo.getName(),vo.getPhone(),
            			vo.getAddress(), vo.getSex(), vo.getCredit());
                update(po);
                return ResultMessage.SUCCEED;
            }
        }
        return ResultMessage.FAIL;
    }

    public ResultMessage insert(MemberPo po){
    	 if(!map.containsKey(po.getId())) {
             map.put(po.getId(), po);
             memberDataHelper.updateMemberData(map);
             return ResultMessage.SUCCEED;
         }
         else
             return ResultMessage.FAIL; //已存在
    }
    
    public ResultMessage update(MemberPo po){
    	String id = po.getId() ;
        if(map.containsKey(id))
        {
            map.put(id, po);
            memberDataHelper.updateMemberData(map);
            return ResultMessage.SUCCEED;
        }
        else
            return ResultMessage.FAIL;
    }
    
    public ResultMessage delete(String id){
    	  if(map.containsKey(id))
          {
              map.remove(id);
              memberDataHelper.updateMemberData(map);
              return ResultMessage.SUCCEED;
          }
          else
              return ResultMessage.FAIL;
    }
    
}
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
