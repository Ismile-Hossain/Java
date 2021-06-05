package DoubleColonOperator;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<String> st=new ArrayList<String>();
		st.add("Ismile");
		st.add("Ashik");
		st.add("Shakil");
		st.add("Shams");
		st.add("Hossain");
		
		st.forEach(System.out::println);
	}

}
