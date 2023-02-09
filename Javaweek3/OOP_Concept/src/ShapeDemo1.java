import java.util.*;
public class ShapeDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String color = null;
		System.out.print("");
		double radius = scan.nextDouble();
		System.out.print("");
		double height = scan.nextDouble();
		
		Circle circle = new Circle(radius,color);
		System.out.println("Circle["+circle.toString()+"]");
		System.out.println("Circle[area="+circle.getArea()+"]");
		System.out.println();
		System.out.println();
		Cylinder cylinder = new Cylinder(radius,height);
		System.out.println("Cylinder["+cylinder.toString()+"]");
		System.out.println("Cylinder[area="+cylinder.getArea()+"]");
		System.out.println("Cylinder[volume="+cylinder.getVolume()+"]");
	}

}
