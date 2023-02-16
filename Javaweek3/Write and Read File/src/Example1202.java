import java.io.*;
import java.util.Scanner;
public class Example1202 {
	/**use BufferedReader Class*/
	static Scanner input= new Scanner(System.in);//define object for input data form keyboard
	public static void main(String[] args) throws IOException{
		//use BufferedReader Class
		System.out.print("Input Section: ");
		int section = input.nextInt();
		Header(section);
		showListStudent(section);
	}
	
	public static void showListStudent(int sec) throws IOException{
		BufferedReader read = new BufferedReader(new FileReader("List107.txt"));
		String temp="";
		while((temp=read.readLine())!= null) {
			String[] data = temp.split("\t");
			double midtermScore = Double.parseDouble(data[4]);
			double finalScore = Double.parseDouble(data[5]);
			String resultGrade = resultGrade(midtermScore,finalScore);
			if(Integer.parseInt(data[3])==sec) {
				System.out.println(data[0]+" "+data[2]+"\t"+midtermScore+"\t"+finalScore+"\t"+resultGrade);
			}
		}
	}
	public static String resultGrade(double mid,double fin) {
		double totalScore = mid+fin;
		if(totalScore<=40) return "Fail";
		else return "Pass";
	}
	public static void Header (int sec) {
		System.out.println("*************************************************************************");
		System.out.println("\t\tList of Data for Section "+sec);
		System.out.println("*************************************************************************");
	}

}
