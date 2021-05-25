package UpcastingPolymorphism;

public class TestUpcasting {

	public static void main(String[] args) {
		
		/*
		Type-1
		Animal a=new Animal();
		Cow c=new Cow();
		a=c;
		Type-2
		Animal a=new Animal();
		a=new Cow();
		Type-3
		Animal a= new Cow();
		 */
		
		Animal a=new Cow();
		a.eat();
		a=new Dog();
		a.sleep();
		a=new Cat();
		a.move();
		
	}

}
