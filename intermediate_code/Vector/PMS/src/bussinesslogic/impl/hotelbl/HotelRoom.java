package service.impl.hotelbl;

import common.RoomType;
import service.service.hotelBlService.HotelRoomService;

public class HotelRoom implements HotelRoomService {
	private RoomType type;
	private String roomID;
	private String startDate;
	private String endDate;
	private int price;

	@Override
	public void setRoomType(RoomType type) {
		this.type = type;
	}

	@Override
	public void setOriginalPrice(int price) {
		this.price = price;
	}
	
	public int getPrice(){
		return price;
	}

	@Override
	public String getRoomID() {
		return roomID;
	}

	public void setRoomID(String id){
		this.roomID = id;
	}
	
	@Override
	public void setCheckinDate(String date) {
		this.startDate = date;
	}

	@Override
	public void setCheckoutDate(String date) {
		this.endDate = date;
	}

}
