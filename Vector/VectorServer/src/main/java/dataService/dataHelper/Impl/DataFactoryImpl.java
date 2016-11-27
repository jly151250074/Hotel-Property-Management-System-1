package dataService.dataHelper.Impl;

import common.Sex;
import dataService.dataHelper.MemberDataHelper;
import po.MemberPo;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Updated by lienming on 2016-11-27.
 */
public class MemberDataTxtHelper implements MemberDataHelper {

    public Map<String, MemberPo> getMemberData(){
        Map<String, MemberPo> map = new HashMap<String, MemberPo>();
        File file = new File("src/txtData/member.txt");
        try {
            InputStreamReader reader = new InputStreamReader(new FileInputStream(
                    file), "UTF-8");
            BufferedReader br = new BufferedReader(reader);
            String str = br.readLine();

            while (str != null) {
                String[] data = str.split(";");

                String Id = data[0];
                String username=data[1];
                String phone=data[2];
                String address = data[3];
                Sex sex;
                if(data[4].equals("MALE"))
                	 sex = Sex.MALE;
                else sex = Sex.FEMALE;
                int credit=Integer.parseInt(data[5]);

                MemberPo memberPo=new MemberPo(Id,username,phone,address,sex,credit);

                map.put(Id, memberPo);

                str = br.readLine();

            }

            br.close();

            return map;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    public void updateMemberData(Map<String, MemberPo> map){
    	//写入用户数据
        File file = new File("src/txtData/member.txt");
        try {
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter writer = new BufferedWriter(fw);

            //对map进行遍历
            Iterator<Map.Entry<String, MemberPo>> iterator = map.entrySet().iterator();
            while(iterator.hasNext()){
                Map.Entry<String, MemberPo> entry = iterator.next();
                MemberPo memberPo = entry.getValue();
                String str = memberPo.getId()+";"+memberPo.getName()+";"+memberPo.getPhone()+";"
                        +memberPo.getAddress()+";"+memberPo.getSex()+";"+memberPo.getCredit();
                writer.write(str);
                writer.write("\r\n");
            }

            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
