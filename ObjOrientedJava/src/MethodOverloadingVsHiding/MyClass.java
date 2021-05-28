package MethodOverloadingVsHiding;
class ParentClass{
	public static int a=10;
	public static void classMethod()///method hiding
	{
		System.out.println("classMethod: Parent class");
	}
	void instanceMethod()
	{
		System.out.println("instanceMethod: Parent class");
	}
	
}
class ChildClass extends ParentClass{
	public static int a=40;
	public static void classMethod() ///method hiding
	{
		System.out.println("classMethod: Child Class");
	}
	@Override
	void instanceMethod()
	{
		System.out.println("instanceMethod: Child Class");
	}
}
public class MyClass {
   public static void main(String[] args) {
	   
	ParentClass p=new ChildClass();
    p.classMethod();///calling with reference
    p.instanceMethod();///calling with object
    System.out.println(p.a);
  
    System.out.println();
    
 	ParentClass p1=new ParentClass();
     p1.classMethod();///calling with reference
     p1.instanceMethod();///calling with object
     
     System.out.println();
    
    ChildClass c=new ChildClass();
    c.classMethod();///calling with reference
    c.instanceMethod();///calling with object
    System.out.println(c.a);
    
}
}
