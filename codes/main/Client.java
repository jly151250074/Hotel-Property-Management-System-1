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
    HotelBLservice hotelController = new HotelBLservice();
        HotelBLservice_Driver hotelBLservice_driver= new HotelBLservice_Driver();
		driver.drive(hotelController);	
     }
}
