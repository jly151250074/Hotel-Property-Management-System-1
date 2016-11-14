/*
* @Author: Aobang
* @Date:   2016-10-16 19:44:48
* @Last Modified by:   Aobang
* @Last Modified time: 2016-10-16 19:49:02
*/

public class OrderDatabaseServiceMySqlImpl_Stub implements OrderDatabaseService {

    public OrderDatabaseServiceMySqlImpl_Stub() {}

    public void insert(OrderPO po) {
        System.out.println("Insert Succeed!\n");
    }

    public void delete(OrderPO po) {
        System.out.println("Delete Succeed!\n");
    }

    public void update(OrderPO po) {
        System.out.println("Update Succeed!\n");
    }

    public OrderPO find(String orderID) {
        System.out.println("Find Succeed!\n");
        OrderPO po = new OrderPO();
        return po;
    }
}