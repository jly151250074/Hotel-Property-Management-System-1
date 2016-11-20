package service.impl.hotelbl;

import common.ResultMessage;
import common.RoomType;
import service.service.hotelBlService.HotelListService;
import service.service.hotelBlService.HotelService;
import vo.HotelVo;

import java.util.ArrayList;
import java.util.List;

/**
 * @ author Molloh
 * @ version 2016/11/13
 * @ description
 */
public class HotelServiceImpl implements HotelService, HotelListService {
    /**
     * @return
     * @description 显示酒店具体信息
     */
    @Override
    public ResultMessage showhotelInfo() {
        return null;
    }

    /**
     * @return
     * @description 得到空余房间数
     */
    @Override
    public int getReadyRoom() {
        return 0;
    }

    /**
     * @param giveComment
     * @description 客户给予文字评价
     */
    @Override
    public void comment(String giveComment) {

    }

    /**
     * @return 酒店所有的文字评价
     */
    @Override
    public ArrayList<String> getComment() {
        return null;
    }

    /**
     * @param poStrings
     * @description 客户给予评分
     */
    @Override
    public void givePoStrings(double poStrings) {

    }

    /**
     * @return 酒店评分
     */
    @Override
    public double getPoStrings() {
        return 0;
    }

    /**
     * @return 酒店所属商圈
     */
    @Override
    public String getInBusiness() {
        return null;
    }

    @Override
    public int getOriginPrice(RoomType Type) {
        switch (Type) {
            case SingleRoom: return 200;
            case DoubleRoom: return 400;
            default:         return 0;
        }
    }

    /**
     * @return 返回酒店列表
     */
    @Override
    public List<HotelVo> showHotelList() {
        return null;
    }

    /**
     * @param isRise 升序排列
     * @return 排列酒店名称
     */
    @Override
    public void sortByName(boolean isRise) {

    }

    /**
     * @param isRise
     * @return 排列酒店星级
     */
    @Override
    public void sortByStar(boolean isRise) {

    }

    /**
     * @param isRise
     * @return 排列酒店评分
     */
    @Override
    public void sortByPoint(boolean isRise) {

    }

    /**
     * @param isRise
     * @return 排列酒店价格
     */
    @Override
    public void sortByPrice(boolean isRise) {

    }

    /**
     * @param key
     * @return
     * @description 酒店的输入关键字查找
     */
    @Override
    public List<HotelVo> findHotel(String key) {
        return null;
    }
}
