package dataService.dataHelper;

import po.MemberPo;

import java.util.Map;

public interface MemberDataHelper {

    public Map<Integer, MemberPo> getMemberData();

    public void updateMemberData(Map<Integer, MemberPo> map);
}
