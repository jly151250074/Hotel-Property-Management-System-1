/*
* @Author: Aobang
* @Date:   2016-11-13 17:26:25
* @Last Modified by:   Aobang
* @Last Modified time: 2016-11-13 20:08:52
*/

package service.service.promotionBlService;

import common.ResultMessage;
import po.PromotionPo;

import java.util.Date;

public interface PromotionService {

	/**
	 * @param promotionId
	 * @return	添加是否成功
	 */
	public ResultMessage add(int promotionId);

	/**
	 * @param promotionId
	 * @return	删除是否成功
	 */
	public ResultMessage delete(int promotionId);

	/**
	 * @param promotionId
	 * @return	更新是否成功
	 */
	public ResultMessage update(int promotionId);

	/**
	 * @param date
	 * @return	编辑开始时间是否成功
	 */
	public ResultMessage editStartDate(Date date);

	/**
	 * @param date
	 * @return	编辑结束时间是否成功
	 */
	public ResultMessage editEndDate(Date date);

	/**
	 * @param number
	 * @return	编辑最小折扣房间数是否成功
	 */
	public ResultMessage editRoomNum(int number);


	/**
	 * @param discount
	 * @return	编辑折扣是否成功
	 */
	public ResultMessage editDiscount(int discount);

	/**
	 * @param description
	 * @return	编辑促销策略简介是否成功
	 */
	public ResultMessage editDescription(String description);

	/**
	 * @param credit
	 * @return	编辑升级所需信用值是否成功
	 */
	public ResultMessage editLevelCredit(int credit);

	/**
	 * @param promotionPO
	 * @return	获取折扣额度（百分比）
	 */
	public double calDiscount(PromotionPo promotionPO);

	/**
	 * @param orderPrice
	 * @return	获取折后价格
	 */
	public int getDiscountedPrice(int orderPrice);
}