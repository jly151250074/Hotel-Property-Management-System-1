package data.datahelper.impl;

import data.datahelper.AccountDataHelper;
import po.AccountPo;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Administrator
 * @version 2016-11-13
 * @description
 */
public class AccountDataTxtHelper implements AccountDataHelper {
    public Map<Integer, AccountPo> getAccountData() {
        Map<Integer, AccountPo> map = new HashMap<Integer, AccountPo>();
        File file = new File("TxtData/account.txt");
        try {
            InputStreamReader reader = new InputStreamReader(new FileInputStream(
                    file), "UTF-8");
            BufferedReader br = new BufferedReader(reader);
            String str = br.readLine();

            while (str != null) {

                String[] data = str.split(";");

                String username=data[0];
                String password=data[1];
                int Id = Integer.valueOf(data[2]);

                AccountPo accountPo=new AccountPo(username,password,Id);

                map.put(Id, accountPo);

                str = br.readLine();

            }

            br.close();

            return map;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updateAccountData(Map<Integer, AccountPo> map) {
        //写入用户数据
        File file = new File("TxtData/account.txt");
        try {
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter writer = new BufferedWriter(fw);

            //对map进行遍历
            Iterator<Map.Entry<Integer, AccountPo>> iterator = map.entrySet().iterator();
            while(iterator.hasNext()){
                Map.Entry<Integer, AccountPo> entry = iterator.next();
                AccountPo accountPo = entry.getValue();
                String str = accountPo.getMemberName()+";"+accountPo.getPassword()+";"+accountPo.getId();
                writer.write(str);
                writer.write("\r\n");
            }

            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
