package test;

import common.RoomType;
import org.junit.Before;
import org.junit.Test;
import service.impl.hotelbl.HotelServiceImpl;
import service.impl.orderBl.MemberOrderServiceImpl;
import service.impl.promotionBl.PromotionServiceImpl;
import service.service.hotelBlService.HotelService;
import service.service.orderBlService.MemberOrderService;
import service.service.promotionBlService.PromotionService;

import static org.junit.Assert.*;

/**
 * @ author Molloh
 * @ version 2016/11/13
 * @ description
 */
public class OrderTest {
    private MemberOrderService order;
    private PromotionService promotion;
    private HotelService hotel;

    @Before
    public void setUp() {
        promotion = new PromotionServiceImpl();
    }

    @Test
    public void testDiscountedPrice() {
        order = new MemberOrderServiceImpl(promotion);
        assertEquals(160, order.getDiscountedPrice(RoomType.SingleRoom));
    }

    @Test
    public void testOriginPrice() {
        hotel = new HotelServiceImpl();
        assertEquals(400, hotel.getOriginPrice(RoomType.DoubleRoom));
    }
}
