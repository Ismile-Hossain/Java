package Array;

import java.util.Scanner;


public class FindMinAndMax {
	
	void min(int arr[])
	{
		int min_num=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min_num>arr[i])
			{
				min_num=arr[i];
			}
		}
		System.out.println("Min Number: "+min_num);
	}

	void max(int arr[])
	{
		int max_num=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max_num<arr[i])
			{
				max_num=arr[i];
			}
		}
		System.out.println("Max Number: "+max_num);
	}

	public static void main(String[] args) {
		int[] arr;
		arr=new int[5];
		
		Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		FindMinAndMax find=new FindMinAndMax();
		find.max(arr);
		find.min(arr);
		
		System.out.println("Anonym object:");
		new FindMinAndMax().max(arr);
		
		System.out.println("Anonym Array:");
		new FindMinAndMax().min(new int[] {10,30,20,50,40});

	}

}
