package ArrayListAdv;

import java.util.ArrayList;

public class Employee {
	private String name;
	private String address;
	private int id;


	public Employee() {

	}
	public Employee(String name, String address, int id) {
		super();
		this.name = name;
		this.address = address;
		this.id = id;
	}
	void getAllEmployeeData(ArrayList <Employee> list)
	{
		for(Employee e :list)
		{
			System.out.println("Name: "+e.name);
			System.out.println("Address: "+e.address);
			System.out.println("Id: "+e.id+"\n");
		}
	}
}
