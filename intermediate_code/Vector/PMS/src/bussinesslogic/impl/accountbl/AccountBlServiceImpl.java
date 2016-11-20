package service.impl;

import common.ResultMessage;
import data.dao.AccountDao;
import po.AccountPo;
import bussinesslogic.service.AccountBlService;
import data.dao.Impl.AccountDaoImpl;
/**
 * Created by lienming on 2016-11-13.
 */
public class AccountBlServiceImpl implements AccountBlService {

    private AccountDao accountDao;

    private static AccountBlServiceImpl accountBlServiceImpl;

    public static AccountBlServiceImpl getInstance(){
        if( accountBlServiceImpl == null)
            accountBlServiceImpl = new AccountBlServiceImpl() ;
        return accountBlServiceImpl;
    }

    private AccountBlServiceImpl(){
        accountDao = AccountDaoImpl.getInstance();
    }

    public int login(String memberName, String password){
        //先检查输入
        ResultMessage memberNameValid = checkInput(memberName);
        ResultMessage passwordValid   = checkInput(password) ;
        if(memberNameValid == ResultMessage.VALID
                && passwordValid == ResultMessage.VALID )
            return accountDao.login(memberName,password);
        else
            return -1; //-1代表输入非法
    }

    public ResultMessage logout(int id){
        return accountDao.logout(id);
    }

    public int register(String memberName,String password){
        //先检查输入
        ResultMessage memberNameValid = checkInput(memberName);
        ResultMessage passwordValid   = checkInput(password) ;
        if(memberNameValid == ResultMessage.VALID
                && passwordValid == ResultMessage.VALID )
             return accountDao.register(memberName,password);
        else
            return -1;    //-1代表输入非法
    }

    public ResultMessage modify(int id,String newPassword){
        return accountDao.modify(id,newPassword);
    }

    public ResultMessage checkInput(String input){
        if(input.length()>0)
            return ResultMessage.VALID;
        else
            return ResultMessage.FAIL;
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
