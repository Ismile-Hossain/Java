package Vector;

import java.util.Enumeration;
import java.util.Vector;

/*
 * It is synchronized by default
 * It is better for retrieving data
 */
public class VectorTest {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>(10);
		v.add("Mango");
		v.add("Banana");
		v.add("Apple");
		v.add("Guava");
		
		System.out.println("Size is: "+v.size());
		System.out.println("Default Capacity is: "+v.capacity());
		
		v.addElement("Fruit1");
		v.addElement("Fruit2");
		v.addElement("Fruit3");
		
		System.out.println("Size after insertion: "+v.size());
		System.out.println("Default after insertion: "+v.capacity());
		
		v.addElement("Fruit4");
		v.addElement("Fruit5");
		v.addElement("Fruit6");
		v.addElement("Fruit7");
		
		System.out.println("Size after insertion: "+v.size());
		System.out.println("Default after insertion: "+v.capacity());
		
		Enumeration<String> en=v.elements();///Legacy class,it is only used for data reading not deleting or inserting
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		
	}

}
