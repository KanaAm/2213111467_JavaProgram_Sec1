import java.util.*;

public class TestStudent {
	static Student st = new Student();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("How many student in classroom : ");
		int student = scan.nextInt();
		System.out.println();
		Student[] std = new Student[student];
		for (int i = 0; i < std.length; i++) {
			std[i] = new Student();
			System.out.println("---------------------------------");
			System.out.print("Input student name   : ");
			std[i].setName(scan.next());
			System.out.print("Input student score  : ");
			std[i].setScore(scan.nextInt());
			while (!std[i].checkScore()) {
				System.out.print("Input student score, again : ");
				std[i].setScore(scan.nextInt());
			}

			System.out.println();
		}
		System.out.println();
		System.out.println("---------------------------------");
		for (Student stds : std) {
			
				System.out.println(">> " + stds.getName() + " get grade " + stds.findGrade());
			
		}
	}

}
