package businessLogic.impl;

import common.AccountType;
import common.ResultMessage;
import dataService.dao.service.AccountDao;
import po.AccountPo;
import rmi.RemoteHelper;

import java.rmi.RemoteException;

import businessLogic.service.AccountBlService;

/**
 * Created by lienming on 2016-11-13.
 */
public class AccountBlServiceImpl implements AccountBlService{

    private AccountDao accountDao;

    private static AccountBlServiceImpl accountBlServiceImpl;

    public static AccountBlServiceImpl getInstance(){
        if( accountBlServiceImpl == null)
            accountBlServiceImpl = new AccountBlServiceImpl() ;
        return accountBlServiceImpl;
    }

    private AccountBlServiceImpl(){
        accountDao = RemoteHelper.getInstance().getAccountDao();
    }

    public AccountType login(String id, String password) throws RemoteException {
        //先检查输入
        ResultMessage memberNameValid = checkInput(id);
        ResultMessage passwordValid   = checkInput(password) ;
        if(memberNameValid == ResultMessage.VALID
                && passwordValid == ResultMessage.VALID )
            return accountDao.login(id,password);
        else
            return AccountType.Fail; //输入非法
    }

    public ResultMessage logout(String id) throws RemoteException{
        return accountDao.logout(id);
    }

    public String register(String memberName,String password) throws RemoteException{
        //先检查输入
        ResultMessage memberNameValid = checkInput(memberName);
        ResultMessage passwordValid   = checkInput(password) ;
        if(memberNameValid == ResultMessage.VALID
                && passwordValid == ResultMessage.VALID )
             return accountDao.register(memberName,password);
        else
            return "FAIL";    //输入非法
    }

    public ResultMessage modify(String id,String newPassword) throws RemoteException{
        return accountDao.modify(id,newPassword);
    }

    public ResultMessage checkInput(String input){
        if(input.length()>0)
            return ResultMessage.VALID;
        else
            return ResultMessage.FAIL;
    }

    public ResultMessage find(String id) throws RemoteException{
        return accountDao.find(id);
    }

    public ResultMessage insert(AccountPo po) throws RemoteException{
        return accountDao.insert(po);
    }

    public ResultMessage update(AccountPo po) throws RemoteException{
        return accountDao.update(po);
    }

    public ResultMessage delete(AccountPo po) throws RemoteException{
        return accountDao.delete(po);
    }

}
