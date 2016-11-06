package service;


import common.ResultMessage;

public interface AccountBlService {
	
	/*
	 * interface to UserInfoBL  
	 */
	String getMemberName();
	
	
	/*
	 * get data from database
	 * 
	 * interface to AccountUI
	 */
	
	/* 1.interface to Member Client*/
	ResultMessage login(String memberName, String password);
	
	ResultMessage logout(String MemberName);
	
	ResultMessage register(String memberName, String password);
	
	ResultMessage modify(String newPassword);
	
	ResultMessage checkInput(String input);
	
	ResultMessage insert(/*AccountPO po*/);
	
	ResultMessage update(/*AccountPO po*/);

	/* 2.interface to Manager Client  （附加）*/

	ResultMessage delete(/*AccountPO po*/);

	ResultMessage find(/*AccountVO vo*/);
	

}
