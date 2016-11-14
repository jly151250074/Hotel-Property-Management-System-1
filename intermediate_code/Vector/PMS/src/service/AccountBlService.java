package service;

import common.ResultMessage;

public interface AccountBlService {
	
	/*
	 * interface to UserInfoBL  
	 */
	public String getMemberName();
	
	
	/*
	 * get data from database
	 * 
	 * interface to AccountUI
	 */
	
	/* 1.interface to Member Client*/
	public ResultMessage login(String memberName,String password);
	
	public ResultMessage logout(String MemberName);
	
	public ResultMessage register(String memberName,String password);
	
	public ResultMessage modify(String newPassword);
	
	public ResultMessage checkInput(String input);
	
	public ResultMessage insert(/*AccountPO po*/);
	
	public ResultMessage update(/*AccountPO po*/);  

	/* 2.interface to Manager Client  （附加）*/ 
	
	public ResultMessage delete(/*AccountPO po*/);
	
	public ResultMessage find(/*AccountVO vo*/);
	

}
