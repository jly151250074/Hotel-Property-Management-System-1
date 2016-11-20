package service.service.memberBlService;

import common.ResultMessage;
import common.InfoType;
import vo.MemberVo;

/**
 * UserBLService
 * 负责实现用户信息界面所需要的服务
 * @author lienming
 * @version Nov 13, 2016
 */
/**
 * 会员的属性有：
 * 信用值、VIP等级
 * 会员基本信息 - 用户名、联系方式、生日
 * 权限（会员）
 * @author lienming
 * @version Nov 13, 2016
 */

public interface MemberBlService {

	/**
	 * 获取用户的信用值
	 * @param id
	 * @return 处理信息
	 * @author lienming
	 * @version Nov 13, 2016
	 */
	public int getCredit(int id);

	/**
	 * 为客户充值信用
	 * @param id 接受充值的会员账号, quantity 充值的信用数量
	 * @return 处理信息
	 * @author Molloh
	 * @version Oct 14, 2016
	 */
	public ResultMessage chargeCredit(int id, int amount);

	/**
	 * 显示用户的信息
	 * @param id
	 * @return 用户信息
	 * @author Molloh
	 * @version Oct 14, 2016
	 */
	public MemberVo getInfo(int id);

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
	public ResultMessage modifyInfo(int id,MemberVo vo);
}
