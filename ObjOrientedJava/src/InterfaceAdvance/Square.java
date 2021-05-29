package InterfaceAdvance;

public class Square implements Area{

	@Override
	public double calculateArea(double a, double b) {
		double squareArea=a*b;
		return squareArea; 
	}

}
