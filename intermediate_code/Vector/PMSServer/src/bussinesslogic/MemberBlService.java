package service;


import common.InfoType;
import common.ResultMessage;

import vo.memberVO;

public interface MemberBlService {
	public int getCredit();
	
	public memberVO getInfo(int id);
	
	public ResultMessage checkInfo(String info, InfoType infoType);
	
}
