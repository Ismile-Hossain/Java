
public class TestOverload {

	public static void main(String[] args) {
		Overloading myOverload=new Overloading();
		System.out.println(myOverload.doAddition(2, 3));
		System.out.println(myOverload.doAddition(2, 3, 4));
		System.out.println(myOverload.doAddition(2f, 3));
		System.out.println(myOverload.doAddition(2, 3f));

	}

}
