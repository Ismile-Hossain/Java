package UpcastingAndDowncasting;

public class CompanyOwner {

	public static void main(String[] args) {
		Admin a=new Admin();
		
		Engineer en=new Engineer();
		Executive ex=new Executive();
		Worker w=new Worker();
		EmployeeCall eCall=new EmployeeCall();
		
		eCall.caller(a);
		System.out.println("---------------");
		eCall.caller(en);
		System.out.println("---------------");
		eCall.caller(ex);
		System.out.println("---------------");
		eCall.caller(w);
		
		
				
		
    }

}
