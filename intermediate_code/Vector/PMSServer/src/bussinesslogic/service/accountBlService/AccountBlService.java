package service.service.accountBlService;

import common.ResultMessage;
import po.AccountPo;
/**
 * AccountBLService
 * 负责实现所有与账号相关的操作所需要的服务
 * @author lienming
 * @version Oct 16, 2016
 */

/**
 * 账号的属性有：
 * 账号名、密码、ID。
 * 账号名和ID是唯一且一一对应的，不能被修改。ID由注册时系统分配。
 * 对账号的操作有：
 * 1、所有人可以进行的：注册账号、修改账号密码、账号登入登出。
 * 2、仅网站管理人员可以进行的：账号查找、账号的添加和删除。账号查找是根据账号名或ID进行查找。
 * @author lienming
 * @version Oct 16, 2016
 */

public interface AccountBlService {

	/* 1.interface to Member Client*/

	/**
	 * 用户账号登录
	 * @return 账号登录是否成功
	 * @author lienming
	 * @version Oct 16, 2016
	 */
	public ResultMessage login(int id,String password);

	/**
	 * 用户账号登出
	 * @return 登出成功
	 * @author lienming
	 * @version Oct 16, 2016
	 */
	public ResultMessage logout(int id);

	/**
	 * 注册账号
	 * @return 注册账号是否成功
	 * @author lienming
	 * @version Oct 16, 2016
	 */
	public int register(String memberName,String password);

	/**
	 * 用户修改账号密码
	 * @return 修改密码是否成功
	 * @author lienming
	 * @version Oct 16, 2016
	 */
	public ResultMessage modify(int id,String newPassword);

	/**
	 * 提交注册账号申请时，验证输入是否合法
	 * @return 该账号名是否可用
	 * @author lienming
	 * @version Oct 16, 2016
	 */
	public ResultMessage checkInput(String input);

	/**
	 * 根据账号名查找账号
	 * @return 返回是否存在
	 * @author lienming
	 * @version Oct 16, 2016
	 */
	public ResultMessage find(int id);



	/* 2.interface to Manager Client  */


	/**
	 * 网站管理人员新增账号
	 * @return 新增账号是否成功
	 * @author lienming
	 * @version Oct 16, 2016
	 */
	public ResultMessage insert(AccountPo po);

	/**
	 * 网站管理人员更新账号
	 * @return 更新账号是否成功
	 * @author lienming
	 * @version Oct 16, 2016
	 */
	public ResultMessage update(AccountPo po);

	/**
	 * 网站管理人员删除账号
	 * @return 删除账号是否成功
	 * @author lienming
	 * @version Oct 16, 2016
	 */
	public ResultMessage delete(AccountPo po);

	

}
