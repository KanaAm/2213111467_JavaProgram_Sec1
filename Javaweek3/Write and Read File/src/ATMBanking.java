import java.io.*;
import java.util.Scanner;
public class ATMBanking {

	public static void main(String[] args) throws IOException{
		try {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter account number : ");
		String acn = scan.next();
		System.out.print("Enter password : ");
		String paword = scan.next();
		System.out.print("Enter money : ");
		int money = scan.nextInt();
		System.out.println();
		ATMChecking bank = new ATMChecking(acn,paword,money);
		bank.show();
		}catch(IOException e) {
			System.out.println("Sorry, your id or password is wrong, or your amount not enough.")
		}
	}

}
