package entities133;

import entities.enuns133.Color133;

public class Rectangle133 extends Shape133 {

	private Double width;
	private Double height;
	
	
	public Rectangle133(){
		super();
	}
	

	public Rectangle133(Color133 color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}


	
	

	public Double getWidth() {
		return width;
	}



	public void setWidth(Double width) {
		this.width = width;
	}



	public Double getHeight() {
		return height;
	}



	public void setHeight(Double height) {
		this.height = height;
	}



	@Override
	public double area() {
		return width * height;
	}
	
	
	

}
