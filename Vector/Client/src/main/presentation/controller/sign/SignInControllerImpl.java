package presentation.controller.sign;

import businesslogic.AccountBlService;
import businesslogic.impl.AccountBlServiceImpl;
import common.ResultMessage;
import presentation.view.sign.signin.SignInControllerService;
import presentation.view.sign.signin.SignInHelper;

/**
 * @author Molloh
 * @version 2016/11/17
 * @description
 */
public class SignInControllerImpl implements SignInControllerService {

    private AccountBlService accountService;
    private SignInHelper signInHelper;

    public SignInControllerImpl() {
        //accountService = new AccountBlServiceImpl();
    }

    @Override
    public void setView(SignInHelper signInHelPer) {
        this.signInHelper = signInHelPer;
    }

    @Override
    public ResultMessage signIn(String account, String password) {
        //return accountService.login(account, password);
        return null;
    }

}
