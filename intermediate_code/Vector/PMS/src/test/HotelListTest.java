package test;

import org.junit.Before;
import org.junit.Test;
import service.impl.hotelbl.HotelList;
import vo.HotelVo;

import static org.junit.Assert.*;

public class HotelListTest {
	private HotelVo h1,h2,h3;
	private HotelList list;
	
	@Before
	public void setUp(){
		h1 = new HotelVo();         h1.setHotelName("HanTing");
		h1.setPrice(100);	        h1.setHotelAddress("Nanjing");
		h1.setStars(1);             h1.setPoints(5.0);

		h2 = new HotelVo();         h2.setHotelName("RuJia");
		h2.setPrice(500);;         h2.setHotelAddress("Hangzhou");
		h2.setStars(5);             h2.setPoints(0);
		
		h3 = new HotelVo();         h3.setHotelName("LvZhou");
		h3.setPrice(1000);;         h3.setHotelAddress("Hangzhou");
		h3.setStars(2);             h3.setPoints(3.0);
		
		list = new HotelList();
		list.addHotel(h1);
		list.addHotel(h2);
		list.addHotel(h3);
	}
	
	@Test
	public void testshowHotelList(){
		assertEquals(list.showHotelList().get(0),h1);
		assertEquals(list.showHotelList().get(1),h2);
		assertEquals(list.showHotelList().get(2),h3);
	}

	@Test
	public void testfindHotel(){
		assertEquals(list.findHotel("HanTing").get(0),h1);
		assertEquals(list.findHotel("Hangzhou").get(0),h2);
		assertEquals(list.findHotel("Hangzhou").get(1),h3);
	}
	
	@Test
	public void testsortByName(){
		list.sortByName(true);
		assertEquals(list.showHotelList().get(0) , h1);
		list.sortByName(false);
		assertEquals(list.showHotelList().get(0) , h2);
	}
	
	@Test
	public void testsortByStar(){
		list.sortByStar(true);
		assertEquals(list.showHotelList().get(0) , h1);
		list.sortByStar(false);
		assertEquals(list.showHotelList().get(0) , h2);
	}
	
	@Test
	public void testsortByPoint(){
		list.sortByPoint(true);
		assertEquals(list.showHotelList().get(0) , h2);
		list.sortByPoint(false);
		assertEquals(list.showHotelList().get(0) , h1);
	}
	
	@Test
	public void testsortByPrice(){
		list.sortByPrice(true);
		assertEquals(list.showHotelList().get(0) , h1);
		list.sortByPrice(false);
		assertEquals(list.showHotelList().get(0) , h3);
	}
}
