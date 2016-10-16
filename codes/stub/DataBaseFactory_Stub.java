public class DatabaseFactory_Stub implements DatabaseFactory {
      //抽象工厂
    public DataBaseFactory getUserInfoDatabase() {
        UserInfoDatabaseService userInfoData = new UserInfoDataServiceMySqlImpl_Stub();
        return userInfoData;
    }

    public DatabaseService getAccountDatabase(){
	      AccountDatabase accountData = new AccountDatabaseServiceMySqlImpl_Stub();
	      return accountData;
    }

    public DatabaseService getHotelDatabase(){
	      HotelDataService hotelData = new HotelDataServiceMysqlImpl_Stub();
	      return hotelData;
    }

}
