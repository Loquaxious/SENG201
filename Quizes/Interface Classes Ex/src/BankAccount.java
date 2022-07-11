
public class BankAccount implements Measurable{
	private int accountNumber;
	private double balance;
	
	public double getBalance() {
		return balance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public double getMeasure() {
		return balance;
	}
}
