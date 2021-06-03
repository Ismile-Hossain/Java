package ArrayListLastExamp;

import java.util.ArrayList;

public class RetriveStudentData {

	void getAllStudentData()
	{
		StudentDataInser data=new StudentDataInser();
		ArrayList<Student> list=data.adddata();

		for (Student st : list) {
            System.out.println("Name: "+st.name);
            System.out.println("Total Number: "+st.total);
            System.out.println("Persentage: "+st.percentage+"\n");
            
		}

	}

}
