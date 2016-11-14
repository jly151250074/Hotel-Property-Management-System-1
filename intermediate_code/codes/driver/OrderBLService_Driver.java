/*
* @Author: Aobang
* @Date:   2016-10-16 14:43:41
* @Last Modified by:   Aobang
* @Last Modified time: 2016-10-16 16:26:19
*/

public class OrderBLService_Driver {
    public void drive(OrderBLService orderBLService) {
    	ResultMessage result;

    	result = orderBLService.getInfo("00001");
    	if(result == ResultMessage.Exist)
    		System.out.println("OrderInfo here!");

    	result = orderBLService.submit();
    	if(result == ResultMessage.Exist)
    		System.out.println("Order submitted!");

    	result = orderBLService.cancel("00001");
    	if(result == ResultMessage.Exist)
    		System.out.println("Order canceled!");

    	result = orderBLService.execute("00001");
    	if(result == ResultMessage.Exist)
    		System.out.println("Order executed!");

    	result = orderBLService.recover("00001");
    	if(result == ResultMessage.Exist)
    		System.out.println("Order recovered!");

    	result = orderBLService.notExeAnalysis();
    	if(result == ResultMessage.Exist)
    		System.out.println("Orders Analysed!");

    	result = orderBLService.revoke("00001");
    	if(result == ResultMessage.Exist)
    		System.out.println("Order revoked!");
    }
}

public class Client{
	public static void main(String[] args) {
		OrderBLService orderController = new orderController();
		OrderBLService_Driver driver = new OrderBLService_Driver(orderController);
		driver.drive(orderBLService);
	}
}