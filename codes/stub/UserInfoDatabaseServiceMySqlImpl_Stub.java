public class UserInfoDataServiceMySqlImpl_Stub implements UserInfoDatabaseService {

    public UserInfoDataServiceMySqlImpl_Stub() {}

    public void insert(UserInfoPO po) {
        System.out.println("Insert Succeed!");
    }

    public void delete(UserInfoPO po) {
        System.out.println("Delete Succeed!");
    }

    public void update(UserInfoPO po) {
        System.out.println("Update Succeed!");
    }

    public UserInfoPO find(String id) {
        System.out.println("Find Succeed!");
        UserInfoPO po = new UserInfoPO();
        return po;
    }
}
