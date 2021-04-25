class EmployeeInfo{
	String name;
	int id;
	void info(String a,int b)
	{
		name=a;
		id=b;
	}
	void display()
	{
		System.out.println(name+" "+id);
	}
}
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeInfo obj=new EmployeeInfo();
		obj.info("Ismile", 27);
		obj.display();
	}

}
