package Inheritance;
class A
{
	int a=10;
	static int b=20;
	A()
	{
	   System.out.println("Class A Constructor invoked by object creation!!!");	
	}
	static
	{
		System.out.println("Class A Static Block invoked by object creation!!!");
	}
	
	{
		System.out.println("Class Instance Block invoked by object creation!!!");
	}
}
class B extends A
{
	int c=30;
	B()
	{
		System.out.println("Class B Constructor");
	}
	
}

public class MyClassIsA {
	

	public static void main(String[] args) {
        B b=new B();
        System.out.println("\nClass A instance variable"+b.a);
        System.out.println("Class A static variable"+b.b);
        System.out.println("Class B instance variable"+b.c);
	}

}
