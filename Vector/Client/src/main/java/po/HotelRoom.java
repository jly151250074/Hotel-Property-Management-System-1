package po;
import common.RoomType;

public class HotelRoom {
	private RoomType type;
	private String roomID;
	private String startDate;
	private String endDate;
	private int price;
	private String hotelId;
	private boolean isEmpty;

	public HotelRoom(String hotelId){
		this.hotelId = hotelId;
	}

	public void setRoomType(RoomType type) {
		this.type = type;
	}
	
	public RoomType getRoomtype(){
		return type;
	}

	public void setOriginalPrice(int price) {
		this.price = price;
	}
	
	public int getPrice(){
		return price;
	}

	public String getRoomID() {
		return roomID;
	}

	public void setRoomID(String id){
		this.roomID = id;
	}
	
	public void setCheckinDate(String date) {
		this.startDate = date;
	}

	public String getCheckInDate(){
		return startDate;
	}
	
	public void setCheckoutDate(String date) {
		this.endDate = date;
	}
	
	public String getCheckOutdate(){
		return endDate;
	}
	
	public boolean getisEmpty(){
		return isEmpty;
	}
	
	public void setisEmpty(boolean bl){
		this.isEmpty = bl;
	}
}
