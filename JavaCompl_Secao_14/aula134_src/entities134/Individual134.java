package entities134;

public class Individual134 extends TaxaPayer134{

	private Double healthExpenditures;
	

	public Individual134(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}


	public Double getHealthExpenditures() {
		return healthExpenditures;
	}


	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}


	@Override
	public Double tax() {
		if (getAnualIncome() < 20000.0) {
			return getAnualIncome()* 0.15 - healthExpenditures * 0.5;
		} 
		else {
			return getAnualIncome()* 0.25 - healthExpenditures * 0.5;

		}
	}
	
	

}
