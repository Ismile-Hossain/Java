package Array;

public class ArrayExpOne {

	public static void main(String[] args) {
		int[] arr;
		arr=new int[5];
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int[] arr0= {5,4,3,2,1};
		
		//enhanced for loop or ForEach Loop
		for(int i:arr0)
		{
			System.out.print(i+" ");
		}
	}

}
