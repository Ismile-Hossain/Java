package DesignPattern;

public class MasterLazyInitialization {
	String learn="Lazy Initialization";
	String why="It is popular approach...";
	String use="Most of time it is used";
	private static  MasterLazyInitialization obj;
	private  MasterLazyInitialization()
	{
		
	}
	public static synchronized  MasterLazyInitialization getInstanceVar()
	{
		/*
		 * it is ok with single thread.
		 * But problem occured with multi-thread;
		 * To solve use sychronized in this funtion.
		 */
		if(obj==null)
		{
			obj=new  MasterLazyInitialization();
		}
		return obj;
	}

}
