package vo;

import po.AccountPo;

public class AccountVo {
    private String memberName;
    private String password;
    private int id;
    private int logState=0;

    public AccountVo(AccountPo po){
        this.memberName=po.getMemberName();
        this.password=po.getPassword();
        this.id=po.getId();
        this.logState=po.getLogState();
    }


    public String getMemberName(){ return this.memberName; }
    public void setMemberName(String memberName){ this.memberName=memberName; }

    public String getPassword(){ return this.password; }
    public void setPassword(String password){ this.password=password; }

    public int getId(){ return this.id; }
    public void setId(int id){ this.id = id;}

    public int getLogState(){ return this.logState; }
    public void setLogState(int set){ this.logState=set; }
}
