
public class ATMData {
	private String accountNumber = "";
	private String password = "";
	public ATMData(String acnid,String acnpass) {
		this.accountNumber=acnid;
		this.password = acnpass;
	}
	public String getID() {
		return accountNumber;
	}
	public String getPass() {
		return password;
	}
}
