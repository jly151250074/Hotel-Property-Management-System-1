package dataService.dao.impl;

import common.AccountType;
import common.ResultMessage;
import dataService.dao.service.AccountDao;
import po.AccountPo;

import java.rmi.RemoteException;

/*
*注：必须在PMS里有这个对应的Impl，RMI的调用才能成功
*这个Impl为空
*/
public class AccountDaoImpl implements AccountDao{

    @Override
    public AccountType login(String id, String password) throws RemoteException {
        return null;
    }

    @Override
    public ResultMessage logout(String id) throws RemoteException {
        return null;
    }

    @Override
    public String register(String memberName, String password) throws RemoteException {
        return null;
    }

    @Override
    public ResultMessage modify(String id, String newPassword) throws RemoteException {
        return null;
    }

    @Override
    public ResultMessage find(String id) throws RemoteException {
        return null;
    }

    @Override
    public ResultMessage insert(AccountPo po) throws RemoteException {
        return null;
    }

    @Override
    public ResultMessage update(AccountPo po) throws RemoteException {
        return null;
    }

    @Override
    public ResultMessage delete(AccountPo po) throws RemoteException {
        return null;
    }
}