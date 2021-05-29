package AdvanceAbstraction;

public class Subtraction extends MyCalculator{

	@Override
	void calculate(int a, int b) {
	
		int result=a-b;
		System.out.println("Subtraction is:"+result);
	}
      
}
