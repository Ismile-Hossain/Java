package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListWithMethods {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();

		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				list.add(i);
			}
		}
		
		list.addFirst(27);
		list.addLast(54);
		
		Object obj0=list.getFirst();
		System.out.println("First Element: "+obj0);
		Object obj1=list.getLast();
		System.out.println("Second Element: "+obj1);
		
		list.pop();
		System.out.println("First Element after pop: "+list.getFirst());

		list.push(27);
		System.out.println("First Element after push: "+list.getFirst());
		
		System.out.println("Peak First: "+list.peekFirst());
		System.out.println("Peak Last: "+list.peekLast());
		
		
		//// Linkedlist integration in ArrayList
		LinkedList<Integer> list0 = new LinkedList<Integer>();
		ArrayList<Integer>arr_list= new ArrayList<Integer>();

		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				list0.add(i);
			}
			else
			{
				arr_list.add(i);
			}
		}
		arr_list.addAll(list0);
		System.out.print(arr_list+" ");
		
	}

}
