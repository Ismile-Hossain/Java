package Polymorphism;

public class ChangeMarry extends Marry {
	@Override
	public void marryDate()///Overriding Method,this method restriction is must less than the super class
	{
		System.out.println("Marry will be done on 20 January");
	}

}
