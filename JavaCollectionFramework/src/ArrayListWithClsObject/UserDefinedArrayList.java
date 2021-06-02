package ArrayListWithClsObject;

import java.util.ArrayList;
import java.util.Iterator;


public class UserDefinedArrayList {

	public static void main(String[] args) {
		
		ArrayList <Student> arrList=new ArrayList<Student>();
		Student s1 =new Student("Ismile","Rangpur",27);
		Student s2 =new Student("Shakil","Dhaka",52);
		Student s3 =new Student("Ashik","Pabna",47);
		
		arrList.add(s1);
		arrList.add(s2);
		arrList.add(s3);
		
		Iterator itr=arrList.iterator();
		
		while(itr.hasNext())
		{
			/*
			 * Object obj=itr.next();
			 * Student s=(Student)obj;
			 */
			Student s=(Student) itr.next();
			System.out.println(s.getName()+" "+s.getAddress()+" "+s.getAge());
		}

	}

}
