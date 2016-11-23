package businessLogic.impl;

import common.InfoType;
import common.ResultMessage;
import dataService.dao.service.MemberDao;
import rmi.RemoteHelper;
import vo.MemberVo;

import java.rmi.RemoteException;

/**
 * Created by lienming on 2016-11-13.
 */
public class MemberBlServiceImpl {

    private MemberDao memberDao ;

    public MemberBlServiceImpl(){
        memberDao = RemoteHelper.getInstance().getMemberDao();
    }

    public int getCredit(String id) throws RemoteException {
        return memberDao.getCredit(id);
    }

    public ResultMessage chargeCredit(String id, int amount) throws RemoteException{
        return memberDao.chargeCredit(id,amount);
    }

    public MemberVo getInfo(String id) throws RemoteException{
        return memberDao.getInfo(id);
    }

    public ResultMessage checkInfo(String info, InfoType infoType) throws RemoteException{
        return ResultMessage.SUCCEED;
    }

    public ResultMessage modifyInfo(String id , MemberVo vo) throws RemoteException{
        return memberDao.modifyInfo(id,vo);
    }

}
