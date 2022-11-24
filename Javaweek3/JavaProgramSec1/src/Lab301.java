import javax.swing.*;
import java.text.*;

public class Lab301 {
	static final int pricePerson = 299;

	public static void main(String[] args) {
		int memberCard;
		DecimalFormat frm = new DecimalFormat("#,###.00");
		int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customber per bill?"));
		double totalPrice = pricePerson * numberofCustomer;
		do {
		 memberCard = JOptionPane.showConfirmDialog(null,
				"Total Price is " + totalPrice + " baht." + "\nDo you have a member card?");
		}while(memberCard ==2);
		double totalpricewithDiscount;
		if (memberCard == 0) {
			totalpricewithDiscount = totalPrice * 90 / 100; // totalPrice+(totalPrice*10/100);
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + frm.format(totalpricewithDiscount) + " Baht.");
		} else if (memberCard == 1) {
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + frm.format(totalPrice) + " Baht.");
		}

	}
}
