package presentation.controller;

import common.ResultMessage;
import vo.MemberVo;

/**
 * @ author lienming
 * @ version 2016-11-27
 * @ description
 */
public interface MemberMainViewControllerService {
	

    public int getCredit(String id) ;

    public ResultMessage chargeCredit(String id, int amount) ;

    public MemberVo getInfo(String id) ;

    public ResultMessage modifyInfo(MemberVo vo) ;
}
