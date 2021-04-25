 class StudentInfo{
	 String name;
	 int id;
 }
public class StudentCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       StudentInfo obj=new StudentInfo();
       StudentInfo obj1=new StudentInfo();
       
       obj.name="Ismile";
       obj.id=27;
       
       obj1.name="Hossain";
       obj1.id=30;
       System.out.println("Name:"+obj.name+" Id:"+obj.id);
       System.out.println("Name:"+obj1.name+" Id:"+obj1.id);
	}

}
