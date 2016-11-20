package presentation.controller;

import java.rmi.RemoteException;

import common.AccountType;
import common.ResultMessage;

/**
 * Created by Molloh on 2016/11/5.
 */
public interface LoginViewControllerService {
    /**
     * 用户账号登录
     * @return 账号登录是否成功，成功返回用户Id,输入非法返回-1,已登入返回-2，账号名或密码错误返回-3，账号不存在返回-4
     * @author lienming
     * @version Oct 19, 2016
     * @throws RemoteException 
     */
    public AccountType login(String memberName, String password) throws RemoteException;

    public ResultMessage logout(String id) throws RemoteException;

}
