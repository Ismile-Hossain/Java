package AdvanceAbstraction;

public class Division extends MyCalculator {
	@Override
	void calculate(int a, int b) {
	
		int result=a/b;
		System.out.println("Division is:"+result);
	}

}
