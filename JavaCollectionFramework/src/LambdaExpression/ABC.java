package LambdaExpression;

interface XYZ{
	void display();
}

public class ABC  {

	public static void main(String[] args) {
         ///Anonymous object
		XYZ xyz=new XYZ() {

			@Override
			public void display() {
				System.out.println("Hello World");

			}
		};
		
		xyz.display();
	}



}
