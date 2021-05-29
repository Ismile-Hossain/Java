package InterfaceAdvance;

public class Circle implements Area{

	@Override
	public double calculateArea(double a, double b) {
		double circleArea=pii*a*b;
		return circleArea;
	}

	

}
