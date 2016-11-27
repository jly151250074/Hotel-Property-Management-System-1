package businesslogic.impl;

import businesslogic.AccountBlService;
import common.AccountType;
import common.ResultMessage;
import dataService.dao.AccountDao;
import po.AccountPo;
import rmi.RemoteHelper;
import vo.AccountVo;

/**
 * Updated by lienming on 2016-11-27.
 */
public class AccountBlServiceImpl implements AccountBlService{

    private AccountDao accountDao;

    private static AccountBlServiceImpl accountBlServiceImpl;

    public static AccountBlServiceImpl getInstance(){
        if( accountBlServiceImpl == null)
            accountBlServiceImpl = new AccountBlServiceImpl() ;
        return accountBlServiceImpl;
    }

    private AccountBlServiceImpl(){
        accountDao = RemoteHelper.getInstance().getAccountDao();
    }

    public AccountType login(String id, String password){
        //先检查输入
        ResultMessage memberNameValid = checkInput(id);
        ResultMessage passwordValid   = checkInput(password) ;
        if(memberNameValid == ResultMessage.VALID
                && passwordValid == ResultMessage.VALID )
            return accountDao.login(id,password);
        else
            return AccountType.Fail; //输入非法
    }

    public ResultMessage logout(String id) {
        return accountDao.logout(id);
    }

    public String register(String memberName,String password) {
        //先检查输入
        ResultMessage memberNameValid = checkInput(memberName);
        ResultMessage passwordValid   = checkInput(password) ;
        if(memberNameValid == ResultMessage.VALID
                && passwordValid == ResultMessage.VALID )
        {
        	 return accountDao.register(memberName,password);
        }
        else
            return "FAIL";    //输入非法
    }

    public ResultMessage modify(String id,String newPassword){
        return accountDao.modify(id,newPassword);
    }

    /**
     * 长度限制 [4,12] 
     * 字符限制 大小写字母、数字  -> ASCII: 48<=char<=57 || 65<=char<=90  || 97<=char<=122
	 * 是否重复    
	 * 是否敏感大小写   (未完成)
	 * 注意：返回ResultMessage.VALID/INVALID
     */
    public ResultMessage checkInput(String input){
        if(input.length()<=3 || input.length()>12)
            return ResultMessage.INVALID;
        else
        {
        	for(int i=input.length()-1;i>=0;i--)
        	{
        		char ch = input.charAt(i); 
        		if( (48<=ch && ch<=57) || (65<=ch&& ch<=90) || 
        				(97<=ch&&ch<=122) )
        			continue;
        		else 
        			return ResultMessage.INVALID;
        	}
            return ResultMessage.VALID;
        }
    }

    public AccountVo find(String id) {
        return accountDao.find(id);
    }

    public ResultMessage insert(AccountPo po) {
        return accountDao.insert(po);
    }

    public ResultMessage update(AccountPo po) {
        return accountDao.update(po);
    }

    public ResultMessage delete(String id) {
        return accountDao.delete(id);
    }

}
        ResultMessage passwordValid   = checkInput(password) ;
        if(memberNameValid == ResultMessage.VALID
                && passwordValid == ResultMessage.VALID )
             return accountDao.register(memberName,password);
        else
            return "FAIL";    //输入非法
    }

    public ResultMessage modify(String id,String newPassword) throws RemoteException{
        return accountDao.modify(id,newPassword);
    }

    public ResultMessage checkInput(String input){
        if(input.length()>0)
            return ResultMessage.VALID;
        else
            return ResultMessage.FAIL;
    }

    public ResultMessage find(String id) throws RemoteException{
        return accountDao.find(id);
    }

    public ResultMessage insert(AccountPo po) throws RemoteException{
        return accountDao.insert(po);
    }

    public ResultMessage update(AccountPo po) throws RemoteException{
        return accountDao.update(po);
    }

    public ResultMessage delete(AccountPo po) throws RemoteException{
        return accountDao.delete(po);
    }

}
