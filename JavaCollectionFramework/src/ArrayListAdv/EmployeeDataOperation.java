package ArrayListAdv;

import java.util.ArrayList;

public class EmployeeDataOperation {

	public static void main(String[] args) {
		Employee e1=new Employee("Ismile","Ranpur",27);
		Employee e2=new Employee("Ashik","Pabna",48);
		Employee e3=new Employee("Shakil","Dhaka",50);
		
		ArrayList<Employee> arrlst=new ArrayList<Employee>();
		arrlst.add(e1);
		arrlst.add(e2);
		arrlst.add(e3);
		
		Employee emp=new Employee();
		emp.getAllEmployeeData(arrlst);
	}

}
