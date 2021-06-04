package Iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;

public class ListIterator {
public static void main(String[] args) {
	List <String> list=new ArrayList<String>();
	
	list.add("Green");
	list.add("Yellow");
	list.add("Viloate");
	list.add("Red");
	list.add("Blue");
	list.add("Orange");
	list.add("Magenta");
	
	Collections.sort(list);
	System.out.println(list);
	
	java.util.ListIterator<String>  ls =  list.listIterator();
	
	while(ls.hasNext())
	{
		System.out.println(ls.nextIndex()+" "+ls.next());
	}
	System.out.println("Perivous Method must call after next");
	while(ls.hasPrevious())
	{
		System.out.println(ls.previousIndex()+" "+ls.previous());
	}
	
}   
}
