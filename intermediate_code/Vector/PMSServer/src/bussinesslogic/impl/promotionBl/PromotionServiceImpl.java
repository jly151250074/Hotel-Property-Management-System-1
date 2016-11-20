/*
* @Author: Aobang
* @Date:   2016-11-13 17:57:05
* @Last Modified by:   Aobang
* @Last Modified time: 2016-11-13 20:06:00
*/
package service.impl.promotionBl;

import common.ResultMessage;
import data.dao.PromotionDao;
import data.dao.impl.PromotionDaoImpl;
import po.PromotionPo;
import service.service.promotionBlService.PromotionService;

import java.util.Date;
import java.util.List;

public class PromotionServiceImpl implements PromotionService {

	private int hotelID;

	private List<PromotionPo> hotelPromotionList;

	private List<PromotionPo> websitePromotionList;

	private PromotionDao promotionDao;

	public PromotionServiceImpl(int hotelID) {
		this.hotelID = hotelID;
		/*
		promotionDao = PromotionDaoImpl.getInstance();
		hotelPromotionList = promotionDao.getPromotions(hotelID);
		websitePromotionList = promotionDao.getPromotions(0); //假设为网站促销策略分配的ID为0
		*/
	}

	public ResultMessage add(int promotionId) {

		return ResultMessage.SUCCEED;
	}

	public ResultMessage delete(int promotionId) {

		return ResultMessage.SUCCEED;
	}

	public ResultMessage update(int promotionId) {

		return ResultMessage.SUCCEED;
	}

	public ResultMessage editStartDate(Date date) {

		return ResultMessage.SUCCEED;
	}

	public ResultMessage editEndDate(Date date) {

		return ResultMessage.SUCCEED;
	}

	public ResultMessage editRoomNum(int number) {

		return ResultMessage.SUCCEED;
	}

	public ResultMessage editDiscount(int discount) {

		return ResultMessage.SUCCEED;
	}

	public ResultMessage editDescription(String description) {

		return ResultMessage.SUCCEED;
	}

	public ResultMessage editLevelCredit(int credit) {

		return ResultMessage.SUCCEED;
	}

	public double calDiscount(PromotionPo promotionPo) {
		return 0;
	}


	public int getDiscountedPrice(int orderPrice) {
		double minDiscount = 1;
		/*
		for(PromotionPo hp : hotelPromotionList) {
			if(calDiscount(o) < minDiscount) {
				minDiscount = calDiscount(o);
			}
		}
		for(PromotionPo wp : websitePromotionList) {
			if(calDiscount(o) < minDiscount) {
				minDiscount = calDiscount(o);
			}
		}*/
		return (int)Math.floor(orderPrice * minDiscount);
	}

}