package presentation.controller;

import common.ResultMessage;

/**
 * @ author lienming
 * @ version 2016-11-27
 * @ description
 */
public interface RegisterViewControllerService {

    /**
     * 注册账号
     * @return id:String (or "FAIL")
     * @author lienming
     * @version 2016-11-27
     */
    public String register(String memberName,String password);

    public ResultMessage modify(String id,String newPassword);
}
