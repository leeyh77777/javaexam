package exam1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
 
public class InputData {
    public void inputAddress() throws IOException {
        
        User us = new User(null, null, null);
        Scanners scs = new Scanners();
        
        System.out.println("주소록에 데이터를 추가합니다.\n이름을 입력해주세요.");
        us.setName(scs.getSc());
        
        
        System.out.println("나이를 입력해주세요.");
        us.setAge(scs.getSc());
        
        
        System.out.println("휴대폰번호를 입력해주세요.");
        us.setphoneNm(scs.getSc());
               
        


        
        File f = new File("test.csv");
        if(!f.exists()) {
            f.createNewFile();
            }
        
        Scanner fileSc = new Scanner(f);
        String result = "";
        
        
        while (fileSc.hasNext()) {
            String temp = fileSc.nextLine();
            
            User us_original = new User(temp.split(", ")[0], temp.split(", ")[1], temp.split(", ")[2]);
 
            result = result + us_original.getName() + ", " + us_original.getAge() + ", " +  us_original.getphoneNm() +  '\n';
        }
        fileSc.close();
        PrintWriter pw = new PrintWriter(f);
        
        try{
            pw.println(result +us.getName() + ", " + us.getAge() +  ", " + us.phone_format(us.getphoneNm()));
        
            pw.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        
        System.out.println("데이터를 입력완료 되었습니다.\n");              
    } 
}


