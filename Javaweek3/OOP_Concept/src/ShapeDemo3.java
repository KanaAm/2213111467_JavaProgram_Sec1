import javax.swing.JOptionPane;

public class ShapeDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder[] cylinder = new Cylinder[5];
		for (int i = 0; i < cylinder.length; i++) {
			double radius = Double.parseDouble(JOptionPane.showInputDialog("Input radius " + (i + 1) + ":"));
			double height = Double.parseDouble(JOptionPane.showInputDialog("Input height " + (i + 1) + ":"));
			cylinder[i] = new Cylinder(radius, height);

		}
		int numc = 1;
		String stext = "";

		for (Cylinder cylinderz : cylinder) {
			stext = stext + "Cylinder " + numc + ", volume=" + cylinderz.getVolume() + "\n";
			numc++;
		}

		JOptionPane.showMessageDialog(null, stext);

	}

}
