package exam1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
 
public class PrintData {
    public void printAddress() throws IOException {
        System.out.println(" �ּҷ��� �����͸� ����մϴ�.\n �̸� | ���� | ��ȭ��ȣ");
        
 
        
        File f = new File("test.csv");
        if(!f.exists()) {
            f.createNewFile();
            }
                
        Scanner sc = new Scanner(f);
        String result = "";
        
        while (sc.hasNext()) {
            String temp = sc.nextLine();
            User us = new User(temp.split(", ")[0], temp.split(", ")[1], temp.split(", ")[2]);
 
            result = result + us.getName() + " | " + us.getAge() + " | " + us.phone_format(us.getphoneNm()) + '\n';
        }
 
        sc.close();
        System.out.println(result + "\n ������ �ҷ��Խ��ϴ�. ");
    }
}
 
