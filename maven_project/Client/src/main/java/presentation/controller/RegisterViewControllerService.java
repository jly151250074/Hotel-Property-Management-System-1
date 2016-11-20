package presentation.controller;

import java.rmi.RemoteException;

import common.ResultMessage;

/**
 * @ author Molloh
 * @ version 2016/11/6
 * @ description
 */
public interface RegisterViewControllerService {

    /**
     * 注册账号
     * @return 注册账号是否成功
     * @author lienming
     * @version Oct 19, 2016
     */
    public String register(String memberName, String password) throws RemoteException;

}
