
public class TestStudents {//26-1-2023

	public static void main(String[] args) {
		// Test Constructor and toString()
		Students methawin = new Students("Methawin Pikachi","1 Happy Ape");
		System.out.println(methawin);//toString()
		
		//Test Setters and Getters
		methawin.setAddress("108 Ramkamheange");
		System.out.println(methawin);
		System.out.println(methawin.getName());
		System.out.println(methawin.getAddress());
		
		methawin.addCourseGrade("INT107",98);
		methawin.addCourseGrade("INT108",95);
		methawin.addCourseGrade("MSC-202",99);
		methawin.printGrades();
		
		System.out.printf("The average grade is %.2f%n",methawin.getAverageGrade());
	}

}
