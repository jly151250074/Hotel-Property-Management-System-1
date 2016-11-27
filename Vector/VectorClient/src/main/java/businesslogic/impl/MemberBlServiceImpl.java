package businesslogic.impl;

import businesslogic.MemberBlService;
import common.InfoType;
import common.ResultMessage;
import dataService.dao.MemberDao;
import rmi.RemoteHelper;
import vo.MemberVo;

/**
 * Updated by lienming on 2016-11-27.
 */
public class MemberBlServiceImpl implements MemberBlService{

    private MemberDao memberDao ;
    
    private static MemberBlServiceImpl memberBlServiceImpl;
    
    public static MemberBlServiceImpl getInstance(){
    	if(memberBlServiceImpl==null)
    		memberBlServiceImpl=new MemberBlServiceImpl();
    	return memberBlServiceImpl;
    }
    
    public MemberBlServiceImpl(){
        memberDao = RemoteHelper.getInstance().getMemberDao();
    }

    public int getCredit(String id)  {
        return memberDao.getCredit(id);
    }

    public ResultMessage chargeCredit(String id, int amount){
        return memberDao.chargeCredit(id,amount);
    }

    public MemberVo getInfo(String id){
        return memberDao.getInfo(id);
    }

    public ResultMessage checkInfo(String info, InfoType infoType){
        return ResultMessage.SUCCEED;
    }

    public ResultMessage modifyInfo(MemberVo vo){
        return memberDao.modifyInfo(vo);
    }

}
