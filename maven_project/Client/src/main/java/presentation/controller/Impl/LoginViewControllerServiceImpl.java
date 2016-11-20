package presentation.controller.Impl;

import java.rmi.RemoteException;

import businesslogic.AccountBlService;
import businesslogic.impl.AccountBlServiceImpl;
import common.AccountType;
import common.ResultMessage;
import presentation.controller.LoginViewControllerService;

/**
 * Created by Administrator on 2016-11-19.
 */
public class LoginViewControllerServiceImpl implements LoginViewControllerService {

    private AccountBlService accountBlService ;  //下层

    private static LoginViewControllerServiceImpl loginImpl;  //本层

    public static LoginViewControllerServiceImpl getInstance(){
        if(loginImpl==null)
            loginImpl = new LoginViewControllerServiceImpl() ;
        return loginImpl;
    }

    private LoginViewControllerServiceImpl(){
        accountBlService = AccountBlServiceImpl.getInstance();
    }

    public AccountType login(String memberName, String password) throws RemoteException{
        return accountBlService.login(memberName,password);
    }

    public ResultMessage logout(String id) throws RemoteException{
        return accountBlService.logout(id);
    }

}
