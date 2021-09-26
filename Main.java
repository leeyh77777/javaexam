package exam1;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		
		InputData ipd = new InputData();
		PrintData prd = new PrintData();
		ResetData rsd = new ResetData();
		Scanners scs = new Scanners();
		
		String i;
		
		while(true) {
			try {
				System.out.println("  1. �ּҷ� �б�\n" + "  2. �ּҷ� �߰�\n" + "  3. �ּҷ� �ʱ�ȭ\n" + "  4. ����");
				i = scs.getSc();
				switch(i) {
				case "1":
					prd.printAddress();
					break;
				case "2":
					ipd.inputAddress();
					break;
				case "3":
					rsd.resetAddress();
					break;
				case "4":
					System.out.println("�����մϴ�.");
					scs.ScClose();;
					System.exit(0);
					break;
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
	
}
