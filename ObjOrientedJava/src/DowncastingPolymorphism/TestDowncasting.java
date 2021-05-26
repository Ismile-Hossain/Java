package DowncastingPolymorphism;

public class TestDowncasting {

	public static void main(String[] args) {
		
		Animal a1=new Cat();
		Cat c=(Cat)a1;
		c.eat();
		c.move();
		System.out.println();
		Animal a2=new Cow();
		if (a2 instanceof Cow)
		{
			Cow cow=(Cow)a2;
			cow.sleep();
			cow.eat();
		}

	}

}
