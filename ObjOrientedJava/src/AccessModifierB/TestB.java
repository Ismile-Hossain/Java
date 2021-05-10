package AccessModifierB;

import AccessModifierA.BaseClass;

public class TestB extends BaseClass {
	
	public static void main(String[] args) {

		   TestB testB=new TestB();
		   ///Private variable "a" can not be accessed
		   ///Private variable "b" can not be accessed
		   System.out.println("Protected var:c="+testB.c);
		   System.out.println("Public var:d="+testB.d);
		   
		   System.out.println();
		   
		  ///Private function "fun1" can not be accessed
		  ///Default function "fun2" can not be accessed
		   System.out.println("Protected function:fun3>>>");
		   testB.fun3();
		   System.out.println("Public function:fun4>>>");
		   testB.fun4();
		   
		   
	}

}
