import javax.swing.*;
import java.text.*;
import java.util.Random;

public class Lab303 {
	public static void main(String[] args) {
		Random rand = new Random();
		DecimalFormat frm = new DecimalFormat("#,###");
		int balance = rand.nextInt(9) * 100000;
		int withdraw = Integer.parseInt(JOptionPane.showInputDialog("Your balance:"+balance
										+"\nInput money to withdraw:"));
		int sum = withdraw;
		int thou=sum/1000;
		int five=(sum%1000)/500;
		int one=(sum%1000)%500/100;
		
		if (withdraw>balance)
		{
			JOptionPane.showMessageDialog(null,"Error:Cannot withdraw more than balance","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if(withdraw>=20000) 
		{
			JOptionPane.showMessageDialog(null,"Error:Cannot withdraw more than 20,000","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if(withdraw%100!=0)
		{
			int hm = withdraw%100;
			JOptionPane.showMessageDialog(null,"Error:Cannot withdraw " +hm+"baht.","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else 
		{
			JOptionPane.showMessageDialog(null,"You withdraw"+frm.format(withdraw)+"baht."+
												"\n1,000="+thou+"\n500="+five+"\n100="+one);
		}
	
	}

}
