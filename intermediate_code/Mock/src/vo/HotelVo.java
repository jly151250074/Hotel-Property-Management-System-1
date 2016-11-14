package vo;

import common.ResultMessage;
import common.RoomType;
import service.impl.hotelbl.HotelRoom;
import service.impl.hotelbl.HotelRoomList;

import java.util.ArrayList;

/**
 * @ author Molloh
 * @ version 2016/11/13
 * @ description
 */
public class HotelVo {
    private String hotelName;
    private String hotelID;
    private String hotelAddress;
    private String inBusiness;                                        //酒店所属商圈
    private String tel;                                               //酒店联系电话
    private String info;                                              //酒店简介
    private ArrayList<String> comments = new ArrayList<String>();     //酒店的所有文字评价
    private double points;                                            //酒店评分
    private int numOfpoint;                                           //酒店被评分的次数
    private int stars;                                                //酒店星级
    private HotelRoom hroom = new HotelRoom();
    private HotelRoomList roomList = new HotelRoomList();

    public ResultMessage showhotelInfo(){
        return ResultMessage.SUCCEED;
    }

    public int getReadyRoom(){
        return roomList.getReadyRoom();
    }

    public void comment(String giveComment){
        comments.add(giveComment);
    }

    public ArrayList<String> getComment(){
        return comments;
    }

    public void givePoStrings(double poStrings){
        points = (points * numOfpoint + poStrings) / (numOfpoint+1);
        numOfpoint ++;
    }

    public double getPoStrings(){
        return points;
    }

    public String getInBusiness() {
        return inBusiness;
    }

    public int getOriginPrice(RoomType type){
        return 0;
    }

    public String showInfo(){
        return hotelName + " " + hotelID + " " + hotelAddress + " " +
                inBusiness + " " + tel + " " + info;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getId() {
        return hotelID;
    }

    public void setId(String hotelID) {
        this.hotelID = hotelID;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public void setInBusiness(String inBusiness) {
        this.inBusiness = inBusiness;
    }

    public void setHotelTel(String tel) {
        this.tel = tel;
    }

    public String getHotelTel() {
        return tel;
    }

    public void setHotelInfo(String info){
        this.info = info;
    }

    public String getHotelInfo(){
        return info;
    }

    public void setNumOfpoint(int p){
        this.numOfpoint = p;
    }

    public void setReadyRoom(int rooms){
        roomList.setReadyRoom(rooms);
    }

    public void setPoints(double points){
        this.points = points;
    }

    public void setStars(int stars){
        this.stars = stars;
    }

    public int getStars(){
        return stars;
    }

    public int getPrice(){
        return hroom.getPrice();
    }

    public void setPrice(int price){
        hroom.setOriginalPrice(price);
    }
}
