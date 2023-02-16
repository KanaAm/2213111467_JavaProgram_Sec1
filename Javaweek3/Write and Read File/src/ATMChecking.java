import java.io.File;
import java.util.Scanner;

public class ATMChecking extends ATMData{
	private int money;
	public ATMChecking(String accountnumber,String password,int money) {
		super(accountnumber,password);
		this.money = money;
	}
	public boolean chcekBookBank() throws IOException{
		Scanner read = new Scanner(new File("BookBank.txt"));
		boolean check = false;
		while(read.hasNext()) {
		String accountid = read.next();
		String password = read.next();
		String moneyid = read.next();
		}
		return check;
	}
	public void show() {
		
		System.out.println("You drawing for "+money+", get"
				+ "\n 1000 = "+ money/1000
				+ "\n 500  = "+ money%1000/500
				+ "\n 100  = "+ money%1000%500/100 
				+ "\nYour balance is "+money);
		
	}
}
