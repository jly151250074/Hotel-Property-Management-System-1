package myTest;

import java.rmi.RemoteException;

import common.Sex;
import po.MemberPo;
import presentation.controller.MemberMainViewControllerService;
import presentation.controller.Impl.MemberMainViewControllerServiceImpl;
import vo.MemberVo;

public class MemberTest {
	
	MemberMainViewControllerService test = MemberMainViewControllerServiceImpl.getInstance() ;
	
	String testId = "N00001";
	
	MemberPo po = new MemberPo("N00002","Jiang","123456789","Beijing",Sex.MALE,600);
	MemberVo vo = new MemberVo(po);
	
	public void chargeCredit() throws RemoteException{
		test.chargeCredit(testId, 30);
		
	}
	
	public void getCredit() throws RemoteException{
		System.out.println( test.getCredit(testId) );
	}
	
	
	
	public void modifyInfo()throws RemoteException{
		test.modifyInfo(vo);
	}
	
	public void getInfo()throws RemoteException{
		MemberVo vo = test.getInfo(testId);
		System.out.print(vo.getId()+";"+vo.getName()+";"+vo.getAddress()+";"+
				vo.getPhone()+";"+vo.getSex()+";"+vo.getCredit()+"\r\n");
	}
	
}
