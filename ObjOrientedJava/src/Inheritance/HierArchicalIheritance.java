package Inheritance;

class Animal1
{
  String name;
	void eat()
	{
		System.out.println("Super Class:"+name+" is eating...");
	}
	void sleeping()
	{
		System.out.println("Super Class:"+name+" is sleeping...");
	}
	void moving()
	{
		System.out.println("Super Class:"+name+" is moving...");
	}
}
class Dog1 extends Animal1
{
	void bark()
	{
		System.out.println("Child Class:Dog is barking...");
	}
}
class Cat extends Animal1
{
	void meow()
	{
		System.out.println("Child Class:Cat is meowing...");
	}
}
public class HierArchicalIheritance {

	public static void main(String[] args) {
		Dog1 dog=new Dog1();
		dog.name="Tomy";
		dog.eat();
		dog.sleeping();
		System.out.println();
		Cat cat=new Cat();
		cat.name="Pusi";
		cat.eat();
		cat.sleeping();

	}

}
