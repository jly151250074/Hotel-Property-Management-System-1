package service.impl.memberbl;

import common.InfoType;
import common.ResultMessage;
import data.dao.MemberDao;
import data.dao.impl.MemberDaoImpl;
import vo.MemberVo;

/**
 * @author lienming
 * @version 2016-11-13
 * @description
 */
public class MemberBlServiceImpl {

    private MemberDao memberDao ;

    public MemberBlServiceImpl(){
        memberDao = MemberDaoImpl.getInstance();
    }

    public int getCredit(int id){
        return memberDao.getCredit(id);
    }

    public ResultMessage chargeCredit(int id, int amount){
        return memberDao.chargeCredit(id,amount);
    }

    public MemberVo getInfo(int id){
        return memberDao.getInfo(id);
    }

    public ResultMessage checkInfo(String info, InfoType infoType){
        return ResultMessage.SUCCEED;
    }

    public ResultMessage modifyInfo(int id , MemberVo vo){
        return memberDao.modifyInfo(id,vo);
    }

}
