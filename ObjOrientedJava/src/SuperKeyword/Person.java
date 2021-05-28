package SuperKeyword;

public class Person {
	String name;
	int id;
	int age=50;
	public Person(){
		System.out.println("Person:Base Class--no argment Constructor");
	}
	public Person(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	void eat()
	{
		System.out.println("Person:Base Class eating...");
	}

}
