package UpcastingAndDowncasting;

public class Executive extends Employee {
    @Override
	void doSomething()
	{
		System.out.println("Executive: working.....");
	}
    
    void doCheck()
    {
    	System.out.println("Executive: mail checking....");
    }
}
