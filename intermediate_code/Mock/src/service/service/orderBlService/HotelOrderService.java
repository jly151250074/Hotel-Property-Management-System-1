package service.service.orderBlService;

import common.ResultMessage;
import vo.OrderVo;

import java.util.List;

/**
 * @ author Molloh
 * @ version 2016/11/13
 * @ description
 */
public interface HotelOrderService extends OrderService {
    /**
     * @param orderId
     * @return 恢复过期订单（客户信用值）
     */
    public ResultMessage recover(String orderId);

    /**
     * @param orderId
     * @return 执行订单
     */
    public ResultMessage execute(String orderId);

    /**
     * @param hotelId
     * @return	获取所有订单列表
     */
    public List<OrderVo> getAllOrders(String hotelId);

    /**
     * @param hotelId
     * @return	获取未执行订单列表
     */
    public List<OrderVo> getUnfinishedOrders(String hotelId);

    /**
     * @param hotelId
     * @return	获取已执行订单列表
     */
    public List<OrderVo> getFinishedOrders(String hotelId);
}
