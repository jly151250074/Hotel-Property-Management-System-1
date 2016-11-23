package dataService.dao.impl;

import common.ResultMessage;
import dataService.dao.service.MemberDao;
import vo.MemberVo;

import java.rmi.RemoteException;

/*
*注：必须在PMS里有这个对应的Impl，RMI的调用才能成功
*这个Impl为空
*/
public class MemberDaoImpl implements MemberDao {

    @Override
    public int getCredit(String id) throws RemoteException {
        return 0;
    }

    @Override
    public ResultMessage chargeCredit(String id, int amount) throws RemoteException {
        return null;
    }

    @Override
    public MemberVo getInfo(String id) throws RemoteException {
        return null;
    }

    @Override
    public ResultMessage modifyInfo(String id, MemberVo vo) throws RemoteException {
        return null;
    }
}