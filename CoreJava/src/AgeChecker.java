import java.util.Scanner;

public class AgeChecker {

	public static void main(String[] args) {
		int age;
		Scanner scc=new Scanner(System.in);
		age=scc.nextInt();
		if(age<60)
		{
			System.out.println("Age is less then Sixty");
		}
		else
		{
			System.out.println("Age is greater then Sixty");
		}
		scc.close();

	}

}
