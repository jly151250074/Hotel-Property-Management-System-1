/*
* @Author: Aobang
* @Date:   2016-10-16 15:30:39
* @Last Modified by:   Aobang
* @Last Modified time: 2016-10-16 18:13:14
*/

public interface PromotionBLService {
	public PromotionVO getPromotionByID (int promotionID);
	public ArrayList<PromotionVO> getPromotionList(int promotionID);
	public ResultMessage add(int promotionID);
	public ResultMessage delete(int promotionID);
	public ResultMessage update(int promotionID);
	public ResultMessage editStartDate(Date date);
	public ResultMessage editEndDate(Date date);
	public ResultMessage editRoomNum(int number);
	public ResultMessage editDiscount(int amount);
	public ResultMessage editDescription(String description);
	public ResultMessage editLevelCredit(int credit);
}