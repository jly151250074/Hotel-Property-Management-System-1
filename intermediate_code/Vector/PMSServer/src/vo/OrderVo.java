package vo;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * @author Molloh
 * @version 2016/11/13
 * @description
 */

public class OrderVo {
    private String orderId;

    public OrderVo(String orderId) {
        this.orderId = orderId;
    }

    /**
     * @return 订单编号
     */
    public String getOrderId() {
        return null;
    }

    /**
     * @return 订单用户编号
     */
    public String getOrderUser() {
        return null;
    }

    /**
     * @return 订单状态
     */
    public String getOrderStatus() {
        return null;
    }

    /**
     * @return 订单信息（房间类型 + 房间数量 + 酒店名称）
     */
    public String getOrderInfo() {
        return null;
    }

    public int getOrderPrice() {
        return 0;
    }


}
