public class Client {
    public static void main(String[] args) {
        UserInfoBLService  UserInfoBLServiceController = new UserInfoController();
        UserInfoBLService_Driver driver = new UserInfoBLService_Driver();
        driver.drive(UserInfoController);
    }
    
    AccountBLService accontController = new AccountBLService();
        AccountBLService_Driver accountBLService_driver= new AccountBLService_Driver(accountController);
		driver.drive(accontController);	
     }
}
