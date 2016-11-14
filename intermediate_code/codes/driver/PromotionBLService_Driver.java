/*
* @Author: Aobang
* @Date:   2016-10-16 14:44:17
* @Last Modified by:   Aobang
* @Last Modified time: 2016-10-16 19:24:05
*/

public class PromotionService_Driver{
    public void drive(PromotionService promotionService) {
    	ResultMessage result;

    	result = PromotionService.add(1);
    	if(result == ResultMessage.Exist)
    		System.out.println("Promotion added!");

    	result = PromotionService.delete(1);
    	if(result == ResultMessage.Exist)
    		System.out.println("Promotion deleted!");

    	result = PromotionService.update(1);
    	if(result == ResultMessage.Exist)
    		System.out.println("Promotion updated!");

    	result = PromotionService.editStartDate("2016-10-16 17:40");
    	if(result == ResultMessage.Exist)
    		System.out.println("StartDate added!");

    	result = PromotionService.editEndDate("2016-10-17 17:40");
    	if(result == ResultMessage.Exist)
    		System.out.println("EndDate added!");

    	result = PromotionService.editRoomNum(1);
    	if(result == ResultMessage.Exist)
    		System.out.println("RoomNum added!");

    	result = PromotionService.editDiscount(50);
    	if(result == ResultMessage.Exist)
    		System.out.println("EndDate added!");

    	result = PromotionService.editDescription("test");
    	if(result == ResultMessage.Exist)
    		System.out.println("Description added!");

    	result = PromotionService.editLevelCredit(100);
    	if(result == ResultMessage.Exist)
    		System.out.println("Credit added!");
    }
}

public class Client{
	public static void main(String[] args) {
		PromotionBLService promotionController = new PromotionController();
		PromotionBLService_Driver driver = new PromotionBLService_Driver(promotionController);
		driver.drive(promotionBLService);
	}
}