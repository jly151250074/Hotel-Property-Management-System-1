package dataService.dataHelper.Impl;

import dataService.dataHelper.service.AccountDataHelper;
import dataService.dataHelper.service.DataFactory;
import dataService.dataHelper.service.HotelDataHelper;
import dataService.dataHelper.service.MemberDataHelper;

/**
 * Created by Administrator on 2016-11-13.
 */
public class DataFactoryImpl implements DataFactory {

    public AccountDataHelper getAccountDataHelper(){
        AccountDataHelper accountDao  = new AccountDataTxtHelper();
        return accountDao;
    }

    public MemberDataHelper getMemberDataHelper(){
        MemberDataHelper memberDao = new MemberDataTxtHelper();
        return memberDao;
    }


	public HotelDataHelper getHotelDataHelper() {
		HotelDataHelper hotelDao = new HotelDataTxtHelper();
		return hotelDao;
	}

}
