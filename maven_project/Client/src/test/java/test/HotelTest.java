package test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import vo.HotelVo;

public class HotelTest {
	private HotelVo h1,h2,h3;
	
	@Before
	public void setUp(){
		h1 = new HotelVo();           h1.setHotelName("HanTing");
		h1.setId("H00000");           h1.setHotelAddress("Nanjing");
		h1.setInBusiness("Xinjiekou");h1.setHotelTel("85000000");    h1.setPoints(5.0);
		h1.setHotelInfo("aaa");       h1.setNumOfpoint(99);          h1.setReadyRoom(20);
		
		h2 = new HotelVo();           h2.setHotelName("RuJia");
		h2.setId("H00010");           h2.setHotelAddress("Hangzhou");
		h2.setInBusiness("Xihu");     h2.setHotelTel("85111111");    h2.setPoints(0);
		h2.setHotelInfo("bbb");       h2.setNumOfpoint(49);          h2.setReadyRoom(40);
		
		h3 = new HotelVo();           h3.setHotelName("LvZhou");
		h3.setId("H00100");           h3.setHotelAddress("Hangzhou");
		h3.setInBusiness("Xiaoshan"); h3.setHotelTel("85222222");    h3.setPoints(3.0); 
		h3.setHotelInfo("ccc");       h3.setNumOfpoint(150);         h3.setReadyRoom(60);
	}

	@Test
	public void testShowHotelInfo() {
		String info1 = "HanTing H00000 Nanjing " + h1.getInBusiness() + " 85000000 aaa";
		String info2 = "RuJia H00010 Hangzhou " + h2.getInBusiness() + " 85111111 bbb";
		String info3 = "LvZhou H00100 Hangzhou " + h3.getInBusiness() + " 85222222 ccc";
		
		assertEquals(h1.showInfo(),info1);
		assertEquals(h2.showInfo(),info2);
		assertEquals(h3.showInfo(),info3);
	}
	
	@Test
	public void testGetReadyRoom(){
		assertEquals(h1.getReadyRoom(),20);
		assertEquals(h2.getReadyRoom(),40);
		assertEquals(h3.getReadyRoom(),60);
	}
	
	@Test
	public void testgetComment(){
		h1.comment("Very good");
		assertEquals(h1.getComment().get(0),"Very good");
		h1.comment("Bad");
		assertEquals(h1.getComment().get(1),"Bad");
		h1.comment("Good!");
		assertEquals(h1.getComment().get(2),"Good!");
		
		h2.comment("cool");
		assertEquals(h2.getComment().get(0),"cool");

	}

	@Test
	public void testgetPostrings(){
		assertTrue(h1.getPoStrings() == 5.0);
		assertTrue(h2.getPoStrings() == 0);
		assertTrue(h3.getPoStrings() == 3.0);
		
		h1.givePoStrings(0);
		assertTrue(h1.getPoStrings() == 4.95);
		h2.givePoStrings(4.0);
		assertTrue(h2.getPoStrings() == 0.08);
		h3.givePoStrings(3.0);
		assertTrue(h3.getPoStrings() == 3.0);
	}
	
	
}
