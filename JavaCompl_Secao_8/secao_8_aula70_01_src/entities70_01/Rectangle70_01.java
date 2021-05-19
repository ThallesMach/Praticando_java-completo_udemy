/**
 * 
 */
package entities70_01;

/**
 * @author Thalles machado
 *
 */
public class Rectangle70_01 {
	
	public double width ;
	public double height;
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return 2 * (width * height  );
	}
	
	public double diagonal() {
		return Math.sqrt(width * height + height* height);
	}
	

}



/**
 * @author Thalles machado
 *
 */