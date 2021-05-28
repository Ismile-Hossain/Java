package Abstraction;

public class TestAbstruction {

	public static void main(String[] args) {
	
		Shape s=new Circle();
		s.draw();
		s.calculteArea(3,0);
		
		System.out.println();
	
		Shape r=new Rectangle();
		r.draw();
		r.calculteArea(3,4);
   }

}
