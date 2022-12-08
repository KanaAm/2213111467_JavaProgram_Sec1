import java.util.*;


public class Lab504 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Please enter your name, separated by a space.\n:");
		String fullname = kb.nextLine();
		int space = fullname.indexOf(" ");
		String Firstname = fullname.substring(0,space);
		System.out.print(abbreviatName(fullname)+"."+Firstname);

	}
	public static String abbreviatName(String fullname) {
		String[] space = fullname.split(" ");
		return space[space.length-2].toUpperCase().charAt(0)+"."+space[space.length-1].toUpperCase().charAt(0);
	}

}
