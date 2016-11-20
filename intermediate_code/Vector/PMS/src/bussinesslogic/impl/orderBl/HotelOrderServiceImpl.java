package service.impl.orderBl;

import common.ResultMessage;
import service.service.orderBlService.HotelOrderService;
import vo.OrderVo;

import java.util.List;

/**
 * @ author Molloh
 * @ version 2016/11/13
 * @ description
 */
public class HotelOrderServiceImpl implements HotelOrderService {
    private String orderId;
    private OrderVo hotelOrder;

    public HotelOrderServiceImpl(String orderId) {
        this.orderId = orderId;
        hotelOrder = new OrderVo(this.orderId);
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
        return 0;
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
     * @param Id
     * @return 获取异常订单列表
     */
    @Override
    public List<OrderVo> getAbnormalOrders(String Id) {
        return null;
    }

    /**
     * @param orderId
     * @return 恢复过期订单（客户信用值）
     */
    @Override
    public ResultMessage recover(String orderId) {
        return null;
    }

    /**
     * @param orderId
     * @return 执行订单
     */
    @Override
    public ResultMessage execute(String orderId) {
        return null;
    }

    /**
     * @param hotelId
     * @return 获取所有订单列表
     */
    @Override
    public List<OrderVo> getAllOrders(String hotelId) {
        return null;
    }

    /**
     * @param hotelId
     * @return 获取未执行订单列表
     */
    @Override
    public List<OrderVo> getUnfinishedOrders(String hotelId) {
        return null;
    }

    /**
     * @param hotelId
     * @return 获取已执行订单列表
     */
    @Override
    public List<OrderVo> getFinishedOrders(String hotelId) {
        return null;
    }
}
