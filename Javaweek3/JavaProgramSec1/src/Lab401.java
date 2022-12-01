import java.util.*;

public class Lab401 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String fullname = "";
		System.out.print("Full Name : ");
		fullname = kb.nextLine();
		if(!fullname.contains(" ")) {
			System.out.println("Incorrect Name");
			return;
		}
		int spaceIndex =fullname.indexOf(" ");
		String Firstname = fullname.substring(0,spaceIndex).toUpperCase();
		String Lastname = fullname.substring(spaceIndex,fullname.length()).toLowerCase();
		System.out.println("First name: "+Firstname);
		System.out.println("Last name:"+Lastname);
		
	}
}
