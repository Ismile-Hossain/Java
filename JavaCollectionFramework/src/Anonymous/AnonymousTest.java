package Anonymous;
class A{

	public void display() {
		System.out.println("A is eating....");

	}
}

public class AnonymousTest {

	public static void main(String[] args) {
		/*
		 * this is anonymous class
		 * if we need one time purpose then we use it
		 */
		A a=new A() {
			@Override
			public void display(){
				System.out.println("B is eating....");
			}
		};
		a.display();
	}

}
