import java.io.*;
import java.util.Scanner;

public class EmployeeInfo {

	public static void main(String[] args) throws IOException {
		Scanner console = new Scanner(System.in);
		String choice;
		System.out.print("Insert or Read data(from File)? : ");
		choice = console.next().toLowerCase();
		while(!choice.equals("insert") && !choice.equals("read")){
			System.out.print("Insert or Read data? : ");
			choice = console.next().toLowerCase();
			
		}
		SaveandOpen file = new SaveandOpen();//call class
		if(choice.equals("insert")) {
			
		}
		else {
			System.out.print("\nEnter department: ");
			choice = console.next();
			file.setDept(choice);
			file.read();
		}

	}

}
