package dao;

import common.ResultMessage;
import vo.MemberVo;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @ author lienming
 * @ version 2016/11/20
 * @ description
 */
public interface MemberDao extends Remote {

    public int getCredit(String id) throws RemoteException;

    public ResultMessage chargeCredit(String id, int amount) throws RemoteException;

    public MemberVo getInfo(String id) throws RemoteException;

    public ResultMessage modifyInfo(String id,MemberVo vo) throws RemoteException;


}
