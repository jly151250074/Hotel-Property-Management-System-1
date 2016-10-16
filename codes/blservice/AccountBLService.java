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
public interface AccountBLService {
	
	/**
	 * 注册账号
	 * @return 注册账号是否成功
	 * @author lienming
	 * @version Oct 16, 2016
	 */
	public ResultMessage register(String memberName,String password);
	
	/**
	 * 提交注册账号申请时，验证账号名是否可用
	 * @return 该账号名是否可用
	 * @author lienming
	 * @version Oct 16, 2016
	 */
	public ResultMessage checkMemberName(String memberName);
	
	/**
	 * 检验输入是否合法
	 * @return 输入是否合法
	 * @author lienming
	 * @version Oct 16, 2016
	 */
	public ResultMessage checkInput(String input);
	
	/**
	 * 注册账号成功时，为该账号分配一个ID
	 * @return ID
	 * @author lienming
	 * @version Oct 16, 2016
	 */
	public AccountVO getNewID(Account newAccount);
	
	/**
	 * 用户修改账号密码
	 * @return 修改密码是否成功
	 * @author lienming
	 * @version Oct 16, 2016
	 */
	public ResultMessage modify(AccountVO accountVO,String newPassword);
	
	/**
	 * 网站管理人员新增账号
	 * @return 新增账号是否成功
	 * @author lienming
	 * @version Oct 16, 2016
	 */
	public ResultMessage add(AccountVO accountVO);
	
	/**
	 * 网站管理人员删除账号
	 * @return 删除账号是否成功
	 * @author lienming
	 * @version Oct 16, 2016
	 */
	public ResultMessage delete(AccountVO accountVO);
	
	/**
	 * 网站管理人员根据 账号名或者ID 查找账号
	 * @return 若存在对应账号则返回Account，若不存在则返回null
	 * @author lienming
	 * @version Oct 16, 2016
	 */
	public AccountVO find(String memberName);
	public AccountVO find(String id);
	
	/**
	 * 用户账号登录
	 * @return 账号登录是否成功
	 * @author lienming
	 * @version Oct 16, 2016
	 */
	public ResultMessage login(String memberName,String password);
	
	/**
	 * 用户账号登出
	 * @return 登出成功
	 * @author lienming
	 * @version Oct 16, 2016
	 */
	public ResultMessage logout(String memberName);
}
