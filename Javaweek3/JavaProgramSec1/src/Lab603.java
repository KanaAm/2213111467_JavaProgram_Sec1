import java.util.Scanner;

public class Lab603 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] numberofinteger = {78, 36, 58, 41, 25, 92,75};
		
		System.out.print("Input index of array : ");
		int indexofarray = scan.nextInt();
		while(indexofarray<0||indexofarray>(numberofinteger.length-1)) {
			System.out.print("Input index of array, again : ");
			indexofarray = scan.nextInt();
		}
		System.out.println();
		System.out.println("Value in cerrent index is "+numberofinteger[indexofarray]);
		if (indexofarray == 6) {
			System.out.println("Sorry, "+ indexofarray + " is the last index in array.");
		}
		else {
			System.out.println("Value in next index is "+(numberofinteger[indexofarray + 1]));
		}
	}

}
