import java.util.Scanner;

public class NumberChecker {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		switch(num)
		{
		case 10:System.out.println("Number is 10");
		break;
		case 20:System.out.println("Number is 20");
		break;
		case 30:System.out.println("Number is 30");
		break;
		case 40:System.out.println("Number is 40");
		break;
		case 50:System.out.println("Number is 50");
		break;
		default:System.out.println("Number is not matched with anyone");
	    }
		sc.close();
	}

}
