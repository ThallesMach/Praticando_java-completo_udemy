/**
 * 
 */
package entities70_03;

/**
 * @author Thalles machado
 *
 */
public class Student70_03 {
	
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}
	
	public double missingPoints() {
		if (finalGrade() < 60) {
			return 60 - finalGrade();		
		}
		else {
			return 0 ;
		}
	}
	

}


/**
 * @author Thalles machado
 *
 */