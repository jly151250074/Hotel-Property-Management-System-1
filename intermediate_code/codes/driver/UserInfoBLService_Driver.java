public class UserInfoBLService_Driver {
    public void drive(UserInfoBLService userInfoBLService) {
        ResultMessage result_Modify = userInfoBLService.modifyUserInfo(LIMIT.MEMBER, "N00001");
        if(result_Modify == ResultMessage.SUCCEED)
            System.out.println("更改成功");
        else
            System.out.println("更改失败");

        ResultMessage result_Check = userInfoBLService.checkInfo("233");
        if(result_Check == ResultMessage.SUCCEED)
            System.out.println("信息合法");
        else
            System.out.println("信息非法");

        ResultMessage result_Credit = userInfoBLService.chargeCredit("N0001", 300);
        if(result_Check == ResultMessage.SUCCEED)
            System.out.println("充值成功");
        else
            System.out.println("充值失败");

        ResultMessage result_comment = userInfoBLService.comment("H00001", "GOOD!");
        if(result_Check == ResultMessage.SUCCEED)
            System.out.println("评价成功");
        else
            System.out.println("评价失败");

        ResultMessage result_score = userInfoBLService.score("H0001", SCORE.FIVE);
        if(result_Check == ResultMessage.SUCCEED)
            System.out.println("评分成功");
        else
            System.out.println("评分失败");

    }
}
