package dataService.dao;

import common.ResultMessage;
import po.MemberPo;

/**
 * @ author lienming
 * @ version 2016/11/20
 * @ description
 */

/*
* 注意： id : int 全自行改为 String 类型
*/
public interface MemberDao {

    public int getCredit(int id);

    public ResultMessage chargeCredit(int id, int amount);

    public MemberPo getInfo(int id);

    public ResultMessage modifyInfo(int id, MemberPo vo);


}
