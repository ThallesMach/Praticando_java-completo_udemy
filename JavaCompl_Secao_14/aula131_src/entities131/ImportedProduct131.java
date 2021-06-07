package entities131;

public class ImportedProduct131 extends Product131 {
	
	private Double customsFee;

	public ImportedProduct131(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	
	public Double totalPrice() {
		return getPrice() + customsFee;
	}
	
	@Override
	public String priceTag() {
		return getName() +" $ "
				+String.format("%.2f", totalPrice() )
				+" (Custmos fee: $ "
				+String.format("%.2f", customsFee)
				+" ) ";
	}
	

}
