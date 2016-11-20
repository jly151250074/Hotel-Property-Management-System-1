package data.dao.impl;

import common.ResultMessage;
import data.dao.OrderDao;
import po.OrderPo;

import java.util.List;

/**
 * @ author Molloh
 * @ version 2016/11/6
 * @ description
 */
public class OrderDaoImpl implements OrderDao{

    @Override
    public OrderPo getOrder(String orderId) {
        return null;
    }

    @Override
    public List<OrderPo> getOrders(String Id) {
        return null;
    }

    @Override
    public ResultMessage updateOrder(OrderPo orderPo) {
        return null;
    }

    @Override
    public ResultMessage addOrderPo(OrderPo orderPo) {
        return null;
    }

    @Override
    public ResultMessage deleteOrderPo(String orderId) {
        return null;
    }
}
