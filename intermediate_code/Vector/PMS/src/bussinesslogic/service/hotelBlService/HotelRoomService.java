package service.service.hotelBlService;

import common.RoomType;

/**
 * @version 2016-11-13
 * @author ??????
 * @description ????????????
 *  ???????????????
 */
public interface HotelRoomService {

	public void setRoomType(RoomType type);
	
	public void setOriginalPrice(int price);
	
	public int getPrice();
	
	public String getRoomID();
	
	public void setCheckinDate(String date);
	
	public void setCheckoutDate(String date);
}
