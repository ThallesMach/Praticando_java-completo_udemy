package entities133;

import entities.enuns133.Color133;

public abstract class Shape133 {
	
	private Color133 color;
	
	public Shape133() {
	}

	
	public Shape133(Color133 color) {
//		super();
		this.color = color;
	}

	public Color133 getColor() {
		return color;
	}

	public void setColor(Color133 color) {
		this.color = color;
	}
	

	public abstract double area();

}
