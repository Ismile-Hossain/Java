package LambdaExpression;
interface BCA{
	String display(String msg);
	
}
public class Lambda {

	public static void main(String[] args) {
		BCA bca = (String msg) ->{
			return ("Hello "+msg);
		};
		
		System.out.println(bca.display("Ismile"));
	}
}
