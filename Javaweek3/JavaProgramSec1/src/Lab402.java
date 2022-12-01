import java.util.*;

public class Lab402 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		String word = kb.nextLine();
		while(!word.endsWith(".")) {
			System.out.print("The sentence must end with full stop point : ");
			word = kb.nextLine();
			if(word.endsWith(".")) {
				break;
			}
		}
		System.out.println();
		int numberofindex = 0;
		String formatSentence = word.replace("."," ");
		System.out.println();
		for (int i = 0; i < word.length(); i++) {
			if (formatSentence.charAt(i) == ' ') {
				System.out.println(formatSentence.substring(numberofindex,i));
				numberofindex=i+1;
			}
		}
	}

}
