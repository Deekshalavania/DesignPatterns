package com.epam.facade;

public class ShapeMaker {

	private Shape rectangle;
	private Shape square;
	private Shape triangle;


	public ShapeMaker() {
		
		rectangle=new Rectangle();
		triangle=new Triangle();
		square=new Square();
	}
	
	public void  drawRectangle() {
		rectangle.draw();
	}
	
	public void  drawSquare() {
		square.draw();
	}

	public void  drawTriangle() {
		triangle.draw();
	}
}
