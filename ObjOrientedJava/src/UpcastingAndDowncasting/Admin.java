package UpcastingAndDowncasting;

public class Admin extends Employee{
	@Override
	void doSomething()
	{
		System.out.println("Admin: working.....");
	}
    void doHire()
    {
    	System.out.println("Admin: hiring....");
    }

}
