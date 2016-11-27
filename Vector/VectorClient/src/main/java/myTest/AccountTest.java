package myTest;

import java.rmi.RemoteException;

import common.AccountType;
import common.ResultMessage;
import presentation.controller.LoginViewControllerService;
import presentation.controller.RegisterViewControllerService;
import presentation.controller.Impl.*;

/**
 * updated by lienming on 2016-11-27.
 */
/*  由 presentation 层的 RegisterViewControllerServiceImpl 发起调用注册功能
*/
public class AccountTest {

    LoginViewControllerService loginImpl = LoginViewControllerServiceImpl.getInstance();

    RegisterViewControllerService registerImpl = RegisterViewControllerSerivceImpl.getInstance();
    
	
     /* test1 : RegisterTest
     * 测试用例1：输入合法，且输入的账号不存在，期望返回值：新用户的ID(注册成功)
     * 测试用例2：输入合法，且输入的账号已存在，期望返回值："FAIL"(用户名已存在导致注册失败)
     * 测试用例3: 输入账号不合法，期望值："FAIL" (输入非法导致注册失败)
     * 测试用例4: 输入密码不合法，期望值："FAIL" (输入非法导致注册失败)
     */
	 String[] registerName    ={"Mao"    ,"XiJinPing",""      ,"123456"};
	 String[] registerPassword={"123456" ,"123457"   ,"123456",""      };
	 String[] resultExpected  = {"FAIL"  , "SUC"     ,"FAIL"  ,"FAIL"  };
	 
	 public void testRegister() throws RemoteException{
		 for(int i=0;i<4;i++){
			 System.out.println(register(registerName[i],registerPassword[i])+" - "+
					 				resultExpected[i]);
		 }
	 }
	 
	 String register(String memberName,String password ) throws RemoteException{
          String result = registerImpl.register(memberName,password)  ;
          return result;
     }

	 
	 
     /* test2 : LoginTest
	  /*
      * 测试登入功能
      * 测试用例1：输入合法，且账号/密码均正确，且账号未登入，期望返回值：该用户类型（登入成功)
      * 测试用例2：输入合法，且账号/密码均正确，且账号已登入，期望返回值：FAIL
      * 测试用例3：输入合法，且账号名不存在，期望返回值：FAIL
      * 测试用例4：输入合法，且账号名存在，但密码与对应的账号名不正确，期望返回值：FAIL
      */
     AccountType login(String memberName,String password) {
         AccountType result = loginImpl.login(memberName,password);
         return result;
     }
     
     public void testLogin() {
        String[] loginName   = {"N00006","N00005","N00006","N00000"};
        String[] loginPassword={"12345R6","123456","123456","asdfgh"};

        for(int i=0;i<loginName.length;i++) {
            System.out.println("Account Login test " + i + ":" + 
            login(loginName[i], loginPassword[i]) );
        }
     }
     
     /* test3 : LogoutTest
     /*
      * 测试登出功能
      * 测试用例1：登出，期望返回值：ResultMessage.SUCCEED
      */
     ResultMessage logout(String id) throws RemoteException{
         ResultMessage message = loginImpl.logout(id);
         return message;
     }

     public void testLogout() throws RemoteException{
          String logoutId= "N0000";
          System.out.println( logout(logoutId) );
     }


     /* test4 : modify */
     ResultMessage modify(String id,String newPassword){
    	 return registerImpl.modify(id, newPassword);
     }
     
     public void testModify() throws RemoteException{
    	 String id = "N00008", newPassword="ssssss";
    	 System.out.println( modify(id,newPassword) );
     }
     
}


         /*
          * 测试登入功能
          * 测试用例1：输入合法，且账号/密码均正确，且账号未登入，期望返回值：该用户的ID(Value>0，登入成功)
          * 测试用例2：输入合法，且账号/密码均正确，且账号已登入，期望返回值：-2
          * 测试用例3：输入合法，且账号名不存在，期望返回值：-4
          * 测试用例4：输入合法，且账号名存在，但密码与对应的账号名不正确，期望返回值：-3
          */
/*
         String[] loginName   = {"N00006","N00006","N00006","N00000"};
         String[] loginPassword={"12345R6","123456","123456","asdfgh"};

         for(int i=0;i<loginName.length;i++) {
             System.out.print("Account Login test " + i + ":");
             AccountTest.testLogin(loginName[i], loginPassword[i]);
         }
*/

        /*
         * 测试登出功能
         * 测试用例1：登出，期望返回值：ResultMessage.SUCCEED
         */
/*
          String logoutId= "N00006";

          AccountTest.testLogout(logoutId);
*/


  /*   }*/
}
