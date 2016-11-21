package dataService.dataHelper;


import java.util.Map;

import common.ResultMessage;
import po.HotelPo;

/**
 * @ author 金灵益
 * @ version 2016/11/20
 * @ description
 */
public interface HotelDataHelper {
	/**
	 * @return	从数据文件中读取酒店数据
	 */
	public Map<String,HotelPo> getHotelData();
	
	/**
	 * 向数据文件中写入酒店数据
	 * @param list	
	 */
	public void updateHotelData(Map<String,HotelPo> map);
	
	/**
	 * 从数据文件中删除数据
	 * @param hotelId
	 */
	public ResultMessage deleteHotelData(String hotelId);
}