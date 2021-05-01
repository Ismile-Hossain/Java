
public class TestCalculator {

	public static void main(String[] args) {
		Calculator cal=new Calculator();
		System.out.println(cal.doAddition(5, 6));
		System.out.println(cal.getSquare(5));
		cal.setVar(2, 3);
		cal.display();
		}

}
