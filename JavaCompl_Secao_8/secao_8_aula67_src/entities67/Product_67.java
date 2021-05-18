/**
 * 
 */
package entities67;

/**
 * @author Thalles machado
 *
 */
public class Product_67 {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

}



/**
 * @author Thalles machado
 *
 */