package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ITerator {

	public static void main(String[] args) {
		ArrayList<String>arrList=new ArrayList<String>();//No need to define size
		arrList.add("Ismile");
		arrList.add("Ashik");
		arrList.add("Shams");
		arrList.add("Shakil");
		
		
		arrList.remove(0);
		
		Iterator itr0= arrList.iterator();
		while(itr0.hasNext())
		{
			System.out.print(itr0.next()+" ");
		}
		
		System.out.println();
		arrList.add(0,"Ismile");

		Iterator itr1= arrList.iterator();
		while(itr1.hasNext())
		{
			System.out.print(itr1.next()+" ");
		}
		
		System.out.println();
		arrList.set(2,"Arif");
		
		Iterator itr2= arrList.iterator();
		while(itr2.hasNext())
		{
			System.out.print(itr2.next()+" ");
		}
		
		System.out.println();
        arrList.remove("Arif");
        Iterator itr3= arrList.iterator();
		while(itr3.hasNext())
		{
			System.out.print(itr3.next()+" ");
		}
		
		System.out.println();
		ArrayList <String> arrList1 = new ArrayList<String>();
		arrList1.add("Arif");
		arrList1.add("Shams");
		arrList1.add("Aditto");
		
		arrList1.addAll(arrList);
		
		Iterator itr4= arrList1.iterator();
		while(itr4.hasNext())
		{
			System.out.print(itr4.next()+" ");
		}
		
		System.out.println();
		
		ArrayList <String> arrList2 = new ArrayList<String>();
		arrList2.add("MIST");
		arrList2.add("MIST");
		arrList2.add("MIST");
		
		arrList1.addAll(2, arrList2);
		
		Iterator itr5= arrList1.iterator();
		while(itr5.hasNext())
		{
			System.out.print(itr5.next()+" ");
		}
		

	}

}
