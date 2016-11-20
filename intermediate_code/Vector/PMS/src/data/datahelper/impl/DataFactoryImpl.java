package data.datahelper.impl;

import data.datahelper.AccountDataHelper;
import data.datahelper.DataFactory;
import data.datahelper.MemberDataHelper;

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
