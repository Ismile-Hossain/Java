/*
 * static method can not initialize non static instance 
 * need object to initialize non static instance
 * 
 * Non static method can initialize static instance
 */
package Static;

public class Employee {
  String name;
  int id;
  static String companyName="Enosis";
  Employee(String name,int id){
	  this.name=name;
	  this.id=id;
	  
  }
  void setCompanyName(String name)
  {
	  companyName=name; 
  }
  static void setCompanyname(String name)
  {
	  companyName=name;
  }
  void display()
  {
	  System.out.println("Name:"+name);
	  System.out.println("Id:"+id);
	  System.out.println("Company Name:"+companyName+"\n");
  }
}
