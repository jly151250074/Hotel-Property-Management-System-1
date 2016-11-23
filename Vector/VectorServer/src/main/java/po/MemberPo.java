package po;

import common.Sex;

/**
 * @ author lienming
 * @ version Nov 13,2016
 * @ description
 */
public class MemberPo {
    private  int id;
    private  int credit;
    private  String name;
    private  String phone;
    private  String address;
    private  Sex sex;

    public MemberPo(int id,String name, String phone, String address,
                      Sex sex,int credit)
    {
        this.id=id;
        this.name=name;
        this.phone=phone;
        this.address=address;
        this.sex=sex;
        this.credit=credit;
    }

    public int getId(){ return this.id; }
    public void setId(int id){ this.id=id;}

    public int getCredit(){ return this.credit; }
    public void setCredit(int credit){this.credit=credit; }

    public String getName(){ return this.name; }
    public void setName(String name){this.name=name; }

    public String getPhone(){ return this.phone; }
    public void setPhone(String phone){ this.phone=phone; }

    public String getAddress(){ return this.address; }
    public void setAddress(String address){ this.address=address; }

    public Sex getSex(){ return this.sex; }
    public void setSex(Sex sex){ this.sex = sex ; }


}
