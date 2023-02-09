import java.util.Scanner;
public class ShapeDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Cylinder[] cylinder = new Cylinder[5];
		for(int i=0;i<cylinder.length;i++) {
			System.out.print("");
			double radius = scan.nextDouble();
			System.out.println("");
			double height = scan.nextDouble();
			cylinder[i] = new Cylinder(radius,height);
		}
		int n =1;
		for(Cylinder i : cylinder) {
			System.out.println("Cylinder "+n+", volume="+i.getVolume());
			n++;
		}
	}

}
