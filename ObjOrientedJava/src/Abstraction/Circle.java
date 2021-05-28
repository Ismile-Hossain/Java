package Abstraction;
public class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("Drawing Circle");
	}

	@Override
	void calculteArea(int r,int h) {
		System.out.println("Circle Area: "+Math.PI*r*r);
	}

}
