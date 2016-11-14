/**
 * @version 2016-10-15
 * @author 金灵益
 * @description 负责酒店管理界面所需要的服务
 */

/**
 * 酒店的属性有：
 * 编号，名称，所属商圈，简介，地址，联系方式
 * 总房间数，评分，空余房间数
 * 酒店的查询可以通过选择酒店分类、输入关键字进行模糊查找
 * @author 金灵益
 * @version 2016-10-15
 *
 */
public interface HotelBLservice {
	
	/**
	 * 显示全部酒店
	 * @return 全部酒店的ArrayList
	 * @author 金灵益
     * @version 2016-10-15
	 */
	public ArrayList<HotelVO> showHotelList();
	
	/**
	 * 显示某个酒店的具体信息（给客户查询用）
	 * @return
	 * @author 金灵益
     * @version 2016-10-15
	 */
	public ResultMessage showHotelInfo();
	
	/**
	 * 为酒店列表按分类排序
	 * @param sort 酒店分类
	 * @param hotelList 酒店列表
	 * @return 排序后的酒店列表
	 * @author 金灵益
     * @version 2016-10-15 
	 */
	public ArrayList<HotelVO> sortHotel(String sort,ArrayList<HotelVO> hotelList);
	
	/**
	 * 查找酒店（模糊查找）
	 * @param info 关键字
	 * @return 满足条件的全部酒店
	 * @author 金灵益
     * @version 2016-10-15
	 */
	public ResultMessage findHotel(String info);
	
	/**
	 * 显示酒店的空余房间数
	 * @return 空余房间数
	 * @author 金灵益
     * @version 2016-10-15
	 */
	public int getReadyRoom();
	
	/**
	 * 显示酒店的评分
	 * @param poString 客户评分
	 * @return 酒店评分
	 * @author 金灵益
     * @version 2016-10-15
	 */
	public double getPoStrings(double poString);
	
}
