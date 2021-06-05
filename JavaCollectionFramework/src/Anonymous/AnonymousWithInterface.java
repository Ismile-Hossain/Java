package Anonymous;
interface Ab{
	public void display();
}



public class AnonymousWithInterface {

	public static void main(String[] args) {
		Ab a = new Ab() {
			
			@Override
			public void display() {
			 System.out.println("Inner Class Display");
			}
		};
		a.display();
	}
}
