
//	----->Seção-10 Aula 96 - Exercício Listas 		--->22/05/2021.

package entities96;

public class Employee96 {

	private Integer id;
	private String name;
	private Double salary;
	
	
	public Employee96() {
		
	}
	
	public Employee96(Integer id, String name, Double salary) {
//		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
	public void increaseSalary(double percentage) {
		salary += salary * percentage / 100;
	}
	
	@Override
	public String toString() {
		return " Id: "+ id + ", "
				+ name + ", "
				+ String.format(" %.2f ", salary);
	}
	
	
}


/**
 * @author Thalles machado
 *
 */