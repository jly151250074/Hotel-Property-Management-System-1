
public class HotelDataServiceMysqlImpl_Stub implements HotelDataService{
	
	public void insert(HotelPO po){
		System.out.println("Insert Succeed!");
	}
	
	public HotelPO find(String id){
		System.out.println("Find Succeed!");
		HotelPO po = new HotelPO();
		return po;
	}
	
	public void update(HotelPO po){
		System.out.println("Update Succeed!");
	}

	public void init(){
		System.out.println("Initialize Succeed!");
	}
	
	public void delete(String id){
		System.out.println("Delete Succeed!");
	}
	
	public ArrayList<HotelPO> show(){
		System.out.println("Show Succeed!");
		ArrayList<HotelPO> hList = new ArrayList<HotelPO>;
		return hList;
	}
	
	public String getName(){
		System.out.println("Get Name!");
		return null;
	}
	
	public String getAddress(){
		System.out.println("Get Address!");
		return null;
	}
	
	public String getBusiness(){
		System.out.println("Get Business!");
		return null;
	}
	
	public double getPoString(){
		System.out.println("Get Points!");
		return 0;
	}
	
	public int getReadyRoom(){
		System.out.println("Get Ready Room!");
		return 0;
	}
	
}
