
//	----->Seção-13 Aula 118 e 119 - Exercício  	--->26/05/2021.

package entities118_119;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums118_119.WorkerLevel118_119;

public class Worker118_119 {

	private String name;

	private WorkerLevel118_119 level;

	private Double baseSalary;

	private Department118_119 departement;
	private List<HourContrat118_119> contracts = new ArrayList<>();

	public Worker118_119() {
	}

	public Worker118_119(String name, WorkerLevel118_119 level, Double baseSalary, Department118_119 departement) {
//		super();
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departement = departement;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel118_119 getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel118_119 level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department118_119 getDepartement() {
		return departement;
	}

	public void setDepartement(Department118_119 departement) {
		this.departement = departement;
	}

	public List<HourContrat118_119> getContracts() {
		return contracts;
	}

//	public void setContracts(List<HourContrat118_119> contracts) {
//		this.contracts = contracts;
//	}
	
	
	public void addContract(HourContrat118_119 contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContrat118_119 contract) {
		contracts.remove(contract);
	}
	
	
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for (HourContrat118_119 c : contracts) {
			cal.setTime(c.getDate() );
			
			int c_year = cal.get(Calendar.YEAR);			
			int c_month = 1 + cal.get(Calendar.MONTH);
			
			if ( year == c_year && month == c_month  ) {	
				sum += c.totalValue();
			}
		}
		return sum;
	}
	

}
