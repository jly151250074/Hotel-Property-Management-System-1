/*
* @Author: Aobang
* @Date:   2016-10-16 11:01:50
* @Last Modified by:   Aobang
* @Last Modified time: 2016-10-16 22:08:32
*/

public class OrderBLService_Stub implements OrderBLService {
	String orderId;
	String memberId;
	Date submitDate;
	Date checkinDate;
	Date checkoutDate;
	String hotel;
	int numberOfRooms;
	int amount;
	int numberOfPeople;
	boolean child;
	Promotion promotion;

	public OrderBLService_Stub(String oId, String mId, Date sDate, Date inDate,
		Date outDate, String hotel, int nr, int amount, int np, boolean child, Promotion promotion) {
		orderId = oId;
		memberId = mId;
		submitDate = sDate;
		checkinDate = inDate;
		checkoutDate = outDate;
		this.hotel = hotel;
		numberOfRooms = nr;
		this.amount = amount;
		numberOfPeople = np;
		this.child = child;
		this.promotion = promotion;
	}

	public OrderVO getOrderByID (String orderId) {
		return new OrderVO(orderId);
	}

	public PromotionVO getPromotionByID (String orderId) {
		return new PromotionVO(orderId);
	}

	public RessultMessage getInfo(String orderId) {
		if(orderId == "00001")
			return RessultMessage.Exist;
		else
			return RessultMessage.NotExist;
	}

	public RessultMessage submit() {
		return RessultMessage.Exist;
	}

	public RessultMessage cancel(String orderId) {
		if(orderId == "00001")
			return RessultMessage.Exist;
		else
			return RessultMessage.NotExist;
	}

	public RessultMessage execute(String orderId) {
		if(orderId == "00001")
			return RessultMessage.Exist;
		else
			return RessultMessage.NotExist;
	}

	public RessultMessage recover(String orderId) {
		if(orderId == "00001")
			return RessultMessage.Exist;
		else
			return RessultMessage.NotExist;
	}

	public RessultMessage notExeAnalysis() {
		return RessultMessage.Exist;
	}

	public RessultMessage revoke(String orderId) {
		if(orderId == "00001")
			return RessultMessage.Exist;
		else
			return RessultMessage.NotExist;
	}
}
