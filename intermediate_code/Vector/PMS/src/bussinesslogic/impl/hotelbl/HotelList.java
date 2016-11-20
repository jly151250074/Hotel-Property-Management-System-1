package service.impl.hotelbl;

import service.service.hotelBlService.HotelListService;
import vo.HotelVo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator; 

public class HotelList implements HotelListService {
	private List<HotelVo> hotelList = new ArrayList<HotelVo>();
	
	public List<HotelVo> showHotelList(){
		return hotelList;
	}

	public List<HotelVo> findHotel(String key){
		List<HotelVo> findList = new ArrayList<HotelVo>();
		for(HotelVo hotel : hotelList){
			if(hotel.showInfo().contains(key)){
				findList.add(hotel);
			}
		}
		return findList;
	}
	
	public List<HotelVo> findByPoint(double least,double max){
		List<HotelVo> findList = new ArrayList<HotelVo>();
		for(HotelVo hotel : hotelList){
			if(hotel.getPoStrings() >= least && hotel.getPoStrings() <= max){
				findList.add(hotel);
			}
		}
		return findList;
	}
	
	public List<HotelVo> findByStars(int least,int max){
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

	public void sortByName(boolean isRise) {
		if(isRise){
            hotelList.sort((HotelVo h1,HotelVo h2) -> h1.getHotelName().compareTo(h2.getHotelName()));
        } else {
            hotelList.sort((HotelVo h1,HotelVo h2) -> h2.getHotelName().compareTo(h1.getHotelName()));
        }
	}

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

	public void sortByPrice(boolean isRise) {
		if(isRise){
			Collections.sort(hotelList, new Comparator<HotelVo>() {
				@Override
				public int compare(HotelVo h1, HotelVo h2) {
					double p1 = h1.getPrice();
					double p2 = h2.getPrice();
					if(p1 - p2 > 0) return 1;
					if(p1 - p2 < 0) return -1;
					else return 0;
				}
			});
		}else{
			Collections.sort(hotelList, new Comparator<HotelVo>() {
				@Override
				public int compare(HotelVo h1, HotelVo h2) {
					double p1 = h1.getPrice();
					double p2 = h2.getPrice();
					if(p2 - p1 > 0) return 1;
					if(p2 - p1 < 0) return -1;
					else return 0;
				}
			});
		}
	}
	
}
