package rmi;

import java.rmi.Remote;

import dataService.dao.AccountDao;
import dataService.dao.HotelDao;
import dataService.dao.MemberDao;

/**
 * Created by Administrator on 2016-11-20.
 */
public class RemoteHelper {

    private Remote remote;

    private static RemoteHelper remoteHelper = new RemoteHelper();

    public static RemoteHelper getInstance(){
        return remoteHelper;
    }

    private RemoteHelper(){
    }

    public void setRemote(Remote remote){
        this.remote = remote;
    }

    /* getDaoService 添加在下方  */
    public AccountDao getAccountDao(){
        return (AccountDao)remote;
    }

    public MemberDao getMemberDao(){
        return (MemberDao)remote;
    }
    
    public HotelDao getHotelDao(){
    	return (HotelDao) remote;
    }

}
