import java.util.*;

public class Lab403 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Message : ");
		String word = kb.nextLine();
		String lword = word.toLowerCase();
		if(lword.indexOf("nichi")>=0)
		{
			System.out.println("Nichi is a sentence");
		}
		else {
			System.out.println(word);
		}
	}

}
