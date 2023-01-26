
public class Invoice {
	private int id;
	private Customer customer;
	private double amount;
	public Invoice(int id,Customer customer,double amount) {
		id=0;
		amount=0;
	}
	public int getID() {
		return this.id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getCustomerID() {
		return id;
	}
	public String getCustomerName() {
		return customer.getName();
	}
}
