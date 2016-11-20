package po;

/**
 * @ author Lienming
 * @ version 2016/11/18
 * @ description
 */
public class AccountPo {
    private String memberName;
    private String password;
    private int id;
    private int logState=0;

    public AccountPo(String memberName,String password,int id,int logState){
        this.memberName=memberName;
        this.password=password;
        this.id=id;
        this.logState=logState;
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
