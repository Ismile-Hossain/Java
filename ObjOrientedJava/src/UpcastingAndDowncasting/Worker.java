package UpcastingAndDowncasting;

public class Worker extends Employee {
    @Override
	void doSomething()
	{
		System.out.println("Worker: working.....");
	}
    void doSet()
    {
    	System.out.println("Worker: asembeling parts....");
    }
}
