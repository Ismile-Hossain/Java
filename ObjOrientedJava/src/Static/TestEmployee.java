package Static;

public class TestEmployee {

	public static void main(String[] args) {
		Employee employee1=new Employee("Himel",01);
		Employee employee2=new Employee("Toha",02);
		
		employee1.display();
		employee2.display();
		
		employee1.setCompanyName("BrainStation23");//static variable assignment using non static method 
		
		Employee employee3=new Employee("Arif",03);
		Employee employee4=new Employee("Shams",04);
		
		employee3.display();
		employee4.display();
		
		Employee.companyName="CodeMarshal";///static variable assignment
		
		Employee employee5=new Employee("Ashik",03);
		Employee employee6=new Employee("Shakil",04);
		
		employee5.display();
		employee6.display();
		
		Employee.setCompanyname("AppNap");
		Employee employee7=new Employee("Masruk",05);
		Employee employee8=new Employee("Arzu",06);
		
		employee7.display();
		employee8.display();

	}

}
