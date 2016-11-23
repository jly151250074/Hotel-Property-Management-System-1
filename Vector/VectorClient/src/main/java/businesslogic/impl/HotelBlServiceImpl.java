package businessLogic.impl;

import java.util.ArrayList;

import businessLogic.service.HotelBlService;
import common.ResultMessage;
import common.RoomType;
import dataService.dao.service.HotelDao;
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

	

	public ResultMessage showhotelInfo() {
		return null;
	}


	public int getReadyRoom() {
		return 0;
	}


	public void comment(String giveComment) {
		
	}

	public ArrayList<String> getComment() {
		return null;
	}


	public void givePoStrings(double poStrings) {
		
	}


	public double getPoStrings() {
		return 0;
	}

	public String getInBusiness() {
		return null;
	}


	public int getOriginPrice(RoomType Type) {
		return 0;
	}

}
