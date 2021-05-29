package AdvanceAbstraction;

public class TestClass {
	public static void main(String[] args) {
		
		MyCalculator cal;
		
	    cal=new Addition();
	    cal.calculate(10, 5);
	    
	    System.out.println();
	    
	    cal=new Subtraction();
	    cal.calculate(10, 5);
	    
	    System.out.println();
	    
	    cal=new Multiplication();
	    cal.calculate(10, 5);
	    
	    System.out.println();
	    
	    cal=new Division();
	    cal.calculate(10, 5);
	}
     
     
     
}
