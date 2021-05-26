package UpcastingAndDowncasting;

public class EmployeeCall {
 
	void caller(Employee emp)///upcasting
	{
		emp.doSomething();
		emp.setEmployeeId();
		
		System.out.println();
		
		if(emp instanceof Admin)///downcasting
		{
			Admin a=new Admin();
			a.doSomething();
			a.doHire();
			a.setEmployeeId();
		}
		if(emp instanceof Engineer)///downcasting
		{
			Engineer e=new Engineer();
			e.doSomething();
			e.doDevelop();
			e.setEmployeeId();
		}
	}
}
