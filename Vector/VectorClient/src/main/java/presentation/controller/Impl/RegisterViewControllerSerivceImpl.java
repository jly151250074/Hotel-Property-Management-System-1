package presentation.controller.Impl;

import businesslogic.AccountBlService;
import businesslogic.impl.AccountBlServiceImpl;
import common.ResultMessage;
import presentation.controller.RegisterViewControllerService;

/**
 * Updated by lienming on 2016-11-27.
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

    @Override
    public String register(String memberName, String password){
        return accountBlService.register(memberName,password);
    }
    
    public ResultMessage modify(String id,String newPassword){
    	return accountBlService.modify(id, newPassword);
    }
}
