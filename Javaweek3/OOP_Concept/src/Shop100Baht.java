import javax.swing.*;
public class Shop100Baht {

	public static void main(String[] args) {
		Product sold = new Product();
		
		int button = JOptionPane.showConfirmDialog(null, "is the program run on Pattanakarn Brunch?");
		if(button == 0) {
			sold = new PattanakarnBranch();
		}
		sold.setUnit(Integer.parseInt(JOptionPane.showInputDialog("Input the number of product:")));
		JOptionPane.showMessageDialog(null,sold);
	}

}
