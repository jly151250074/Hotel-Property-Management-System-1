
public class HotelBLservice_Stub {
	String hotelName;
	String hotelID;
	String hotelAddress;
	String inBusiness;
	String tel;
	String info;         //酒店简介
	String sort;
	ArrayList<HotelVO> hotelList;
	double poStrings;    //客户所给评分
	double points;       //酒店评分
	int readyRoom;       //空余房间数
	
	public HotelBLservice_Stub(String hn,String id,String ha,String inb,
			String t,String i,String s,ArrayList<HotelVO> hl,double ps,double po,int r){
		hotelName = hn;
		hotelID = id;
		hotelAddress = ha;
		inBusiness = inb;
		tel = t;
		info = i;
		sort = s;
		hotelList = hl;
		poStrings = ps;
		points = po;
		readyRoom = r;
	}
	//显示全部酒店
	public ArrayList<HotelVO> showHotelList(){
		return hotelList;
	}
	//显示某个酒店的具体信息（给客户查询用）
	public ResultMessage showHotelInfo(){
		return ResultMessage.SUCCEED;
	}
	//为酒店列表按分类排序
	public ArrayList<HotelVO> sortHotel(String sort,ArrayList<HotelVO> hotelList){
		if(sort == this.sort){
			return this.hotelList;
		}else{
			return null;
		}
	}
	//查找酒店（模糊查找）
	public ResultMessage findHotel(String info){
		if(info == this.info){
			return ResultMessage.SUCCEED;
		}else{
			return ResultMessage.FAILED;
		}
	}
	//显示酒店的空余房间数
	public int getReadyRoom(){
		return readyRoom;
	}
	//显示酒店的评分
	public double getPoStrings(double poString){
		if(poString == this.poStrings){
			return points;
		}else{
			return 0;
		}
	}
	
	
}
