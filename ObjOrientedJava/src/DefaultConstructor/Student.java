package DefaultConstructor;

public class Student {
	String name;
	int id;
   Student()
   {
	   System.out.println("I am a default Construtor");
	   System.out.println("Not required to write me!!!");
	   System.out.println("I assign null value");
   }
   void display()
   {
	   System.out.println("name:"+name);
	   System.out.println("id:"+id);
   }
}

