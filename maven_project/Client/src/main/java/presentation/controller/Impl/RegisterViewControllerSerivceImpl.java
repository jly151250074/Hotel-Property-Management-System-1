package presentation.controller.Impl;

import java.rmi.RemoteException;

import businesslogic.AccountBlService;
import businesslogic.impl.AccountBlServiceImpl;
import presentation.controller.RegisterViewControllerService;

/**
 * Created by Administrator on 2016-11-18.
 */
public class RegisterViewControllerSerivceImpl implements RegisterViewControllerService{

    private AccountBlService accountBlService ;  //下层

    private static RegisterViewControllerSerivceImpl registerImpl;   //本层

    public static RegisterViewControllerSerivceImpl getInstance(){
        if(registerImpl == null)
            registerImpl = new RegisterViewControllerSerivceImpl() ;
        return registerImpl ;
    }

    private RegisterViewControllerSerivceImpl(){
        accountBlService = AccountBlServiceImpl.getInstance();
    }

    public String register(String memberName, String password) throws RemoteException{
        return accountBlService.register(memberName,password);
    }
}
