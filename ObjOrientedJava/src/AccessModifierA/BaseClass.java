package AccessModifierA;

public class BaseClass {

	private int a=10;///It is only access within this class
	int b=20;
	protected int c=30;
	public int d=40;
	
	private void fun1()///It is only access within this class
	{
		System.out.println("This is a private function");
	}
	void fun2()
	{
		System.out.println("This is a default function");
	}
	
	protected void fun3()
	{
		System.out.println("This is a protected function");
	}
	
	public void fun4()
	{
		System.out.println("This is a public function");
	}
	
}
