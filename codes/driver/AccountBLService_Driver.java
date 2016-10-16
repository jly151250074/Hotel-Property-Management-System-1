
public class AccountBLService_Driver {
	public void drive(AccountBLService accountBLService){
		ResultMessage result_register = accountBLService.register("admin","123456");
		if(result_register == ResultMessage.SUCCEED)
			System.out.println("Register succeed!");
		else
			System.out.println("Register failed!");
		
		ResultMessage result_checkMemberName = accountBLService.checkMemberName("admin");
		if(result_checkMemberName == ResultMessage.SUCCEED)
			System.out.println("Check MemberName succeed!");
		else
			System.out.println("Check MemberName failed!");
		
		ResultMessage result_checkInput = accountBLService.checkInput("123456");
		if(result_checkInput == ResultMessage.SUCCEED)
			System.out.println("Check Input succeed!");
		else
			System.out.println("Check Input failed!");
		
		ResultMessage result_modify = accountBLService.modify( 
								new AccountVO(new Account("admin","123456")) , "654321");
		if(result_modify == ResultMessage.SUCCEED)
			System.out.println("modify succeed!");
		else
			System.out.println("modify failed!");
		
		ResultMessage result_add = accountBLService.add(new AccountVO(new Account("admin","123456")));
		if(result_add == ResultMessage.SUCCEED)
			System.out.println("add succeed!");
		else
			System.out.println("add failed!");
		
		ResultMessage result_delete = accountBLService.delete(new AccountVO(new Account("admin","123456")));
		if(result_delete == ResultMessage.SUCCEED)
			System.out.println("delete succeed!");
		else
			System.out.println("delete failed!");
		
		ResultMessage result_login = accountBLService.login("admin","654321");
		if(result_login == ResultMessage.SUCCEED)
			System.out.println("login succeed!");
		else
			System.out.println("login failed!");
		
		ResultMessage result_logout = accountBLService.logout("admin");
		if(result_logout == ResultMessage.SUCCEED)
			System.out.println("logout succeed!");
		else
			System.out.println("logout failed!");
	}
}
