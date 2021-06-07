package entities132;

public abstract class Account132 {
	
	private Integer nember;
	private String holder;
	protected Double balance;
	
	public Account132() {
	}

	public Account132(Integer nember, String holder, Double balance) {
		super();
		this.nember = nember;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNember() {
		return nember;
	}

	public void setNember(Integer nember) {
		this.nember = nember;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	
	public void withdraw(double amount) {
		balance -= amount + 5;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	

}
