package data.dao;

import common.InfoType;
import common.ResultMessage;
import vo.MemberVo;

/**
 * @ author Molloh
 * @ version 2016/11/6
 * @ description
 */
public interface MemberDao {

    public int getCredit(int id);

    public ResultMessage chargeCredit(int id, int amount);

    public MemberVo getInfo(int id);

    public ResultMessage modifyInfo(int id, MemberVo vo);


}
