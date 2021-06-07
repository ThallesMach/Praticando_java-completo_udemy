package entities133;

import entities.enuns133.Color133;

public class Circle133 extends Shape133 {

	private Double radius;
	
	public Circle133() {
		super();
	}
	
	
	public Circle133(Color133 color, Double radius) {
		super(color);
		this.radius = radius;
	}

	

	public Double getRadius() {
		return radius;
	}


	public void setRadius(Double radius) {
		this.radius = radius;
	}


	@Override
	public double area() {
		
		return Math.PI * radius * radius;
	}

	
	
}
