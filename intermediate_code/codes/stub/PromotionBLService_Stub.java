/*
* @Author: Aobang
* @Date:   2016-10-16 14:41:52
* @Last Modified by:   Aobang
* @Last Modified time: 2016-10-16 22:09:59
*/

public class PromotionBLService_Stub implements PromotionBLService {
	int promotionID;
	String name;
	Date startDate;
	Date endDate;
	int RoomNum;
	int amount;
	double rate;
	String description;
	int credit;

	public PromotionBLService_Stub(	String name, Date startDate, Date endDate,
		int RoomNum, int amount, double rate, String description, int credit) {
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDaate;
		this.RoomNum = RoomNum;
		this.amount = amount;
		this.rate = rate;
		this.description = description;
		this.credit = credit;
	}

	public PromotionVO getPromotionByID (int promotionID) {
		return new PromotionVO(promotionID);
	}

	public ArrayList<PromotionVO> getPromotionList(int promotionID) {
		ArrayList<PromotionVO> promotionList = new ArrayList<PromotionVO>();
		promotionList.add(new PromotionVO(promotionID));
		return promotionList;
	}

	public ResultMessage add(int promotionID) {
		if(promotionId == 1)
			return RessultMessage.Exist;
		else
			return RessultMessage.NotExist;
	}

	public ResultMessage delete(int promotionID) {
		if(promotionId == 1)
			return RessultMessage.Exist;
		else
			return RessultMessage.NotExist;
	}

	public ResultMessage update(int promotionID) {
		if(promotionId == 1)
			return RessultMessage.Exist;
		else
			return RessultMessage.NotExist;
	}

	public ResultMessage editStartDate(Date date) {
		if(date == "2016-10-16 17:40")
			return RessultMessage.Exist;
		else
			return RessultMessage.NotExist;
	}

	public ResultMessage editEndDate(Date date) {
		if(date == "2016-10-17 17:40")
			return RessultMessage.Exist;
		else
			return RessultMessage.NotExist;
	}

	public ResultMessage editRoomNum(int number) {
		if(number == 1)
			return RessultMessage.Exist;
		else
			return RessultMessage.NotExist;
	}

	public ResultMessage editDiscount(int amount) {
		if(amount == 50)
			return RessultMessage.Exist;
		else
			return RessultMessage.NotExist;
	}

	public ResultMessage editDescription(String description) {
		if(description == "test")
			return RessultMessage.Exist;
		else
			return RessultMessage.NotExist;
	}

	public ResultMessage editLevelCredit(int credit) {
		if(credit == 100)
			return RessultMessage.Exist;
		else
			return RessultMessage.NotExist;
	}
}