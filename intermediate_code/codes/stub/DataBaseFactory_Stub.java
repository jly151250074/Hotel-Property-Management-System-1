public class DatabaseFactory_Stub implements DatabaseFactory {
      //抽象工厂
    public DataBaseFactory getUserInfoData() {
        UserInfoDatabaseService userInfoData = new UserInfoDataServiceMySqlImpl_Stub();
        return userInfoData;
    }

    public DatabaseService getAccountData() {
	 AccountDatabase accountData = new AccountDatabaseServiceMySqlImpl_Stub();
	 return accountData;
    }

    public DatabaseService getHotelData() {
	 HotelDataService hotelData = new HotelDataServiceMysqlImpl_Stub();
	 return hotelData;
    }

    public DatabaseService getOrderData(){
	 OrderDataService orderData = new OrderDataServiceMysqlImpl_Stub();
	 return orderData;
    }

    public DatabaseService getPromotionData(){
	 PromotionDataService promotionData = new PromotionDataServiceMysqlImpl_Stub();
	 return promotionData;
    }

}
