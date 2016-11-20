package dataService.dataHelper.Impl;

import dataService.dataHelper.AccountDataHelper;
import dataService.dataHelper.MemberDataHelper;
import dataService.dataHelper.DataFactory;

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

}
