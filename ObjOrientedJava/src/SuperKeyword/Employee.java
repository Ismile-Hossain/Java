package SuperKeyword;

public class Employee extends Person {
    double salary;
    int age=40;
	public Employee(String name, int id, double salary) {
		/*
		 * employee object first call Person default constructor for this
		 * JVM do this
		 */
		super(name,id);
		this.salary = salary;
	}
	@Override
	void eat()
	{
		System.out.println("Employee:Child Class eating...");
		super.eat();
	}
	void display()
	{
		System.out.println(name+" "+id+" "+salary);
		System.out.println(age+" "+super.age);
	}
	
	public static void main(String[] args) {
		/*
		 * Person p=new Person();
		  p.eat();
		*/
		Employee e=new Employee("Shakil",55,5000.00);
		e.eat();
	}
    
}
