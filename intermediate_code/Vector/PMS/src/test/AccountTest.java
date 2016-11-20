package myTest;

import common.ResultMessage;
import presentation.controller.Impl.LoginViewControllerServiceImpl;
import presentation.controller.Impl.RegisterViewControllerSerivceImpl;
import presentation.controller.LoginViewControllerService;
import presentation.controller.RegisterViewControllerService;

/**
 * Created by Administrator on 2016-11-18.
 */
public class AccountTest {

     /*
     *  test1 : RegisterTest
     *  由 presentation 层的 RegisterViewControllerServiceImpl 发起调用注册功能
     */
     static void testRegister(String memberName,String password,int expected){
          RegisterViewControllerService test = RegisterViewControllerSerivceImpl.getInstance() ;
          int result = test.register(memberName,password)  ;
          if(expected>0)
              System.out.println(result>0);
          else
              System.out.println(result==expected);
      }

     /*
      * test2 : LoginTest
      * 由 presentation 层的 LoginViewControllerServiceImpl 发起调用登入功能
      */
     static void testLogin(String memberName,String password,int expected){
         LoginViewControllerService test = LoginViewControllerServiceImpl.getInstance();
         int result = test.login(memberName,password);
         if(expected>0)
             System.out.println(result>0);
         else
             System.out.println(result==expected);
     }

     /*
      * test3 : LogoutTest
      * 由 presentation 层的 LoginViewControllerServiceImpl 发起调用登出功能
      */
     static void testLogout(int id){
         LoginViewControllerService test = LoginViewControllerServiceImpl.getInstance();
         ResultMessage message = test.logout(id);
         System.out.println(message);
     }

     public static void main(String[] args){

         /**
          * 测试注册功能
          * 测试用例1：输入合法，且输入的账号不存在，期望返回值：新用户的ID(value>0,注册成功)
          * 测试用例2：输入合法，且输入的账号已存在，期望返回值：-2(用户名已存在导致注册失败)
          * 测试用例3: 输入账号不合法，期望值：-1 (输入非法导致注册失败)
          * 测试用例4: 输入密码不合法，期望值：-1 (输入非法导致注册失败)
          */
         /*
         String[] registerName    ={"newMember","newMember",""      ,"123456"};
         String[] registerPassword={"123456"   ,"123457"   ,"123456",""      };
         int[] registerExpected           ={1          ,-2         ,-1      ,-1      };
         for(int i=0;i<registerName.length;i++){
             System.out.print("Account Register test "+i+":");
             AccountTest.testRegister(registerName[i],registerPassword[i],registerExpected[i]);
         }
         */


         /**
          * 测试登入功能
          * 测试用例1：输入合法，且账号/密码均正确，且账号未登入，期望返回值：该用户的ID(Value>0，登入成功)
          * 测试用例2：输入合法，且账号/密码均正确，且账号已登入，期望返回值：-2
          * 测试用例3：输入合法，且账号名不存在，期望返回值：-4
          * 测试用例4：输入合法，且账号名存在，但密码与对应的账号名不正确，期望返回值：-3
          */
        /*
         String[] loginName   = {"admin1","admin2","AAdmin","admin1"};
         String[] loginPassword={"123456","123456","123456","asdfgh"};
         int[]    loginExpected={1       ,-2      ,-4      , -3     };
         for(int i=0;i<loginName.length;i++){
             System.out.print("Account Login test "+i+":");
             AccountTest.testLogin(loginName[i],loginPassword[i],loginExpected[i]);
         }
        */

        /*
         * 测试登出功能
         * 测试用例1：登出，期望返回值：ResultMessage.SUCCEED
         */
          int logoutId = 1;

          AccountTest.testLogout(logoutId);



     }
}
