import java.util.*;

public class Lab_Example603 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] number = new int[5];
		for (int i = 0; i < number.length; i++) {
			System.out.print("Input number ");
			number[i] = scan.nextInt();
		}
		int totalNumber = sumofPos(number);
		System.out.println("Sumation of positive number is "+totalNumber);
	}
	
	public static int sumofPos(int[] num) {
		int sum=0;
		for(int _num:num) {
			sum +=_num;
		}
		return sum;
	}
}
