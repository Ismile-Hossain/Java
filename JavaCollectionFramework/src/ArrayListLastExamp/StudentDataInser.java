package ArrayListLastExamp;

import java.util.ArrayList;

public class StudentDataInser {
	
	ArrayList<Student>adddata()
	{
		
		Student s1=new Student();
		s1.name="Ismile";
		s1.phy_mark=80;
		s1.che_mark=95;
		s1.mat_mark=75;
		s1.total=(80+95+75);
		s1.percentage=(s1.total*100)/300;
		
		Student s2=new Student();
		s2.name="Ahsik";
		s2.phy_mark=85;
		s2.che_mark=92;
		s2.mat_mark=70;
		s2.total=(85+92+70);
		s2.percentage=(s2.total*100)/300;
		
		Student s3=new Student();
		s3.name="Ismile";
		s3.phy_mark=88;
		s3.che_mark=90;
		s3.mat_mark=65;
		s3.total=(88+90+65);
		s3.percentage=(s3.total*100)/300;
		
		ArrayList<Student> arrLst=new ArrayList<Student>();
		arrLst.add(s1);
		arrLst.add(s2);
		arrLst.add(s3);
		
		
		return arrLst;
		
	}

}
