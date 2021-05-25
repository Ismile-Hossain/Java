package Polymorphism;

public class Caller {

	public static void main(String[] args) {
		 
		A a=new A();
		a.m1();
		a.m2();
		
		System.out.println("\n");
		
		B b=new B();
		b.m1();
		b.m2();
		b.m3();
		
		//Upcasting
		A a1=new B();///No concern in compile time,In run time B class object initialize
		a1.m2();///Runtime polymorphism 
		
	}

}
