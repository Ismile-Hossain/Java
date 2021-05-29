package AdvanceAbstraction;

public class Multiplication extends MyCalculator {

	@Override
	void calculate(int a, int b) {
	
		int result=a*b;
		System.out.println("Multiplication is:"+result);
	}

}
