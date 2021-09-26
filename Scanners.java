package exam1;

import java.util.Scanner;

public class Scanners {
	private Scanner sc = new Scanner(System.in);
	
	public String getSc() {
		return sc.nextLine();
	}
	
	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	
	public void ScClose() {
		this.sc.close();
	}

}
