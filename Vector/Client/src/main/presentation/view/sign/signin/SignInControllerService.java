package presentation.view.sign.signin;

import common.ResultMessage;

/**
 * @author Molloh
 * @version 2016/11/17
 * @description
 */
public interface SignInControllerService {

    public void setView(SignInHelper signInHelper);

    /**
     * @return 登录身份验证
     */
    public ResultMessage signIn(String account, String password);


}
