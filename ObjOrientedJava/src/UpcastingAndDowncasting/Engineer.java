package UpcastingAndDowncasting;

public class Engineer extends Employee {

	@Override
	void doSomething()
	{
		System.out.println("Engineer: working.....");
	}
	void doDevelop()
	{
		System.out.println("Engineer: developing....");
	}
}
