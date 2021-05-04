package This;
class Xyz{
	
	Test5 test5;
	Xyz(Test5 test5){
		this.test5=test5;
		}
	void dipalyInfo()
	{
		System.out.println(test5.var);
	}
	
}

public class Test5 {
	int var=5;
	Test5 ()
	{
		Xyz xyz=new Xyz( this );
		xyz.dipalyInfo();	
	}

	public static void main(String[] args) {
		
		Test5 test5=new Test5();
	}

}
