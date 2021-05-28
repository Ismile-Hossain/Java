package Abstraction;

public class Rectangle extends Shape {
	@Override
	void draw() {
		System.out.println("Drawing Rectangle");
	}

	@Override
	void calculteArea(int r,int h) {
		
		System.out.println("Rectangle Area: "+(r*h));
	}
}
