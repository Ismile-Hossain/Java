package InterfaceAdvance;

public class TestArea {

	public static void main(String[] args) {
		Area ar;
		ar=new Circle();
		System.out.println(ar.calculateArea(3, 2));
		
		ar=new Square();
		System.out.println(ar.calculateArea(5, 4));
    }
}
