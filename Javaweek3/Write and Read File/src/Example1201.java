import java.io.*;
import java.util.Scanner;
public class Example1201 {

	public static void main(String[] args) throws IOException{
	Scanner read = new Scanner(new File("MemberLogin.txt"));
	while(read.hasNext()) {
		String fname = read.next();
		String lname = read.next();
		read.next();//Read data3 Password But Skip
		String email = read.next().toUpperCase();
		System.out.println(fname + " (" + email + ")");
	}
	read.close();
	}

}
