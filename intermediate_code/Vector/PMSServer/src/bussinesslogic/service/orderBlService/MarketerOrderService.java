package service.service.orderBlService;

import common.ResultMessage;

/**
 * @ author Molloh
 * @ version 2016/11/13
 * @ description
 */
public interface MarketerOrderService extends OrderService {
    /**
     * @param orderId
     * @return 撤销异常订单（网站营销人员）
     */
    public ResultMessage revoke(String orderId);
}
