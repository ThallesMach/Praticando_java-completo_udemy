package entities134;

public abstract class TaxaPayer134 {
	
	private String name;
	private Double anualIncome;
	
	
	public TaxaPayer134(String name, Double anualIncome) {
//		super();
		this.name = name;
		this.anualIncome = anualIncome;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getAnualIncome() {
		return anualIncome;
	}


	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	public abstract Double tax();
	

}
