package data.dao;

import common.ResultMessage;
import po.AccountPo;

/**
 * @ author lienming
 * @ version 2016/11/13
 * @ description
 */
public interface AccountDao {

    public int login(String memberName, String password);

    public ResultMessage logout(int id);

    public int register(String memberName,String password);

    public ResultMessage modify(int id,String newPassword);

    public ResultMessage find(int id);

    public ResultMessage insert(AccountPo po);

    public ResultMessage update(AccountPo po);

    public ResultMessage delete(AccountPo po);

}
