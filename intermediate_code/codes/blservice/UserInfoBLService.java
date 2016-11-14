/**
 * UserBLService
 * 负责实现用户信息界面所需要的服务
 * @author Molloh
 * @version Oct 14, 2016
 */
/**
 * 会员的属性有：
 * 会员ID、密码、
 * 信用值、VIP等级、分类（普通会员、企业会员）
 * 会员基本信息 - 用户名、联系方式、企业名（企业会员）、生日（普通会员）
 * 权限（会员）
 * @author Molloh
 * @version Oct 14, 2016
 */
/**
 * 酒店的属性有：
 * 酒店ID、密码
 * 酒店基本信息 - 酒店名、地址、联系方式、酒店简介、酒店图片、酒店工作人员信息（身份、姓名、性别）、
 * 权限（酒店）
 * 房间信息（可用房间数量、可订房间数量）
 * 评价信息（文字评价、平均评分）
 * @author Molloh
 * @version Oct 14, 2016
 */
/**
 * 网站营销人员的属性有：
 * 网站营销人员ID、密码
 * 网站营销人员基本信息 - 姓名、性别、联系方式、
 * 权限（网站营销人员）
 * @author Molloh
 * @version Oct 14, 2016
 */
/**
 * 网站管理人员的属性有：
 * 网站管理人员ID、密码
 * 权限（网站管理人员）
 * @author Molloh
 * @version Oct 14, 2016
 */
/**
 * 网站管理人员可执行充值信用服务
 * 网站管理人员的增删改查权限包括：用户信息，包括用户的所有属性
 * 会员的增删改权限包括：会员基本信息
 * 酒店的增删改权限包括：酒店基本信息（酒店工作人员、地址、联系方式）
 * @author Molloh
 * @version Oct 14, 2016
 */
public interface UserInfoBLService {

    /**
     * 显示用户的信息
     * @param 用户ID
     * @return 用户信息
     * @author Molloh
     * @version Oct 14, 2016
     */
    public UserInfoVO getInfo(String userId);

    /**
     * 以用户ID精确查找用户
     * @param 用户ID
     * @return 用户信息
     * @author Molloh
     * @version Oct 14, 2016
     */
    public UserVO findUser(String userId);

    /**
     * 增删改一名用户VO
     * @param limit 修改者权限, vo 用户信息
     * @return 处理信息
     * @author Molloh
     * @version Oct 14, 2016
     */
     public ResultMessage modifyUserInfo(LIMIT limit, UserVO vo);

     /**
      * 检查输入信息的合法性
      * @param info 输入信息
      * @return 处理信息
      * @author Molloh
      * @version Oct 14, 2016
      */
      public ResultMessage checkInfo(String info);

      /**
       * 为客户充值信用
       * @param memberId 接受充值的会员账号, quantity 充值的信用数量
       * @return 处理信息
       * @author Molloh
       * @version Oct 14, 2016
       */
      public ResultMessage chargeCredit(String memberId, int quantity);

      /**
       * 客户文字评价酒店服务
       * @param hotelID 被评价酒店的ID，comment 文字评价信息
       * @return 处理信息
       * @author Molloh
       * @version Oct 15, 2016
       */
      public ResultMessage comment(String hotelId, String comment);

      /**
       * 客户为酒店评分
       * @param hotelId 被评分酒店的ID, score 评分信息
       * @return 处理信息
       * @author Molloh
       * @version Oct 15, 2016
       */
      public ResultMessage score(String hotelId, SCORE score);

}
