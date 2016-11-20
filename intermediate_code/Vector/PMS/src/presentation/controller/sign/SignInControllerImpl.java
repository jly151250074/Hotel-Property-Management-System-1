package presentation.controller.sign;

import bussinesslogic.service.AccountBlService;
import common.ResultMessage;
import javafx.stage.Stage;
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
        signInHelper = new SignInHelper(new SignInControllerImpl());
    }

    @Override
    public ResultMessage signIn(String account, String password) {
        return null;
    }

    @Override
    public void setView(Stage stage) {
        signInHelper.setView(stage);
    }
}
