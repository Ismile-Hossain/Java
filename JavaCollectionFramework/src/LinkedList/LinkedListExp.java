package LinkedList;
import java.util.*;

public class LinkedListExp {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();

		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				list.add(i);
			}
		}
		///Printing type-1
		System.out.println(list);

		Iterator<Integer> itr =list.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" "); 
		}
	}

}
