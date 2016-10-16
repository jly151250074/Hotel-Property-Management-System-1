/**
 * UserInfoBLService的桩代码
 * @author Molloh
 * @version Oct 15, 2016
 */
public interface UserInfoBLService_Stub implements SalesBLService {
    String userId;
    String hotelId;
    String info;
    int quantity;
    Account account;

    public UserInfoService_Stub(String userId, String hotelId, String info, int quantity, Account account) {
        this.userId = userId;
        this.hotelId = hotelId;
        this.info = info;
        this.quantity = quantity;
        this.account = account;
    }

      //用户信息界面得到用户个人的基本信息
    public UserInfoVO getInfo(String userId) {
        return new UserInfoVO(account);
    }

      //用户信息界面得到所查找的用户的所有信息
    public UserInfoVO findUser(String userId) {
        return new UserVO(account);
    }

      //对用户信息进行增删改操作
    public ResultMessage modifyUser(LIMIT limit, UserInfoVO vo) {
        return ResultMessage.SUCCEED;
    }

      //对信息进行合法性检查操作
    public ResultMessage checkInfo(String info) {
        if(info.equals(""))
            return ResultMessage.FAILED
        return ResultMessage.SUCCEED;
    }

      //信用充值uk
    public ResultMessage chargeCredit(String userId, int quantity) {
        return ResultMessage.SUCCEED;
    }

      //文字评价酒店服务
    public ResultMessage comment(String hotelId, String comment) {
        return ResultMessage.SUCCEED;
    }

      //评分酒店服务
    public ResultMessage score(String hotelId, SCORE score) {
        return ResultMessage.SUCCEED;
    }
}
