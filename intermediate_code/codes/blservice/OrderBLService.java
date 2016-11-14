/*
* @Author: Aobang
* @Date:   2016-10-16 15:30:39
* @Last Modified by:   Aobang
* @Last Modified time: 2016-10-16 15:52:56
*/

public interface OrderBLService {
    public OrderVO getOrderByID (String orderId);
    public PromotionVO getPromotionByID (String orderId);
    public RessultMessage getInfo(String orderId);
    public RessultMessage submit();
    public RessultMessage cancel(String orderId);
    public RessultMessage execute(String orderId);
    public RessultMessage recover(String orderId);
	public RessultMessage notExeAnalysis();
	public RessultMessage revoke(String orderId);
}