package This;

public class Manager {
	
	String name;
	int id;
	String comapany_name;
	int age;
	int phn;
	//Constructor reusing or Constructor chaining
	Manager(String name, int id, String comapany_name, int age) {
	
		this.name = name;
		this.id = id;
		this.comapany_name = comapany_name;
		this.age = age;
	}
	Manager(String name, int id, String comapany_name, int age,int phn) {
		
		this(name,id,comapany_name,age);
		this.phn=phn;
	}
	void display()
	{
		System.out.println(name+"\n"+id+"\n"+comapany_name+"\n"+age+"\n"+phn+"\n\n");
	}

	public static void main(String[] args) {
		
		Manager m=new Manager("Ismile", 27, "Toto Ltd", 23);
		Manager m1=new Manager("Rahul", 30, "Begol Ltd", 25, 0171);
		
		m.display();
		m1.display();
	}

}
