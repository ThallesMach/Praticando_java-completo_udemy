package entities132;

public class BusinessAccount132 extends Account132 {
	
	private Double loanLimit;
	
	public BusinessAccount132() {
		super();
	}

	public BusinessAccount132(Integer nember, String holder, Double balance, Double loanLimit) {
		super(nember, holder, balance);
		this.loanLimit = loanLimit;
	}


	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance +=amount - 10.0;
		}
	}
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}

}
