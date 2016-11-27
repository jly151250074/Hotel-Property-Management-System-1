package dataService.dao;

import java.rmi.Remote;

import common.AccountType;
import common.ResultMessage;
import po.AccountPo;
import vo.AccountVo;

/**
 * @ author lienming
 * @ version 2016/11/27
 * @ description
 */
public interface AccountDao extends Remote {

    public AccountType login(String id, String password);

    public ResultMessage logout(String id)  ;

    public String register(String memberName,String password) ;

    public ResultMessage modify(String id,String newPassword) ;

    public AccountVo find(String id);

    public ResultMessage insert(AccountPo po) ;

    public ResultMessage update(AccountPo po);

    public ResultMessage delete(String id);

}
