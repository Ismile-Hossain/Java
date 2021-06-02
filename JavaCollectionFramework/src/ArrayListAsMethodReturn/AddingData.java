package ArrayListAsMethodReturn;

import java.util.ArrayList;

public class AddingData {

	
	ArrayList<Employee> employeeData()
	{
		
		Employee e1=new Employee("Ismile", "Rangure", 27);
		Employee e2=new Employee("Shams", "Dhaka", 47);
		Employee e3=new Employee("Ashik", "Pabna",48);
		ArrayList<Employee> arrList= new ArrayList<Employee>();
		arrList.add(e1);
		arrList.add(e2);
		arrList.add(e3);
		return arrList;
		
	}
}
