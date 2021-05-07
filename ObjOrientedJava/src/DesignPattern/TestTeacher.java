package DesignPattern;

public class TestTeacher {

	public static void main(String[] args) {
		
		TeacherEagerInitialization obj= TeacherEagerInitialization.objReturn();
		System.out.println(obj.learn);
		System.out.println(obj.why);
	}

}
