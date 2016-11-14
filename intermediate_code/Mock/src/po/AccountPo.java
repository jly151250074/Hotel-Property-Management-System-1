package po;

/**
 * @ author Molloh
 * @ version 2016/11/6
 * @ description
 */
public class AccountPo {
    private String memberName;
    private String password;
    private int id;
    public AccountPo(String memberName,String password,int id){
        this.memberName=memberName;
        this.password=password;
        this.id=id;
    }

    public String getMemberName(){ return this.memberName; }
    public void setMemberName(String memberName){ this.memberName=memberName; }

    public String getPassword(){ return this.password; }
    public void setPassword(String password){ this.password=password; }

    public int getId(){ return this.id; }
    public void setId(int id){ this.id = id;}
}
