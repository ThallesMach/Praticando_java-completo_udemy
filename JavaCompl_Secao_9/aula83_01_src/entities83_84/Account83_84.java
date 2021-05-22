
//	----->Seção-9 Aula 83 e 84 - Correção do exercício de fixação 	--->22/05/2021.

package entities83_84;

public class Account83_84 {

	private int number;
	private String holder;
	private double balance;
	
	
	public Account83_84(int number, String holder) {
//		super();
		this.number = number;
		this.holder = holder;
	}


	public Account83_84(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);		//	this.balance = balance;
	}


	
	public int getNumber() {
		return number;
	}


//	public void setNumber(int number) {
//		this.number = number;
//	}


	public String getHolder() {
		return holder;
	}


	public void setHolder(String holder) {
		this.holder = holder;
	}


	public double getBalance() {
		return balance;
	}


//	public void setBalance(double balance) {
//		this.balance = balance;
//	}
	
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	// Saque
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	
	public String toString() {
		return " Account: " + number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}

}


/**
 * @author Thalles machado
 *
 */