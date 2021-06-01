package ArrayListVsLinkedList;

import java.util.*;

public class TestClass {
	private static final int ELCOUNT = 50000;
	public static void main(String[] args) {

		List <String> link_list=new LinkedList<String>();
		List <String> array_list=new ArrayList<String>();
        
		
		///Insertion
		long start=System.currentTimeMillis();
		for(int i=0;i<ELCOUNT;i++) {
			array_list.add("element #"+i);
		}
		long total_time=System.currentTimeMillis()-start;
		System.out.println("Total Time need to 50k element ArrayList(add): "+total_time+"ms");
		
		long start0=System.currentTimeMillis();
		for(int i=0;i<ELCOUNT;i++) {
			link_list.add("element #"+i);
		}
		long total_time0=System.currentTimeMillis()-start0;
		System.out.println("Total Time need to 50k element LinkList(add): "+total_time0+"ms");
		
		
		System.out.println();
		///Modification
		long start1=System.currentTimeMillis();
		for(int i=0;i<ELCOUNT;i++) {
			array_list.set(i,"element #"+i);
		}
		long total_time1=System.currentTimeMillis()-start1;
		System.out.println("Total Time need to 50k element ArrayList(set): "+total_time1+"ms");
		
		long start2=System.currentTimeMillis();
		for(int i=0;i<ELCOUNT;i++) {
			link_list.set(i,"element #"+i);
		}
		long total_time2=System.currentTimeMillis()-start2;
		System.out.println("Total Time need to 50k element LinkList(set): "+total_time2+"ms");
		
		System.out.println();
		///Removal
		System.out.println("Size of ArrayList: "+array_list.size());
		System.out.println("Size of LinkedList: "+link_list.size());
		
		long start3=System.currentTimeMillis();
		for(int i=0;i<ELCOUNT;i++) {
			array_list.remove(0);
		}
		long total_time3=System.currentTimeMillis()-start3;
		System.out.println("Total Time need to remove 50k element ArrayList(remove): "+total_time3+"ms");
		
		long start4=System.currentTimeMillis();
		for(int i=0;i<ELCOUNT;i++) {
			link_list.remove(0);
		}
		long total_time4=System.currentTimeMillis()-start4;
		System.out.println("Total Time need to remove 50k element LinkList(remove): "+total_time4+"ms");
		
		System.out.println("Size of ArrayList: "+array_list.size());
		System.out.println("Size of LinkedList: "+link_list.size());
	}

}
