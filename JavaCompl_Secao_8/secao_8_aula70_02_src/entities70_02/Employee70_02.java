/**
 * 
 */
package entities70_02;

/**
 * @author Thalles machado
 *
 */
public class Employee70_02 {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100.0 ;
	}
	
	public String toString() {
		return name +", $" + String.format(" %.2f", netSalary() );
	}

	
}



/**
 * @author Thalles machado
 *
 */