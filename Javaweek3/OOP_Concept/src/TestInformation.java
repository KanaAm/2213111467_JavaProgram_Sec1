import javax.swing.*;
public class TestInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name  = JOptionPane.showInputDialog("Input author name:");
		String email = JOptionPane.showInputDialog("Input author email:");
		String title = JOptionPane.showInputDialog("Input book title:");
		
		int button = JOptionPane.showConfirmDialog(null, "Do you confirm your e-mail");
		if (button ==1) {
			email = JOptionPane.showInputDialog("Input author email,again:");
		}
		Book1 name1 = new Book1(title,new Author (name,email),0);
	    JOptionPane.showMessageDialog(null,"Book Title:"+name1.getTitle()+"\nAuthor name:"+name1.getAuthor().getName()+"\nAuthor e-mail:"+name1.getAuthor().getEmail());
	}

}
