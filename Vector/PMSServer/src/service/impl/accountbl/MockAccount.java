package service.impl.accountbl;
import java.util.HashMap;

import common.ResultMessage;

public class MockAccount /* extend Account */{
	private String memberName;
	private String password;
	private String id;
	
	public MockAccount(String memberName,String password){
		/* super(); */
		this.memberName=memberName;
		this.password=password;
	}
	
	public HashMap<String,String> getAllAccountName(){   // ????
		return null;
	}
	
	public String getMemberName(){return this.memberName;}
	public String getPassword()  {return this.password;  }
	public String getId()        {return this.id;        }
	public String getNewId()     {return "123456";       }
	
	public /*static*/ ResultMessage checkInput(String input){
		return ResultMessage.VALID;
	}
	
	/* insert,update,delete must creat accountPO */
	public ResultMessage insert(){
		return ResultMessage.SUCCEED;
	}
	
	public ResultMessage update(){
		return ResultMessage.SUCCEED;
	}
	
	public ResultMessage delete(){
		return ResultMessage.SUCCEED;
	}
	
	public ResultMessage find(){
		return ResultMessage.SUCCEED;
	}
	
	public ResultMessage login(){
		return ResultMessage.SUCCEED;
	}
	
	public ResultMessage logout(){
		return ResultMessage.SUCCEED;
	} 
	
	public ResultMessage register(){   // get new ID from database.
		return ResultMessage.SUCCEED;
	}
	
	public ResultMessage modify(String newPassword){
		this.password=newPassword;
		return ResultMessage.SUCCEED;
	}
}
