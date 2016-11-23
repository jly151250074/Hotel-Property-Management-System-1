package dataService.dao.service;

import common.AccountType;
import common.ResultMessage;
import po.AccountPo;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @ author lienming
 * @ version 2016/11/20
 * @ description
 */
public interface AccountDao extends Remote {

    public AccountType login(String id, String password) throws RemoteException;

    public ResultMessage logout(String id) throws RemoteException ;

    public String register(String memberName,String password) throws RemoteException;

    public ResultMessage modify(String id,String newPassword) throws RemoteException;

    public ResultMessage find(String id) throws RemoteException;

    public ResultMessage insert(AccountPo po) throws RemoteException;

    public ResultMessage update(AccountPo po) throws RemoteException;

    public ResultMessage delete(AccountPo po) throws RemoteException;

}
