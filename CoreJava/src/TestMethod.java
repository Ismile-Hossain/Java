class Test{
	int addition(int a,int b)
	{
		int result=a+b;
		return result;
	}
}
public class TestMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Test test=new Test();
        int res=test.addition(10,20);
        System.out.println(res);
	}

}
