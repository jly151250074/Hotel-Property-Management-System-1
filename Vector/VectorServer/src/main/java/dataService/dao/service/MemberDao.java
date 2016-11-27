package dataService.dao;

import java.rmi.Remote;
import java.rmi.RemoteException;

import common.ResultMessage;
import vo.MemberVo;

/**
 * @ author lienming
 * @ version 2016-11-27
 * @ description
 */

/*
* 注意： id : int 全自行改为 String 类型
*/
public interface MemberDao extends Remote{

    public int getCredit(String id)throws RemoteException  ;

    public ResultMessage chargeCredit(String id, int amount)throws RemoteException ;

    public MemberVo getInfo(String id)throws RemoteException ;

    public ResultMessage modifyInfo( MemberVo vo)throws RemoteException ;


}
