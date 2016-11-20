package service.impl.accountbl;

import common.ResultMessage;
import data.dao.AccountDao;
import po.AccountPo;
import data.dao.impl.AccountDaoImpl;
import service.service.accountBlService.AccountBlService;

/**
 * Created by lienming on 2016-11-13.
 */
public class AccountBlServiceImpl implements AccountBlService {

    private AccountDao accountDao;

    public AccountBlServiceImpl(){
        accountDao = AccountDaoImpl.getInstance();
    }

    public ResultMessage login(int id, String password){
        return accountDao.login(id,password);
    }

    public ResultMessage logout(int id){
        return accountDao.logout(id);
    }

    public int register(String memberName,String password){
        return accountDao.register(memberName,password);
    }

    public ResultMessage modify(int id,String newPassword){
        return accountDao.modify(id,newPassword);
    }

    public ResultMessage checkInput(String input){
        return ResultMessage.VALID;
    }

    public ResultMessage find(int id){
        return accountDao.find(id);
    }

    public ResultMessage insert(AccountPo po){
        return accountDao.insert(po);
    }

    public ResultMessage update(AccountPo po){
        return accountDao.update(po);
    }

    public ResultMessage delete(AccountPo po){
        return accountDao.delete(po);
    }

}
