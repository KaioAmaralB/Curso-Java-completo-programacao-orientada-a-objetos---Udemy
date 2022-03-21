package entities;

public class Account {

	private int number;
	private String holder;
	private double balance;

	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public String getHolder(String holder) {
		return holder;
	}

	public int getNumber(int number) {
		return number;
	}

	public double getBalance(double balance) {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account"
				+ number
				+ ", Holder: "
				+ holder 
				+ ", Balace: $ "
				+ String.format("%2.f", balance);
	}
}
