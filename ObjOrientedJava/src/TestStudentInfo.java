
public class TestStudentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       StudentInfo obj=new StudentInfo();
       
       
       obj.name="Ismile";
       obj.id=27;
       System.out.println("Name:"+obj.name+" Id:"+obj.id);
       
       StudentInfo st=new StudentInfo();
       st.setVar("Hossain",30);  
       
       StudentInfo obj1=new StudentInfo();
       obj1.setInfo(st);
       obj1.displayInfo();
       
	}

}
