import javax.swing.*;
public class BookDemo2 {

	public static void main(String[] args) {
		//Author author = new Author(name,email);
		String name=JOptionPane.showInputDialog("Input author name:");
		String email=JOptionPane.showInputDialog("Input author e-mail");
		String title=JOptionPane.showInputDialog("Input book title:");
		int page =Integer.parseInt(JOptionPane.showInputDialog("Input book page:"));
	    int response = JOptionPane.showConfirmDialog(null, "Is the page correct", "Confirm",
	        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
	    while (response == JOptionPane.NO_OPTION) {
	    	page = Integer.parseInt(JOptionPane.showInputDialog("Input book page,again:"));
	    }
	    //Author author = new Author(name,email);
	    Book1 name1 = new Book1(title,new Author (name,email),page);
	    JOptionPane.showMessageDialog(null,"Book Title:"+name1.getTitle()+"\nAuthor name:"+name1.getAuthor().getName()+"("+name1.getPage()+
	    									" page)"+"\nAuthor e-mail:"+name1.getAuthor().getEmail());
			
		}
		
	}
	


