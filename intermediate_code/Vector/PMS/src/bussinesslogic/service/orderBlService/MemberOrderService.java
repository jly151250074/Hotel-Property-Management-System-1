package service.service.orderBlService;

import common.ResultMessage;
import common.RoomType;
import vo.OrderVo;

import java.util.List;

/**
 * @ author Molloh
 * @ version 2016/11/13
 * @ description
 */
public interface MemberOrderService extends OrderService {
    /**
     * @param orderId
     * @return 提交酒店订单
     */
    public ResultMessage submit(String orderId);

    /**
     * @param orderId
     * @return 删除酒店订单
     */
    public ResultMessage delete(String orderId);

    /**
     * @param memberId
     * @return	获取所有订单列表
     */
    public List<OrderVo> getAllOrders(String memberId);

    /**
     * @param memberId
     * @return	获取未执行订单列表
     */
    public List<OrderVo> getUnfinishedOrders(String memberId);

    /**
     * @param memberId
     * @return	获取已执行订单列表
     */
    public List<OrderVo> getFinishedOrders(String memberId);

    /**
     * @param memberId
     * @return 获取取消的订单列表
     */
    public List<OrderVo> getCanceledOrders(String memberId);

    /**
     * @param roomType
     * @return
     */
    public int getDiscountedPrice(RoomType roomType);
}
