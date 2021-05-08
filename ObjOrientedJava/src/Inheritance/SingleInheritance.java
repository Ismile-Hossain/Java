package Inheritance;
class Animal
{
	void eat()
	{
		System.out.println("Super Class:Animal is eating...");
	}
	void sleeping()
	{
		System.out.println("Super Class:Animal is sleeping...");
	}
	void moving()
	{
		System.out.println("Super Class:Animal is moving...");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Dog is barking...");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		
		Dog myDog=new Dog();
		myDog.eat();
		myDog.sleeping();
		myDog.moving();
		myDog.bark();

	}

}
