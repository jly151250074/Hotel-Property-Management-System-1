/*
* @Author: Aobang
* @Date:   2016-10-16 20:00:48
* @Last Modified by:   Aobang
* @Last Modified time: 2016-10-16 20:02:42
*/

public class PromotionDatabaseServiceMySqlImpl_Stub implements PromotionDatabaseService {

    public PromotionDatabaseServiceMySqlImpl_Stub() {}

    public void insert(PromotionPO po) {
        System.out.println("Insert Succeed!\n");
    }

    public void delete(PromotionPO po) {
        System.out.println("Delete Succeed!\n");
    }

    public void update(PromotionPO po) {
        System.out.println("Update Succeed!\n");
    }

    public PromotionPO find(String promotionID) {
        System.out.println("Find Succeed!\n");
        PromotionPO po = new PromotionPO();
        return po;
    }
}