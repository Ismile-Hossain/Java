class Student{
	String name;
	int id;
	int phnNum;
	Student() ///default constructor
	{
		
	}
	///constructor overloading->>
	Student(String _name,int _id)///Parameterized constructor
	{
		name=_name;
		id=_id;
	}
	///constructor overloading->>
	Student(String _name,int _phnNum,int _id)///Parameterized constructor
	{
		name=_name;
		id=_id;
		phnNum=_phnNum;
	}
	void display()
	{
		System.out.println(name+" "+id+" "+phnNum);
	}
}
public class StudentInfoCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st=new Student("Ismile",27);
		Student st1=new Student("Hossain",0171567,29);
		st.display();
		st1.display();
		}

}
