package member;

import common.ResultMessage;
import common.Sex;
import common.InfoType;

import vo.memberVO;

/*import businesslogic.userInfobl.UserInfo;*/
public class MockMember {
	private int credit;    
	private String name;
	private String phone;  // limit length
	private String address;// type-> enum?
	private Sex sex;   
	
    
	public MockMember(String name,String phone,String address,
							Sex sex)
	{  
		this.name=name;
		this.phone=phone;
		this.address=address;
		this.sex=sex;
		this.credit=0;
	}
	
	public int getCredit(){
		return 0;
	}
	
	public ResultMessage modifyUserInfo(memberVO vo,InfoType infoType){
		return ResultMessage.SUCCEED;
	}
	/* 
	public ResultMessage comment(String hotelId, String comment){
		return ResultMessage.SUCCEED;
	}
	
	public ResultMessage score(String hotelId, int score){
		return ResultMessage.SUCCEED;
	}*/
	
	public memberVO getInfo(int id){
		return new memberVO(id);
	}
	
	public ResultMessage checkInfo(String info,InfoType infoType){
		return ResultMessage.VALID;
	}
	
	public ResultMessage chargeCredit(int amount){
		this.credit += amount;
		return ResultMessage.SUCCEED;
	}
	
}
