package service.impl.orderBl;

import common.ResultMessage;
import common.RoomType;
import service.impl.hotelbl.HotelServiceImpl;
import service.impl.promotionBl.PromotionServiceImpl;
import service.service.hotelBlService.HotelService;
import service.service.orderBlService.MemberOrderService;
import service.service.promotionBlService.PromotionService;
import vo.OrderVo;

import java.util.List;

/**
 * @author Molloh
 * @version 2016/11/13
 * @description
 */
public class MemberOrderServiceImpl implements MemberOrderService {
    private String memberId;

    private List<OrderVo> memberOrderList;
    private PromotionService webPromotion;
    private HotelService hotel;

    public MemberOrderServiceImpl(String memberId) {
        this.memberId = memberId;
        webPromotion = new PromotionServiceImpl();
        hotel = new HotelServiceImpl();
    }

    public MemberOrderServiceImpl(PromotionService webPromotion) {
        this.webPromotion = webPromotion;
        hotel = new HotelServiceImpl();
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
     * @param memberId
     * @return 获取异常订单列表
     */
    @Override
    public List<OrderVo> getAbnormalOrders(String memberId) {
        return null;
    }

    /**
     * @param orderId
     * @return 提交酒店订单
     */
    @Override
    public ResultMessage submit(String orderId) {
        return null;
    }

    /**
     * @param orderId
     * @return 删除酒店订单
     */
    @Override
    public ResultMessage delete(String orderId) {
        return null;
    }

    /**
     * @param memberId
     * @return 获取所有订单列表
     */
    @Override
    public List<OrderVo> getAllOrders(String memberId) {
        return null;
    }

    /**
     * @param memberId
     * @return 获取未执行订单列表
     */
    @Override
    public List<OrderVo> getUnfinishedOrders(String memberId) {
        return null;
    }

    /**
     * @param memberId
     * @return 获取已执行订单列表
     */
    @Override
    public List<OrderVo> getFinishedOrders(String memberId) {
        return null;
    }

    /**
     * @param memberId
     * @return 获取取消的订单列表
     */
    @Override
    public List<OrderVo> getCanceledOrders(String memberId) {
        return null;
    }

    /**
     * @return 打折后的订单价格
     */
    @Override
    public int getDiscountedPrice(RoomType roomType) {
        return webPromotion.getDiscountedPrice(hotel.getOriginPrice(roomType));
    }

}
