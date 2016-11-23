package businessLogic.service;

import java.util.List;

import po.HotelPo;
import vo.HotelVo;

/**
 * @version 2016-11-20
 * @author 金灵益 
 * @description 酒店搜索，排序所需的服务
 */
public interface HotelListService {
	/**
	 * @version 2016-11-13
     * @author 金灵益 
	 * @return 返回酒店列表
	 */
	public List<HotelVo> showHotelList();

	/**
	 * @version 2016-11-13
     * @author 金灵益 
	 * @param isRise  升序排列
	 * @return   排列酒店名称
	 */
	public void sortByName(boolean isRise);
	
	/**
	 * @version 2016-11-13
     * @author 金灵益 
	 * @param isRise
	 * @return   排列酒店星级
	 */
	public void sortByStar(boolean isRise);
	
	/**
	 * @version 2016-11-13
     * @author 金灵益 
	 * @param isRise
	 * @return   排列酒店评分
	 */
	public void sortByPoint(boolean isRise);
	
	/**
	 * @version 2016-11-13
     * @author 金灵益 
	 * @param isRise
	 * @return   排列酒店价格
	 */
	public void sortByPrice(boolean isRise);
	
	/**
	 * @version 2016-11-13
     * @author 金灵益 
	 * @param key
	 * @description 酒店的输入关键字查找
	 * @return
	 */
	public List<HotelPo> findHotel(String key);
	
	/**
	 * @version 2016-11-13
     * @author 金灵益 
	 * @param least
	 * @param max
	 * @return  通过评分区间搜索酒店
	 */
	public List<HotelVo> findByPoint(double least, double max);
	
	/**
	 * @version 2016-11-13
     * @author 金灵益 
	 * @param least
	 * @param max
	 * @return  通过星级区间搜索酒店
	 */
	public List<HotelVo> findByStars(int least, int max);
}