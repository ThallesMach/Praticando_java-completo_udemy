/**
 * 
 */
package entities68;

/**
 * @author Thalles machado
 *
 */
public class Product_68 {
	
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
	
//	Object e toString
	public String toString() {
		return name
				+", $ "
				+ String.format("%.2f", price )  //+ price
				+", "
				+ quantity
				+" units, Total: $ "
				+ String.format("%.2f", totalValueInStock() );  //+ totalValueInStock();
	}
	

}



/**
 * @author Thalles machado
 *
 */