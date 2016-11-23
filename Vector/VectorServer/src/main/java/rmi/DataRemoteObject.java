package rmi;

import common.AccountType;
import common.ResultMessage;
import dataService.dao.service.AccountDao;
import dataService.dao.impl.AccountDaoImpl;
import po.AccountPo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by Administrator on 2016-11-20.
 */
public class DataRemoteObject extends UnicastRemoteObject implements AccountDao{

	 
	private static final long serialVersionUID = 1L;

    private AccountDao accountDao;

    protected DataRemoteObject() throws RemoteException{
        accountDao = AccountDaoImpl.getInstance();
    }


    /* AccountDao 接口方法 */
    public AccountType login(String id, String password) throws RemoteException{
        return accountDao.login(id,password);
    }

    public ResultMessage logout(String id) throws RemoteException{
        return accountDao.logout(id);
    }

    public String register(String memberName, String password) throws RemoteException{
        return accountDao.register(memberName,password);
    }

    public ResultMessage modify(String id, String newPassword) throws RemoteException{
        return accountDao.modify(id,newPassword);
    }

    public ResultMessage find(String id) throws RemoteException{
        return accountDao.find(id);
    }

    public ResultMessage insert(AccountPo po) throws RemoteException{
        return accountDao.insert(po);
    }

    public ResultMessage update(AccountPo po) throws RemoteException{
        return accountDao.update(po);
    }

    public ResultMessage delete(AccountPo po) throws RemoteException{
        return accountDao.delete(po);
    }



}
