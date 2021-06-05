package DoubleColonOperator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Xyz {
	
	Xyz(){
		
	}
	Xyz(String s)
	{
		System.out.println("Hello "+s);
	}

	public static void main(String[] args) {
		List <String> list=new ArrayList<String>();

		list.add("Abdulla");
		list.add("Mahmud");
		list.add("Dipu");
		list.add("Nehal");
		list.add("Abir");
		
		System.out.println("Using Iterator:\n");
		Iterator <String> it= list.iterator();
		while(it.hasNext()) {
			String s = it.next();
			new Xyz(s);
		}
		System.out.println("Using enhanced for loop:\n");
		for(String s : list)
		{
			new Xyz(s);
		}
		System.out.println("Using labda expression:\n");
		list.forEach(a->new Xyz(a));
		
		System.out.println("Using double colon:\n");
		list.forEach(Xyz::new);
	}

}
