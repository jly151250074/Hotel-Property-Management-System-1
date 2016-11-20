package service.impl.orderBl;

import common.ResultMessage;
import service.service.orderBlService.MarketerOrderService;
import vo.OrderVo;

import java.util.List;

/**
 * @ author Molloh
 * @ version 2016/11/13
 * @ description
 */
public class MarketerOrderServiceImpl implements MarketerOrderService {
    private String orderId;
    private OrderVo marketerOrder;

    public MarketerOrderServiceImpl(String orderId) {
        this.orderId = orderId;
        marketerOrder = new OrderVo(this.orderId);
    }
    /**
     * @param orderId
     * @return 获取订单用户编号
     */
    @Override
    public String getOrderUser(String orderId) {
        return null;
    }

    /**
     * @param orderId
     * @return 获取订单价值
     */
    @Override
    public int getOrderPrice(String orderId) {
        marketerOrder = new OrderVo(orderId);
        return marketerOrder.getOrderPrice();
    }

    /**
     * @param orderId
     * @return 获取订单时间
     */
    @Override
    public String getOrderTime(String orderId) {
        return null;
    }

    /**
     * @param orderId
     * @return 获取异常订单列表
     */
    @Override
    public List<OrderVo> getAbnormalOrders(String orderId) {
        return null;
    }

    /**
     * @param orderId
     * @return 撤销异常订单（网站营销人员）
     */
    @Override
    public ResultMessage revoke(String orderId) {
        return null;
    }
}
