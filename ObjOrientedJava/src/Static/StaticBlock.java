package Static;

public class StaticBlock {
	static int var=setVar(); ///Static or class level or class variable
	static{
		System.out.println("From static block");
	}
	static int setVar()
	{
		System.out.println("From static method");
		return 10;
	}
	
	public static void main(String[] args) {
		System.out.println("From Main Method");
	}

}
