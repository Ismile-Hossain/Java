//Method calling using this keyword
package This;

public class EventHandeling {
	void m1(EventHandeling obj)
	{
		System.out.println("Method M1 invoked");
	}
	void m2()
	{
		m1(this);
	}

	public static void main(String[] args) {
		EventHandeling obj=new EventHandeling();
		obj.m2();
    }

}
