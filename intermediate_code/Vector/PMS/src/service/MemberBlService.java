package memberblservice;

import common.ResultMessage;
import common.InfoType;
import vo.memberVO;

public interface MemberBlService {
	public int getCredit();

	public memberVO getInfo(int id);
	
	public ResultMessage checkInfo(String info,InfoType infoType);
	
}
