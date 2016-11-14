package service.impl.hotelbl;

import java.util.ArrayList;
import java.util.List;

public class HotelRoomList {
	List<HotelRoom> roomList;
	private int sumRoom;              //��������
	private int readyRoom;            //���෿����
	
	public HotelRoomList(){
		roomList = new ArrayList<HotelRoom>();
	}
	
	public void addRoom(HotelRoom room){
		roomList.add(room);
	}
	
	public int getReadyRoom(){
		return readyRoom;
	}
	
	public void setReadyRoom(int rooms){
		this.readyRoom = rooms;
	}
	
	public int getsumRoom(){
		return sumRoom;
	}
	
	public void setsumRoom(int rooms){
		this.sumRoom = rooms;
	}
}
