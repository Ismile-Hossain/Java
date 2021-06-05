package DoubleColonOperator;

import java.util.ArrayList;
import java.util.List;

public class ABC {
	
	
   static void display(String s)
    {
    	System.out.print(s+" ");
    }
	public static void main(String[] args) {
		List <String> list=new ArrayList<String>();
		
		list.add("Green");
		list.add("Yellow");
		list.add("Viloate");
		list.add("Red");
		list.add("Blue");
		list.add("Orange");
		list.add("Magenta");
		
		list.forEach(a -> {System.out.print(a+" ");});
		System.out.println();
		list.forEach(ABC::display);

	}

}
