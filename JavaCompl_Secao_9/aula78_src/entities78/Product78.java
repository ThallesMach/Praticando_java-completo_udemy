
//	----->Seção-9 Aula 78 - Sobrecarga		--->21/05/2021.

package entities78;

public class Product78 {

	public String name;
	public double price;
	public int quantity;
	
	// Construtor Padrão
	public Product78() {		
	}

	public Product78(String name, double price) {
		this.name = name;
		this.price = price;
		
//		this.quantity = 0;		// é opcional  		this.quantity = quantity;
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