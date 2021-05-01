 class StudentInfo{
	 String name;
	 int id;
	 void setVar(String name,int id)
	 {
		 this.name=name;
		 this.id=id;
	 }
	 void setInfo(StudentInfo st)
	 {
		 name=st.name;
		 id=st.id;
	 }
	 void displayInfo()
	 {
		 System.out.println("Name: "+name+" "+"Id:"+id);
	 }
 }

