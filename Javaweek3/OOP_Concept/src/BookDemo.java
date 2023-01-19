import java.util.*;
public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book bk = new Book();
		Scanner scan = new Scanner(System.in);
		System.out.print("Input book title    : ");
		bk.setTitle(scan.nextLine());
		System.out.print("Input book price    : ");
		bk.setPrice(scan.nextFloat());
		System.out.print("Input publish year  : ");
		bk.setPublishyear(scan.nextInt());
		//bk.setTitle("The Blue Moon");
		//bk.setPrice(290.15f);
		//bk.setPublishyear(2011);
		
		//System.out.println("Input book title    : "+bk.getTitle()
						//+"\nInput book price    : "+bk.getPrice()
						//+"\nInput publish year  : "+bk.getPublishyear());
		System.out.println("\n"+bk.toString());
		
	}

}
