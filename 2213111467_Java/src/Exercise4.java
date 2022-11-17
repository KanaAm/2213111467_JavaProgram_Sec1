import java.text.*;
import javax.swing.JOptionPane;

public class Exercise4 {
	static final double TAX_RATE = 0.0625;

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.#####");
		DecimalFormat sdf = new DecimalFormat("#.#");
		NumberFormat f2 = NumberFormat.getCurrencyInstance();
		NumberFormat f3 = NumberFormat.getPercentInstance();
		DecimalFormat one = new DecimalFormat("#.#");
		DecimalFormat daf = new DecimalFormat("#.#####");
		// TODO Auto-generated method stub
		String cdID, cdTitle;
		cdID = JOptionPane.showInputDialog(
				"This program calculates the total cost of a CD order \nPlease enter the ID of the CD");
		cdTitle = JOptionPane.showInputDialog("Please enter the title of the CD");
		String cdQuantity;
		double cdSubtotal, cdTotal;
		String cdPrice;// double
		cdPrice = JOptionPane.showInputDialog("Please enter the price of the CD in U.S. dollars");
		double DcdPrice = Double.parseDouble(cdPrice);
		cdQuantity = JOptionPane.showInputDialog("Please enter the quantity to be purchase");
		double DcdQuantity = Double.parseDouble(cdQuantity);
		cdSubtotal = DcdPrice * DcdQuantity;

		cdTotal = cdSubtotal * (1 + TAX_RATE);
		JOptionPane.showMessageDialog(null,
				"Summary of the transacton\n\n" + "CD ID:" + cdID + "\nCD Title:" + cdTitle + "\nCD Unit Price:"
						+ f2.format(DcdPrice) + "\nCD Quantity:" + one.format(DcdQuantity) + "\n\nSubtotal:" + "$"
						+ sdf.format(cdSubtotal) + "\nTax rate:" + (TAX_RATE * 100) + "%" + "\nTotal:" + "$"
						+ df.format(cdTotal) + "\n\nEnd of Program");
	}

}
