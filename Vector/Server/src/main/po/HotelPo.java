package po;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import common.ResultMessage;
import common.RoomType;


public class HotelPo{
	private String hotelName;
	private String hotelID;
	private String hotelAddress;
	private String inBusiness;                                        //酒店所属商圈
	private String tel;                                               //酒店联系电话
	private String info;                                              //酒店简介
	private List<String> comments = new ArrayList<String>();          //酒店的所有文字评价
	private double points;                                            //酒店评分
	private int numOfpoint;                                           //酒店被评分的次数
	private int stars;                                                //酒店星级
	private Map<String,HotelRoom> map;
	
	public ResultMessage showhotelInfo(){
		return ResultMessage.SUCCEED;
	}

	public void comment(String giveComment){
		comments.add(giveComment);
	}
	
	public void setComment(List list){
		this.comments = list;
	}
	public List<String> getComment(){
		return comments;
	}

	public double getPoStrings(){
		return points;
	}
	
	public void givePoStrings(double poStrings){
		points = (points * numOfpoint + poStrings) / (numOfpoint+1);
		numOfpoint ++;
	}
	
	public String getInBusiness() {
		return inBusiness;
	}
	
	public int getOriginPrice(RoomType type){
		return 0;
	}
	
	public String showInfo(){
		return hotelName + " " + hotelID + " " + hotelAddress + " " +
			inBusiness + " " + tel + " " + info;
	}
	
	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	
	public String getId() {
		return hotelID;
	}

	public void setId(String hotelID) {
		this.hotelID = hotelID;
	}
	
	public String getHotelAddress() {
		return hotelAddress;
	}

	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}

	public void setInBusiness(String inBusiness) {
		this.inBusiness = inBusiness;
	}

	public void setHotelTel(String tel) {
		this.tel = tel;
	}

	public String getHotelTel() {
		return tel;
	}
	
	public void setHotelInfo(String info){
		this.info = info;
	}
	
	public String getHotelInfo(){
		return info;
	}
	
	public void setNumOfpoint(int p){
		this.numOfpoint = p;
	}

	public int getNumOfpoint(){
		return numOfpoint;
	}
	
	public void setPoints(double points){
		this.points = points;
	}
	
	public void setStars(int stars){
		this.stars = stars;
	}
	
	public int getStars(){
		return stars;
	}

	public Map<String, HotelRoom> getRoom(){
		return map;
	}
	
	public void setRooms(Map<String,HotelRoom> map){
		this.map = map;
	}
}