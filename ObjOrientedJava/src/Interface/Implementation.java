package Interface;
///if we don't override the method the make this class abstract 
public class Implementation implements A,B {

	@Override
	public void m1() {
		System.out.println("m1 method of Interface:A"+a);
	}

	@Override
	public void m2() {
		System.out.println("m2 method of Interface:B"+b);
	}
	@Override
	public void m3() {
		System.out.println("m3 method of Interface:C");
	}
	
}
