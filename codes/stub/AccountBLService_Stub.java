/**
 * AccountBLService的桩代码
 * @author lienming
 * @version Oct 16, 2016
 */
public interface AccountBLService_Stub implements AccountBLService {
	String memberName;
	String password;
	String id;
	Account	account;
	
	public AccountBLService_Stub(String memberName,String password,String id,Account account){
		this.memberName=memberName;
		this.password=password;
		this.id=id;
		this.account=account;
	}
	
	public ResultMessage register(String memberName,String password){
		return ResultMessage.SUCCEED;
	}
	
	public ResultMessage checkMemberName(String memberName){
		return ResultMessage.SUCCEED;
	}
	
	public ResultMessage checkInput(String input){
		if(!input.equals(""))
			return ResultMessage.SUCCEED;
		else
			ResultMessage.FAILED;
	}
	
	public AccountVO getNewID(Account newAccount){
		return new AccountVO(newAccount);
	}
	
	public ResultMessage modify(AccountVO accountVO,String newPassword){
		if(!newPassword.equals(""))
			return ResultMessage.SUCCEED;
		else
			ResultMessage.FAILED;
	}
	
	public ResultMessage add(AccountVO accountVO){
		return ResultMessage.SUCCEED;
	}
	
	public ResultMessage delete(AccountVO accountVO){
		return ResultMessage.SUCCEED;
	}
	
	public AccountVO find(String memberName){
		return new AccountVO(account);
	}
	public AccountVO find(String id){
		return new AccountVO(account);
	}
	
	public ResultMessage login(String memberName,String password){
		return ResultMessage.SUCCEED;
	}	
	
	public ResultMessage logout(String memberName){
		return ResultMessage.SUCCEED;
	}	
}
