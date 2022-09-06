package entities;

public class Account {
	private String name;
	private Double balance = 0.00;
	private int accountNumber;
	
	public Account(String name, Double balance, int accountNumber) {
		super();
		this.name = name;
		this.balance = balance;
		this.accountNumber = accountNumber;
	}

	public Account(String name, int accountNumber) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", balance=" + balance + ", accountNumber=" + accountNumber + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBalance() {
		return balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void withdraw(Double value) {
		//withdraw tax is 5.
		this.balance -= (value + 5);
	}
	
	public void deposit(Double value) {
		this.balance += value;
	}
}
