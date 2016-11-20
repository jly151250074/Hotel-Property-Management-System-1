package businesslogic.impl;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import businesslogic.HotelListService;
import dataService.dao.HotelDao;
import po.HotelPo;
import rmi.RemoteHelper;
import vo.HotelVo;

public class HotelListServiceImpl implements HotelListService{
	private List<HotelVo> hotelList = new ArrayList<HotelVo>();
	private HotelDao hotelDao;
	private static HotelListServiceImpl hotelListServiceImpl;
  
    public static HotelListServiceImpl getInstance(){
        if( hotelListServiceImpl == null)
        	hotelListServiceImpl = new HotelListServiceImpl() ;
        return hotelListServiceImpl;
    }

    private HotelListServiceImpl(){
        hotelDao = RemoteHelper.getInstance().getHotelDao();
    }
    
	@Override
	public List<HotelVo> showHotelList() {
		return hotelList;
	}

	@Override
	public void sortByName(boolean isRise) {
		if(isRise){
            hotelList.sort((HotelVo h1,HotelVo h2) -> h1.getHotelName().compareTo(h2.getHotelName()));
        } else {
            hotelList.sort((HotelVo h1,HotelVo h2) -> h2.getHotelName().compareTo(h1.getHotelName()));
        }
	}

	@Override
	public void sortByStar(boolean isRise) {
		if(isRise){
			Collections.sort(hotelList, new Comparator<HotelVo>() {
				@Override
				public int compare(HotelVo h1, HotelVo h2) {
					int star1 = h1.getStars();
					int star2 = h2.getStars();
					if(star1 - star2 > 0) return 1;
					if(star1 - star2 < 0) return -1;
					else return 0;
				}
			});
		}else{
			Collections.sort(hotelList, new Comparator<HotelVo>() {
				@Override
				public int compare(HotelVo h1, HotelVo h2) {
					int star1 = h1.getStars();
					int star2 = h2.getStars();
					if(star2 - star1 > 0) return 1;
					if(star2 - star1 < 0) return -1;
					else return 0;
				}
			});
		}
	}

	@Override
	public void sortByPoint(boolean isRise) {
		if(isRise){
			Collections.sort(hotelList, new Comparator<HotelVo>() {
				@Override
				public int compare(HotelVo h1, HotelVo h2) {
					double p1 = h1.getPoStrings();
					double p2 = h2.getPoStrings();
					if(p1 - p2 > 0) return 1;
					if(p1 - p2 < 0) return -1;
					else return 0;
				}
			});
		}else{
			Collections.sort(hotelList, new Comparator<HotelVo>() {
				@Override
				public int compare(HotelVo h1, HotelVo h2) {
					double p1 = h1.getPoStrings();
					double p2 = h2.getPoStrings();
					if(p2 - p1 > 0) return 1;
					if(p2 - p1 < 0) return -1;
					else return 0;
				}
			});
		}
	}

	@Override
	public void sortByPrice(boolean isRise) {
		if(isRise){
			Collections.sort(hotelList, new Comparator<HotelVo>() {
				@Override
				public int compare(HotelVo h1, HotelVo h2) {
					double p1 = h1.getOriginPrice();
					double p2 = h2.getOriginPrice();
					if(p1 - p2 > 0) return 1;
					if(p1 - p2 < 0) return -1;
					else return 0;
				}
			});
		}else{
			Collections.sort(hotelList, new Comparator<HotelVo>() {
				@Override
				public int compare(HotelVo h1, HotelVo h2) {
					double p1 = h1.getOriginPrice();
					double p2 = h2.getOriginPrice();
					if(p2 - p1 > 0) return 1;
					if(p2 - p1 < 0) return -1;
					else return 0;
				}
			});
		}
	}

	@Override
	public List<HotelPo> findHotel(String key) {
		try {
			return hotelDao.keyFind(key);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<HotelVo> findByPoint(double least, double max) {
		List<HotelVo> findList = new ArrayList<HotelVo>();
		for(HotelVo hotel : hotelList){
			if(hotel.getPoStrings() >= least && hotel.getPoStrings() <= max){
				findList.add(hotel);
			}
		}
		return findList;
	}

	@Override
	public List<HotelVo> findByStars(int least, int max) {
		List<HotelVo> findList = new ArrayList<HotelVo>();
		for(HotelVo hotel : hotelList){
			if(hotel.getStars() >= least && hotel.getStars() <= max){
				findList.add(hotel);
			}
		}
		return findList;
	}

	public void addHotel(HotelVo hotel){
		hotelList.add(hotel);
	}
}
