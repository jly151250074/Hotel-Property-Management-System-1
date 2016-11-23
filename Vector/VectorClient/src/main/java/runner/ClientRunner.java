package runner;

import rmi.RemoteHelper;

import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 * @ author lienming
 * @ version 2016/11/20
 * @ description 带RMI版的利用这个类，对自己写的方法进行了简单测试，写在这个类的main方法里
 */
public class ClientRunner {
    private RemoteHelper remoteHelper;

    public ClientRunner(){
        linkToServer();
    }

    private void linkToServer(){
        try{
            remoteHelper=RemoteHelper.getInstance();
            remoteHelper.setRemote(Naming.lookup("rmi://localhost:8888/DataRemoteObject"));
            System.out.println("get RemoteHelper SUCCEED,set Remote SUCCEED");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws RemoteException{
        new ClientRunner();

    }

}
