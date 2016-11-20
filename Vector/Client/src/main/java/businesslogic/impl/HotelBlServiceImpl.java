package businesslogic.impl;

import java.util.ArrayList;

import businesslogic.HotelBlService;
import common.ResultMessage;
import common.RoomType;
import dataService.dao.HotelDao;
import rmi.RemoteHelper;

public class HotelBlServiceImpl implements HotelBlService{

	private HotelDao hotelDao;
	private static HotelBlServiceImpl hotelBlServiceImpl;
  
    public static HotelBlServiceImpl getInstance(){
        if( hotelBlServiceImpl == null)
        	hotelBlServiceImpl = new HotelBlServiceImpl() ;
        return hotelBlServiceImpl;
    }

    private HotelBlServiceImpl(){
        hotelDao = RemoteHelper.getInstance().getHotelDao();
    }

	
	@Override
	public ResultMessage showhotelInfo() {
		return null;
	}

	@Override
	public int getReadyRoom() {
		return 0;
	}

	@Override
	public void comment(String giveComment) {
		
	}

	@Override
	public ArrayList<String> getComment() {
		return null;
	}

	@Override
	public void givePoStrings(double poStrings) {
		
	}

	@Override
	public double getPoStrings() {
		return 0;
	}

	@Override
	public String getInBusiness() {
		return null;
	}

	@Override
	public int getOriginPrice(RoomType Type) {
		return 0;
	}

}
