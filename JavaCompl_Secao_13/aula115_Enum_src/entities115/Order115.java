
//	----->Seção-13 Aula 115 - Enumerações  	--->23/05/2021.

package entities115;

import java.util.Date;

import entities.enums115.OrderStatus115;

public class Order115 {
	
	private Integer id;
	private Date moment;
	private OrderStatus115 status;
	
	public Order115() {
		
	}

	public Order115(Integer id, Date moment, OrderStatus115 status) {
		super();
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus115 getStatus() {
		return status;
	}

	public void setStatus(OrderStatus115 status) {
		this.status = status;
	}
 
	
	@Override
	public String toString() {
		return "Order115 [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
	
	

}



/**
 * @author Thalles machado
 *
 */