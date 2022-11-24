
import java.text.*;
import java.util.*;

public class PensionContributionCalculator {
	public static void main(String[] args) {

		final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
		final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
		final double EMPLOYEE_RATE_55_TO_60 = 0.13;
		final double EMPLOYER_RATE_55_TO_60 = 0.13;
		final double EMPLOYEE_RATE_60_TO_65 = 0.075;
		final double EMPLOYER_RATE_60_TO_65 = 0.09;
		final double EMPLOYEE_RATE_65_ABOVE = 0.05;
		final double EMPLOYER_RATE_65_ABOVE = 0.075;
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner answerme = new Scanner(System.in);
		System.out.print("Enter the monthly salary: $");
		int salary = answerme.nextInt();
		System.out.print("Enter the age: ");
		int age = answerme.nextInt();
		double ONE, TWO;
		if (age <= 55) {
			ONE = salary * EMPLOYEE_RATE_55_AND_BELOW;
			TWO = salary * EMPLOYER_RATE_55_AND_BELOW;
		} else if (age <= 60) {
			ONE = salary * EMPLOYEE_RATE_55_TO_60;
			TWO = salary * EMPLOYER_RATE_55_TO_60;
		} else if (age <= 65) {
			ONE = salary * EMPLOYEE_RATE_60_TO_65;
			TWO = salary * EMPLOYER_RATE_60_TO_65;
		} else {
			ONE = salary * EMPLOYEE_RATE_65_ABOVE;
			TWO = salary * EMPLOYER_RATE_65_ABOVE;
		}
		System.out.println("The employee's contributin is : $" + frm.format(ONE));
		System.out.println("The employer's contributin is : $" + frm.format(TWO));
		double total = ONE + TWO;
		System.out.println("The total contributin is : $" + frm.format(total));
	}

}
