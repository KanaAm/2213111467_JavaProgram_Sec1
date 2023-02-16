import java.io.*;
import java.util.Scanner;

public class SaveandOpen extends Employee{
	private String name,dept;
	
	public void insert() throws IOException{
		Scanner console = new Scanner(System.in);
		PrintStream prs = new PrintStream(new File("employee.txt"));
		String answer;
		do {
			super.header();
			System.out.print("Enter name : ");
			name = console.next();
			System.out.print("Enter departmanet : ");
			dept = console.next();
			prs.println(name+"\t+dept");
			System.out.println("Enter data again? : ");
			answer = console.next();
		}while(answer.equalsIgnoreCase("y"));
		
	}//end of insert method
	public void read(){
		try {
			Scanner in = new Scanner(new File("emploee.txt"));
			int i = 0;
			boolean check = false;
			super.header();
			while(in.hasNext()) {
				name = in.next();
				dept = in.next();
				if(dept.equalsIgnoreCase(super.getDept())) {
					i++;
					System.out.print(i+") "+name);
					check = true;
				}
			}
			if(check) {
				super.header();
				System.out.println("Employee in department "+ super.getDept()+
						" is "+ i + "person.");
				super.header();
			}else {
				System.out.print("\nSorry,no department : "+super.getDept()+" in file.");
			}
		}catch(IOException e) {
			System.out.print("\nSorry,file not found...");
		}
	}

}
