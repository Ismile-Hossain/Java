package ArrayList;

import java.util.ArrayList;

public class MyArrayList {

	public static void main(String[] args) {
        /*
         * <Integer>---it is called generic type
         * Integer is the wrapper class of int(primitive)
         */
		ArrayList<String>arrList=new ArrayList<String>();//No need to define size
	    arrList.add("Ismile");
	    arrList.add("Ashik");
	    arrList.add("Shams");
	    arrList.add("Shakil");
	    
	    for(String name:arrList)
	    {
	    	System.out.print(name+" ");
	    }
	    
	    System.out.println();
	    
	    for(int i=0;i<arrList.size();i++)
	    {
	    	System.out.print(arrList.get(i)+" ");
	    }
	    
	    System.out.println();
	    
	    arrList.forEach(i ->{
	    	System.out.print(i+" ");
	    });
	    
	    
	}

}
