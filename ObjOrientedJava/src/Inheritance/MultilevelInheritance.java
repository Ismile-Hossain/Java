package Inheritance;
class Animal0
{
	String name;
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
class Dog0 extends Animal0
{
	void bark()
	{
		System.out.println("Child Class:Dog is barking...");
	}
}
class BabyDog extends Dog0
{
	void weep()
	{
		System.out.println("Child Class:Dog is weeping...");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		BabyDog babyDog=new BabyDog();
		babyDog.name="Tomy";
		babyDog.eat();
		babyDog.sleeping();
		babyDog.moving();
		babyDog.bark();
		babyDog.weep();

	}

}
