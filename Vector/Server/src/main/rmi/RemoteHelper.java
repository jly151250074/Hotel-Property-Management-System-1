package rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 * Created by Administrator on 2016-11-20.
 */
public class RemoteHelper {
    public RemoteHelper(){
        initServer();
    }

    public void initServer(){
        DataRemoteObject dataRemoteObject;
        try{
            dataRemoteObject = new DataRemoteObject();
            LocateRegistry.createRegistry(8888);
            Naming.bind("rmi://localhost:8888/DataRemoteObject",dataRemoteObject);
            System.out.println("Server linked");
        }catch (Exception e) {
            e.printStackTrace();
        }


    }
}
