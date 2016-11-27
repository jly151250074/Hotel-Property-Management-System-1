package presentation.controller.Impl;

import businesslogic.AccountBlService;
import businesslogic.impl.AccountBlServiceImpl;
import common.AccountType;
import common.ResultMessage;
import presentation.controller.LoginViewControllerService;

/**
 * updated by Administrator on 2016-11-27.
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

    public AccountType login(String memberName, String password) {
        return accountBlService.login(memberName,password);
    }

    public ResultMessage logout(String id){
        return accountBlService.logout(id);
    }

}
