package AbstractionPro;

public abstract class Employee {
	private int id;
	private String name;
    private String gender;
	public Employee(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	///Nothin goes wrong if we create another constructor
	public Employee(int id, String name, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

	void display()
	{
		System.out.println("Name: "+name+"\nId: "+id);
	}
	
	

}
