package Array;

import java.util.Scanner;

public class CalAverageWithArray {

	public static void main(String[] args) {
		int[] arr;
		arr=new int[5];
		
		Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println();
		
		double result=0.00;
	   //enhanced for loop or ForEach Loop
		for(double i:arr)
		{
			result=result+i;
		}
		
		System.out.println("Average is: "+result/arr.length);
	}

}
