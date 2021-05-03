package This;

public class ConstructorCall {
	ConstructorCall()
	{
		System.out.println("I am non parameterized Constructor");
	}
	ConstructorCall(int a)
	{
		this();///calling non parameterized Constructor 
	}

	public static void main(String[] args) {
	
		ConstructorCall obj =new ConstructorCall(5);
		
    }

}
