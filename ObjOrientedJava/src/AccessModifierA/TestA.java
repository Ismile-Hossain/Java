package AccessModifierA;

public class TestA {
   public static void main(String[] args) {
	   BaseClass base=new BaseClass();
	   
	   ///Private variable "a" can not be accessed
	   System.out.println("Default var:b="+base.b);
	   System.out.println("Protected var:c="+base.c);
	   System.out.println("Public var:d="+base.d);
	   
	   System.out.println();
	   
	  ///Private function "fun1" can not be accessed
	   System.out.println("Default function:fun2>>>>");
	   base.fun2();
	   System.out.println("Protected function:fun3>>>");
	   base.fun3();
	   System.out.println("Public function:fun4>>>");
	   base.fun4();
	   
	   
}
}
