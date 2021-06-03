package ArrayListAsMethodReturn;

import java.util.ArrayList;

public class RetriveData {

	public static void main(String[] args) {
        
		AddingData add=new AddingData();
		ArrayList<Employee> arrList=add.employeeData();
		for(Employee ep:arrList)
		{
			System.out.println("Name: "+ep.getName());
			System.out.println("Name: "+ep.getAddress());
			System.out.println("Name: "+ep.getId()+"\n");
		}
	}

}
