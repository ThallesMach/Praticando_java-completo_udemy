
//	----->Seção-9 Aula 79 - Encapsulamento		--->21/05/2021.

package entities79;

public class Product79 {

	private String name;
	private double price;
	private int quantity;
	
	// Construtor Padrão
	public Product79() {		
	}

	public Product79(String name, double price) {
		this.name = name;
		this.price = price;
		
//		this.quantity = 0;		// é opcional  		this.quantity = quantity;
	}

	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	
	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}


	
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}
	
	public int getQuantity() {
		return quantity;
	}

	

	public double totalValueInStock() {
		return price * quantity;
		}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name + ", $ "
					+ String.format("%.2f", price)
					+ ", "
					+ quantity
					+ " units, Total: $ "
					+ String.format("%.2f", totalValueInStock());
	}


}


/**
 * @author Thalles machado
 *
 */