import javax.swing.JOptionPane;

public class Lab502 {

	static String Email;

	public static void main(String[] args) {
		inputEmail(); // call inputEmail method, method is not return value

	}

	static void inputEmail() {
		String ans = "";
		do {
			Email = JOptionPane.showInputDialog("Input your e-mail");
			checkEmail(Email);
			ans = JOptionPane.showInputDialog("Continu[y||Y to continue] : ").toLowerCase();
		} while (ans.equalsIgnoreCase("y"));
	}

	private static void checkEmail(String email) {
		while (email.startsWith("@") || email.contains(" ")) {
			email = JOptionPane.showInputDialog("Input your e-mail,again:");
		}
		boolean checkEmail = email.endsWith("@gmail.com") || email.endsWith("@hotmail.com");
		JOptionPane.showMessageDialog(null,
				(checkEmail) ? "Your e-mail is " + email : "Your e-mail is not hotmail or gmail dot com");

	}
}
