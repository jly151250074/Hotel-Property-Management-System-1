package runner;

import rmi.RemoteHelper;

/**
 * Created by Administrator on 2016-11-20.
 */
public class ServerRunner {

    public ServerRunner(){
        new RemoteHelper();
    }

    public static void main(String[] args){
        new ServerRunner();
    }

}
