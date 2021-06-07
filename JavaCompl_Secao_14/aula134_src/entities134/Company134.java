package entities134;

public class Company134 extends TaxaPayer134 {

	private Integer numberOfEmployee;
	

	public Company134(String name, Double anualIncome, Integer numberOfEmployee) {
		super(name, anualIncome);
		this.numberOfEmployee = numberOfEmployee;
	}

	
	public Integer getNumberOfEmployee() {
		return numberOfEmployee;
	}


	public void setNumberOfEmployee(Integer numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}




	@Override
	public Double tax() {
			if (numberOfEmployee > 10) {
				return getAnualIncome()* 0.14;
			} 
			else {
				return getAnualIncome()* 0.16;

			}
	}
	

}
