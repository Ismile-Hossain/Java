package LambdaExpression;


import java.util.ArrayList;
import java.util.List;

public class ListWithLabda {

	public static void main(String[] args) {
	    
		List<String> st=new ArrayList<String>();
		st.add("Ismile");
		st.add("Ashik");
		st.add("Shakil");
		st.add("Shams");
		
		st.forEach(a ->System.out.println(a));
	}

}
