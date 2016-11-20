package businesslogic;

import common.AccountType;
import common.ResultMessage;
import po.AccountPo;

import java.rmi.RemoteException;

/**
 * AccountBLService
 * @author lienming
 * @version Oct 16, 2016
 */


public interface AccountBlService {

	/* 1.interface to Member Client*/

	public AccountType login(String id, String password) throws RemoteException;

	public ResultMessage logout(String id) throws RemoteException;

	public String register(String memberName, String password) throws RemoteException;

	public ResultMessage modify(String id, String newPassword) throws RemoteException;

	public ResultMessage checkInput(String input) throws RemoteException;

	public ResultMessage find(String id) throws RemoteException;



	/* 2.interface to Manager Client  */



	public ResultMessage insert(AccountPo po) throws RemoteException;

	public ResultMessage update(AccountPo po) throws RemoteException;

	public ResultMessage delete(AccountPo po) throws RemoteException;

	

}
