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
        System.out.println("초기화는 1번, 메뉴이동은 2번을 입력해주세요");
        
		int i;
		String input = scanner.nextLine();
		i = Integer.parseInt(input);
		
		try {
				if(i == 1) {
					PrintWriter pw= new PrintWriter(f);
					pw.close();
			        System.out.println("주소록이 초기화 되었습니다.");
				} else if (i == 2) {
					Main.main(null);
				} else {
					System.out.println("입력이 잘못되었습니다.");
					resetAddress();
				}
		} catch (NumberFormatException e) {
			System.out.println("입력이 잘못되었습니다.");
			resetAddress();	
		}
				scanner.close();
			}
    	
   
    }
    
