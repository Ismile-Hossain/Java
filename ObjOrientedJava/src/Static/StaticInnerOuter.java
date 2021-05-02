package Static;

public class StaticInnerOuter {
	static int x=10,y=9;
	static class Inner{
		static void  print()
		{
		  System.out.println(x);
		}
		void display()
		{
			System.out.println(y);
		}
	}

	public static void main(String[] args) {
		
		StaticInnerOuter.Inner inner= new StaticInnerOuter.Inner();
		inner.display();///to call non static function of a static class
		
		StaticInnerOuter.Inner.print();///to call static function of a static class

	}

}
