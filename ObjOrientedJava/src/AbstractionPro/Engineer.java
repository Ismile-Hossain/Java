package AbstractionPro;

public class Engineer extends Employee{
    ///no problem occur abstract class declare 3 argument constructor
	public Engineer(int id, String name) {
		super(id, name);
	}
	public static void main(String[] args) {
		Engineer en=new Engineer(27,"Ismile");
		en.display();
	}

}
