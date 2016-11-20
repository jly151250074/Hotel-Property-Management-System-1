package service.service.orderBlService;

import vo.OrderVo;

import java.util.List;

/**
 * @author Molloh
 * @version 2016/11/6
 * @description
 */
public interface OrderService {
    /**
     * @param orderId
     * @return	获取订单用户编号
     */
    public String getOrderUser(String orderId);

    /**
     * @param orderId
     * @return	获取订单价值
     */
    public int getOrderPrice(String orderId);

    /**
     * @param orderId
     * @return 获取订单时间
     */
    public String getOrderTime(String orderId);

    /**
     * @param Id
     * @return	获取异常订单列表
     */
    public List<OrderVo> getAbnormalOrders(String Id);
}