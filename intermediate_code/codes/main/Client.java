public class Client {
    public static void main(String[] args) {
        UserInfoBLService  userInfoBLServiceController = new UserInfoController();
        UserInfoBLService_Driver userBLService_driver = new UserInfoBLService_Driver();
        userBLService_driver.drive(userInfoController);

        AccountBLService accontController = new AccountController();
        AccountBLService_Driver accountBLService_driver = new AccountBLService_Driver();
		    accountBLService_driver.drive(accontController);

        OrderBLService orderController = new OrderController();
        OrderBLService_Driver orderBLService_driver = new OrderBLService_Driver();
		    orderBLService_driver.drive(orderController);

        PromotionBLService promotionController = new PromotionController();
        PromotionBLService_Driver promotionBLService_driver = new PromotionBLService_Driver();
		    promotionBLService_driver.drive(promotionController);

        HotelBLservice hotelController = new hotelController();
        HotelBLservice_Driver hotelBLservice_Driver = new HotelBLservice_Driver();
        hotelBLservice_Driver.drive(hotelController);
    }

}
