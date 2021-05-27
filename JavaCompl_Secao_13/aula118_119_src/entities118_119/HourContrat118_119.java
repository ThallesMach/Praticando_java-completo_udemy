
//	----->Seção-13 Aula 118 e 119 - Exercício  	--->26/05/2021.

package entities118_119;

import java.util.Date;

public class HourContrat118_119 {
	
	private Date date;
	
	private Double valuePerHour;
	
	private Integer hours;
	
	
	public HourContrat118_119() {
	}


	public HourContrat118_119(Date date, Double valuePerHour, Integer hours) {
//		super();
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Double getValuePerHour() {
		return valuePerHour;
	}


	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}


	public Integer getHours() {
		return hours;
	}


	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public double totalValue() {
		return valuePerHour * hours;
	}
	

}
