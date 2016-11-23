package dataService.dataHelper.Impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import common.ResultMessage;
import common.RoomType;
import dataService.dataHelper.service.HotelDataHelper;
import po.HotelPo;
import po.HotelRoom;

public class HotelDataTxtHelper implements HotelDataHelper{

	@Override
	public Map<String, HotelPo> getHotelData() {
		//读取数据
		File file = new File("src/txtData/hotel/hotelList.txt");
		Map<String,HotelPo> map = new HashMap<String, HotelPo>();
		try {
			InputStreamReader reader = new InputStreamReader(new FileInputStream(
					file), "UTF-8");
			BufferedReader br = new BufferedReader(reader);
			String str = br.readLine();
			
			while (str != null) {
				String[] data = str.split("/");
				HotelPo po = new HotelPo();
				po.setId(data[0]);
				po.setHotelName(data[1]);
				po.setHotelAddress(data[2]);
				po.setInBusiness(data[3]);
				po.setHotelTel(data[4]);
				po.setStars(Integer.valueOf(data[5]));
				po.setPoints(Double.valueOf(data[6]));
				po.setNumOfpoint(Integer.valueOf(data[7]));
				po.setHotelInfo(data[8]);
				
				po.setRooms(getHotelRoom(data[0]));
				po.setComment(getComments(data[0]));
				map.put(data[0], po);
				str = br.readLine();
			}

			br.close();
			
			return map;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void updateHotelData(Map<String, HotelPo> map) {
		//写入数据
		File file = new File("src/txtData/hotel/hotelList.txt");
		try {		
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter writer = new BufferedWriter(fw);
			//对map进行遍历
			Iterator<Map.Entry<String,HotelPo>> iterator = map.entrySet().iterator();
			while(iterator.hasNext()){
				Map.Entry<String,HotelPo> entry = iterator.next();
				HotelPo po = entry.getValue();
				String str = po.getId() + "/" + po.getHotelName() + "/" + po.getHotelAddress() + "/"
						+ po.getInBusiness() + "/" + po.getHotelTel() + "/" + (po.getStars()+"") + "/"
						+ (po.getPoStrings()+"") + "/" + (po.getNumOfpoint()+"") + "/" + po.getHotelInfo();
				
				updateHotelRoom(po.getId(),po.getRoom());
				updateComments(po.getId(),po.getComment());
				writer.write(str);
				
				writer.write("\r\n");	
			}
			writer.close();	
		} catch (Exception e) {
			e.printStackTrace();	
		}	
	}

	@Override
	public ResultMessage deleteHotelData(String hotelId) {
		File file = new File("src/txtData/hotel/hotelList.txt");
		
		File hotelfile = new File("src/txtData/hotel/" + hotelId + ".txt");
		//如果文件夹不存在则创建    
		if(!hotelfile .exists()  && !hotelfile .isDirectory()){
			return ResultMessage.INVALID;
		}else{
			hotelfile.delete();
		}
		
		try{
			InputStreamReader reader = new InputStreamReader(new FileInputStream(
					file), "UTF-8");
			BufferedReader br = new BufferedReader(reader);
			String str = br.readLine();
			String result = "";
			while(str != null){
				String[] data = str.split("/");
				if(data[0].equals(hotelId)){
					
				}else{
					result += str + "\n";
				}
				str = br.readLine();
			}
			br.close();
			
			FileWriter fw = new FileWriter("src/txtData/hotel/hotelList.txt");
			BufferedWriter writer = new BufferedWriter(fw);
			writer.write(result);
			writer.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return ResultMessage.SUCCEED;
	}

	public Map<String, HotelRoom> getHotelRoom(String hotelId) {
		File file = new File("src/txtData/hotel/" + hotelId + "/roomList.txt");
		Map<String, HotelRoom> map = new HashMap<String, HotelRoom>();
		try {
			InputStreamReader reader = new InputStreamReader(new FileInputStream(
					file), "UTF-8");
			BufferedReader br = new BufferedReader(reader);
			String str = br.readLine();
			
			while (str != null) {
				String[] data = str.split("/");
				HotelRoom room = new HotelRoom(hotelId);
				room.setRoomID(data[0]);
				String type = data[1];
				switch(type){
				case "SINGLE": room.setRoomType(RoomType.SINGLE);  break;
				case "DOUBLE": room.setRoomType(RoomType.DOUBLE);  break;
				case "BIG"   : room.setRoomType(RoomType.BIG);     break;
				}
				room.setOriginalPrice(Integer.valueOf(data[2]));
				if(data[3].equals("true"))  room.setisEmpty(true);
				if(data[3].equals("false")) room.setisEmpty(false);
				room.setCheckinDate(data[4]);
				room.setCheckoutDate(data[5]);
				
				map.put(data[0], room);
				str = br.readLine();
			}

			br.close();
			
			return map;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<String> getComments(String hotelId){
		File file = new File("src/txtData/hotel/" + hotelId + "/comments.txt");
		List<String> comment = new ArrayList<String>();
		
		try {
			InputStreamReader reader = new InputStreamReader(new FileInputStream(
					file), "UTF-8");
			BufferedReader br = new BufferedReader(reader);
			String str = br.readLine();
			
			while (str != null) {
				String result = "";
				while( !str.trim().equals("*") ){
					result += str + "\n";
					str = br.readLine();
				}
				comment.add(result);
				str = br.readLine();
			}
			
			br.close();
			return comment;
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 更新酒店房间数据
	 * @param hotelId
	 * @param map
	 */
	public void updateHotelRoom(String hotelId,Map<String,HotelRoom> map){
		File file = new File("src/txtData/hotel/" + hotelId + "/roomList.txt");
		try {		
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter writer = new BufferedWriter(fw);
			//对map进行遍历
			Iterator<Map.Entry<String,HotelRoom>> iterator = map.entrySet().iterator();
			while(iterator.hasNext()){
				Map.Entry<String,HotelRoom> entry = iterator.next();
				HotelRoom room = entry.getValue();
				
				String str = room.getRoomID() + "/";
				switch (room.getRoomtype()){
				case SINGLE: str += "SINGLE";break;
				case DOUBLE: str += "DOUBLE";break;
				case BIG :   str += "BIG"; break;
				}
				
				str += "/" + room.getPrice() + "/";
				if(room.getisEmpty() == true)  str += "true/";
				if(room.getisEmpty() == false) str += "false/";
				
				str += room.getCheckInDate() + "/" + room.getCheckOutdate();
				writer.write(str);
				
				writer.write("\n");	
			}
			writer.close();	
		} catch (Exception e) {
			e.printStackTrace();	
		}	
	}
	
	/**
	 * 更新酒店文字评论
	 * @param hotelId
	 * @param list
	 */
	public void updateComments(String hotelId,List<String> list){
		File file = new File("src/txtData/hotel/" + hotelId + "/comments.txt");
		try {		
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter writer = new BufferedWriter(fw);
			
			Iterator<String> iterator = list.iterator();
			while(iterator.hasNext()){
				String str = iterator.next();
				writer.write(str);
				writer.write("\n*\n");
			}
			writer.close();	
		} catch (Exception e) {
			e.printStackTrace();	
		}	
	}
}