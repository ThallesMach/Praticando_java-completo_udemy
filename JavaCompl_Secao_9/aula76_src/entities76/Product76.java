
//	----->Seção-9 Aula 76 - Construtores			-->21/05/2021.

package entities76;

public class Product76 {

	public String name;
	public double price;
	public int quantity;

	public Product76(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
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