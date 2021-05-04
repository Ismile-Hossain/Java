package This;
class A{
	
	public A getAbcObj()
	{
	  	return this;
	}
	void diplay()
	{
		
	}
}

public class Test6 {
	

	public static void main(String[] args) {
		A abc0 = new A();
		A abc1 = abc0.getAbcObj();
		
		System.out.println(abc0);
		System.out.println(abc1);
		
		/*As the two object return same hash code So, "this" keyword
		  return current class object
        */
	}

}
