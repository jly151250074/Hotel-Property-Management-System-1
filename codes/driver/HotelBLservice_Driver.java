
public class HotelBLservice_Driver {
	public void drive(HotelBLservice hotelBLservice){
		ResultMessage result_Show = hotelBLservice.showHotelInfo();
		if(result_Show == ResultMessage.SUCCEED){
			System.out.println("Show Succeed!");
		}else{
			System.out.println("Show Failed");
		}
		
		ResultMessage result_Find = hotelBLservice.findHotel("001");
		if(result_Find == ResultMessage.SUCCEED){
			System.out.println("Find Succeed!");
		}else{
			System.out.println("Find Failed");
		}
		
		
	}
}
