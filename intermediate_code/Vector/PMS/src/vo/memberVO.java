package vo;

import common.Sex;
import po.MemberPo;

public class MemberVo {
	private  int id;
	private  int credit;
	private  String name;
	private  String phone;
	private  String address;
	private  Sex sex;

	public MemberVo(MemberPo po){
		this.id=po.getId();
		this.credit=po.getCredit();
		this.name=po.getName();
		this.phone=po.getPhone();
		this.address=po.getAddress();
		this.sex=po.getSex();
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
