package data.datahelper.impl;

import data.datahelper.MemberDataHelper;

import po.MemberPo;
import common.Sex;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Administrator on 2016-11-13.
 */
public class MemberDataTxtHelper implements MemberDataHelper {

    public Map<Integer, MemberPo> getMemberData(){
        Map<Integer, MemberPo> map = new HashMap<Integer, MemberPo>();
        File file = new File("TxtData/member.txt");
        try {
            InputStreamReader reader = new InputStreamReader(new FileInputStream(
                    file), "UTF-8");
            BufferedReader br = new BufferedReader(reader);
            String str = br.readLine();

            while (str != null) {

                String[] data = str.split(";");

                int Id = Integer.valueOf(data[0]);
                String username=data[1];
                String phone=data[2];
                String address = data[3];
                Sex sex = Sex.MALE;// !!!
                int credit=Integer.valueOf(data[5]);

                MemberPo memberPo=new MemberPo(Id,username,phone,address,sex,credit);

                map.put(Id, memberPo);

                str = br.readLine();

            }

            br.close();

            return map;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updateMemberData(Map<Integer, MemberPo> map){
//写入用户数据
        File file = new File("TxtData/member.txt");
        try {
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter writer = new BufferedWriter(fw);

            //对map进行遍历
            Iterator<Map.Entry<Integer, MemberPo>> iterator = map.entrySet().iterator();
            while(iterator.hasNext()){
                Map.Entry<Integer, MemberPo> entry = iterator.next();
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
