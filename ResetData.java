package exam1;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;
 
public class ResetData {
    public void resetAddress() throws IOException, FileNotFoundException {
        File f = new File("test.csv"); 
      	Scanner scanner = new Scanner(System.in);
        if(!f.exists()) {
            f.createNewFile();
            }
        System.out.println("�ʱ�ȭ�� 1��, �޴��̵��� 2���� �Է����ּ���");
        
		int i;
		String input = scanner.nextLine();
		i = Integer.parseInt(input);
		
		try {
				if(i == 1) {
					PrintWriter pw= new PrintWriter(f);
					pw.close();
			        System.out.println("�ּҷ��� �ʱ�ȭ �Ǿ����ϴ�.");
				} else if (i == 2) {
					Main.main(null);
				} else {
					System.out.println("�Է��� �߸��Ǿ����ϴ�.");
					resetAddress();
				}
		} catch (NumberFormatException e) {
			System.out.println("�Է��� �߸��Ǿ����ϴ�.");
			resetAddress();	
		}
				scanner.close();
			}
    	
   
    }
    
