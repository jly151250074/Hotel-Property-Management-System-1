package businesslogic;


import common.InfoType;
import common.ResultMessage;
import vo.MemberVo;

/**
 * 会员的属性有：
 * 信用值、VIP等级
 * 会员基本信息 - 用户名、联系方式、生日
 * 权限（会员）
 * @author lienming
 * @version 2016-11-17
 */

public interface MemberBlService {

	/**
	 * 获取用户的信用值
	 * @param id
	 * @return credit:int
	 * @author lienming
	 * @version 2016-11-27
	 */
	 public int getCredit(String id) ;

	/**
	 * 为客户充值信用
	 * @param id :int, amount :int充值的信用数量 可为负数
	 * @return ResultMessage
	 * @author lienming
	 * @version 2016-11-27
	 */
	public ResultMessage chargeCredit(String id, int amount) ;

	/**
	 * 显示用户的信息
	 * @param id
	 * @return MemberVo
	 * @author lienming
	 * @version 2016-11-27
	 */
	public MemberVo getInfo(String id) ;

	/**
	 * 检查输入信息的合法性
	 * @param info:String
	 * @return ResultMessage
	 * @author lienming
	 * @version 2016-11-27
	 */
	public ResultMessage checkInfo(String info,InfoType infoType) ;

	/**
	 * 修改用户信息
	 * @param vo 
	 * @return ResultMessage
	 * @author lienming
	 * @version 2016-11-27
	 */
	public ResultMessage modifyInfo(MemberVo vo);
}


	/**
	 * 检查输入信息的合法性
	 * @param info 输入信息
	 * @return 处理信息
	 * @author Molloh
	 * @version Oct 14, 2016
	 */
	public ResultMessage checkInfo(String info,InfoType infoType);

	/**
	 * 增删改一名用户VO
	 * @param vo 用户信息
	 * @return 处理信息
	 * @author Molloh
	 * @version Oct 14, 2016
	 */
	public ResultMessage modifyInfo(String id,MemberVo vo);
}
