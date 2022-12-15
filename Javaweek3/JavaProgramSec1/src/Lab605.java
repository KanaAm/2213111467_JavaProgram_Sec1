import javax.swing.*;

public class Lab605 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[5];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(JOptionPane.showInputDialog("input number "+(i+1)+":"));
		}
		showEven(nums);
		showOod(nums);
	}

	public static void showEven(int[] number) {
		String space = "";
		for(int even:number) {
			if(even%2==0) {
				space = space +even+" ";
			}
		}
		
		JOptionPane.showMessageDialog(null, "List of Even number:"+"\n"+space);

	}

	public static void showOod(int[] number) {
		String space = "";
		for(int Odd:number) {
			if(Odd%2!=0) {
				space = space +Odd+" ";
			}
		}
		
		JOptionPane.showMessageDialog(null, "List of Ood number:"+"\n"+space);

	}
}