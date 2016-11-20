package service.service.hotelBlService;
/**
 * @version 2016-11-13
 * @author 金灵益
 * @description 负责酒店管理界面所需要的服务
 */

import common.ResultMessage;
import common.RoomType;

import java.util.ArrayList;

/**
 * 酒店的属性有：
 * 编号，名称，所属商圈，简介，地址，联系方式，星级
 * 总房间数，评分，空余房间数，房间类型，价格
 * 酒店的查询可以通过选择酒店分类、输入关键字进行模糊查找
 * @author 金灵益
 * @version 2016-11-13
 *
 */
public interface HotelService {

	/**
	 * @description 显示酒店具体信息
	 * @return
	 */
	public ResultMessage showhotelInfo();

	/**
	 * @description 得到空余房间数
	 * @return
	 */
	public int getReadyRoom();

	/**
	 * @description 客户给予文字评价
	 * @param giveComment
	 */
	public void comment(String giveComment);

	/**
	 * @return 酒店所有的文字评价
	 */
	public ArrayList<String> getComment();

	/**
	 * @description 客户给予评分
	 * @param poStrings
	 */
	public void givePoStrings(double poStrings);

	/**
	 * @return 酒店评分
	 */
	public double getPoStrings();

	/**
	 * @return 酒店所属商圈
	 */
	public String getInBusiness();

	/**
	 * @param Type
	 * @return 不同类型房间的价格
	 */
	public int getOriginPrice(RoomType Type);

}