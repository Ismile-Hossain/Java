package DesignPattern;

public class MasterLazyInitialization {
	String learn="Lazy Initialization";
	String why="It is popular approach...";
	String use="Most of time it is used";
	private static  MasterLazyInitialization obj;
	private  MasterLazyInitialization()
	{
		
	}
	public static  MasterLazyInitialization getInstanceVar()
	{
		if(obj==null)
		{
			obj=new  MasterLazyInitialization();
		}
		return obj;
	}

}
