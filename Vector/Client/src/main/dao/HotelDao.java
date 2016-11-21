/**
 * @author 金灵益
 * @version 2016-11-19
 */
package dao;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import common.ResultMessage;
import po.HotelPo;

public interface HotelDao extends Remote{

	/**
	 * 添加酒店
	 * @param po
	 * @return
	 */
	public ResultMessage addHotelPO(HotelPo po) throws RemoteException;
	
	/**
	 * 更新酒店信息
	 * @param po
	 * @return
	 */
	public ResultMessage updateHotel(HotelPo po) throws RemoteException;
	
	/**
	 * 删除酒店
	 * @param hotelId
	 * @return
	 */
	public ResultMessage deleteHotelPO(String hotelId) throws RemoteException;
	
	/**
	 * 按ID查找返回酒店
	 * @param hotelId
	 * @return
	 */
	public HotelPo findHotel(String hotelId) throws RemoteException;
	
	/**
	 * 按关键字返回所有符合条件的酒店
	 * @param key
	 * @return
	 */
	public List<HotelPo> keyFind(String key) throws RemoteException;
	
	/**
	 * 得到酒店所属商圈
	 * @param hotelId
	 * @return
	 */
	public String getBusiness(String hotelId) throws RemoteException;
}