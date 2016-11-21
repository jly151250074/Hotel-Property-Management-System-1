package rmi;

import common.AccountType;
import common.ResultMessage;
import dataService.dao.AccountDao;
import dataService.dao.HotelDao;
import dataService.dao.Impl.AccountDaoImpl;
import dataService.dao.Impl.HotelDaoImpl;
import po.AccountPo;
import po.HotelPo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 * Created by Administrator on 2016-11-20.
 */
public class DataRemoteObject extends UnicastRemoteObject implements AccountDao{

	 
	private static final long serialVersionUID = 1L;

    private AccountDao accountDao;
    private HotelDao  hotelDao;

    protected DataRemoteObject() throws RemoteException{
        accountDao = AccountDaoImpl.getInstance();
        hotelDao = HotelDaoImpl.getInstance();
    }

    /*HotelDao 接口方法*/
	public ResultMessage addHotelPO(HotelPo po) throws RemoteException{
		return hotelDao.addHotelPO(po);
	}
	
	public ResultMessage updateHotel(HotelPo po) throws RemoteException{
		return hotelDao.updateHotel(po);
	}
	
	public ResultMessage deleteHotelPO(String hotelId) throws RemoteException{
		return hotelDao.deleteHotelPO(hotelId);
	}
	
	public HotelPo findHotel(String hotelId) throws RemoteException{
		return hotelDao.findHotel(hotelId);
	}
	
	public List<HotelPo> keyFind(String key) throws RemoteException{
		return hotelDao.keyFind(key);
	}

	public String getBusiness(String hotelId) throws RemoteException{
		return hotelDao.getBusiness(hotelId);
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
