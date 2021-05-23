
//	----->Seção-10 Aula 91 - Exercício de fixação 		--->22/05/2021.

package entities91;

public class Rent91 {
	
	private String name;
	private String email;
	
	
	public Rent91(String name, String email) {
//		super();
		this.name = name;
		this.email = email;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String toString() {
		return "Name: "+ name 
				+ ", E-mail: "+ email;
	}
	
	
	
}


/**
 * @author Thalles machado
 *
 */