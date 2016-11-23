package dataService.dao.impl;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import common.ResultMessage;
import dataService.dao.service.HotelDao;
import dataService.dataHelper.service.DataFactory;
import dataService.dataHelper.service.HotelDataHelper;
import dataService.dataHelper.Impl.DataFactoryImpl;
import po.HotelPo;

public class HotelDaoImpl implements HotelDao{
	private Map<String, HotelPo> map;
	
	private HotelDataHelper hotelDataHelper;
	
	private DataFactory dataFactory;
	
	private static HotelDaoImpl hotelDataServiceImpl;
	
	public static HotelDaoImpl getInstance(){
		if(hotelDataServiceImpl == null){
			hotelDataServiceImpl = new HotelDaoImpl();
		}
		return hotelDataServiceImpl;
	}
	
	public HotelDaoImpl(){
		if(map == null){
			dataFactory = new DataFactoryImpl();
			hotelDataHelper = dataFactory.getHotelDataHelper();
			map = hotelDataHelper.getHotelData();
		}
	}

	@Override
	public ResultMessage addHotelPO(HotelPo po) throws RemoteException{
		if(!map.containsKey(po.getId())) {	    
			map.put(po.getId(), po);	   
			hotelDataHelper.updateHotelData(map);
			return ResultMessage.SUCCEED;   
		}
		else
			return ResultMessage.FAIL;
	}

	@Override
	public ResultMessage updateHotel(HotelPo po) throws RemoteException{
		String hotelId = po.getId();
		if(map.get(hotelId) != null){
			map.put(hotelId,po);
			hotelDataHelper.updateHotelData(map);
			return ResultMessage.SUCCEED;
		}
		return ResultMessage.FAIL;
	}

	@Override
	public ResultMessage deleteHotelPO(String hotelId) throws RemoteException{
		return hotelDataHelper.deleteHotelData(hotelId);
	}

	@Override
	public HotelPo findHotel(String hotelId) throws RemoteException{
		HotelPo po = new HotelPo();
		Iterator<Map.Entry<String,HotelPo>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()){
			Map.Entry<String, HotelPo> entry = iterator.next();
			po = entry.getValue();
			if(po.getId() == hotelId){
				return po;
			}
		}
		return null;
	}

	@Override
	public List<HotelPo> keyFind(String key) throws RemoteException{
		List<HotelPo> hotelList = new ArrayList<HotelPo>();
		Iterator<Map.Entry<String,HotelPo>> iterator = map.entrySet().iterator();
		
		while(iterator.hasNext()){
			Map.Entry<String, HotelPo> entry = iterator.next();
			HotelPo po = entry.getValue();
			if(po.showInfo().contains(key)){
				hotelList.add(po);
			}
		}
		return hotelList;
	}

	@Override
	public String getBusiness(String hotelId) throws RemoteException{
		HotelPo po = findHotel(hotelId);
		if(po != null){
			return po.getInBusiness();
		}
		return null;
	}
}