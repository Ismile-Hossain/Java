/*
 * this used for multi thread..
 */
package DesignPattern;
public class DoubleCheckLockPrinciple {
	
	private static DoubleCheckLockPrinciple obj;
	
	private DoubleCheckLockPrinciple()
	{
		
	}
	/*
	 * Multi thread use this funtion and obj initialize only for 
	 * the first thread and lock for it..Other object access
	 * but not initialize the object again.
	 * 
	 */
	public static DoubleCheckLockPrinciple returnInstance()
	{
		if(obj==null)
		{
			synchronized(DoubleCheckLockPrinciple.class)
			{
				obj=new DoubleCheckLockPrinciple();
			}
		}
		return obj;
	}

}
