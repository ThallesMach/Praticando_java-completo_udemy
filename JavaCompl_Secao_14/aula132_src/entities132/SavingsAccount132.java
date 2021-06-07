package entities132;

public class SavingsAccount132 extends Account132 {

	private Double interestRate;
	
	public SavingsAccount132() {
		super();
	}

	public SavingsAccount132(Integer nember, String holder, Double balance, Double interestRate) {
		super(nember, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override
	public final void withdraw(double amount) {
		balance -= amount;
	}
	
	
}
