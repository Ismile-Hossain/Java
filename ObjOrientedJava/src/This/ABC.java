package This;

public class ABC {
	
	void m1()
	{
		System.out.println("I am Method M1");
	}
	void m2()
	{
		this.m1();///we can invoke it without this as this by default there
		
	}

	public static void main(String[] args) {
		
		ABC abc=new ABC();
		abc.m2();
     
	}

}
