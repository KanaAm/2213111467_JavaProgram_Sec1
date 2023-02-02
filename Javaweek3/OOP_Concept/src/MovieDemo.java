import java.util.Scanner;

public class MovieDemo {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		System.out.print("Input movie id    : ");
		String mId = kb.nextLine();
		System.out.print("Input movie name  : ");
		String mName = kb.nextLine();
		System.out.println();
		System.out.print("Input director name	: ");
		String dirName = kb.nextLine();
		System.out.print("Input director e-mail	: ");
		String dirEmail = kb.nextLine();
		System.out.print("Input director gender	: ");
		String dirgender = kb.nextLine();

		while (!dirgender.equalsIgnoreCase("m") && !dirgender.equalsIgnoreCase("f")) {
			System.out.print("Input director gender, again	: ");
			dirgender = kb.nextLine();
		}
		System.out.println();

		System.out.print("Input movie theater no.	 : ");
		int theaterNo = kb.nextInt();

		while (theaterNo < 1 || theaterNo > 15) {
			System.out.print("Please input 1 - 15 only : ");
			theaterNo = kb.nextInt();
		}

		Theater theater = new Theater(mId, mName, new Director(dirName, dirEmail, dirgender.charAt(0)), theaterNo);

		System.out.println();
		System.out.println(theater);
	}

}