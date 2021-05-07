package DesignPattern;

public class TeacherEagerInitialization {
	
	String learn="Here we learn Eager initialization!!!";
	String why="It is used when only small number resourcce use the instance";
	private static final  TeacherEagerInitialization myTeacher= new TeacherEagerInitialization();
	
	private TeacherEagerInitialization()
	{
		
	}
   public static TeacherEagerInitialization objReturn()
   {
	   return myTeacher;
   }
}
