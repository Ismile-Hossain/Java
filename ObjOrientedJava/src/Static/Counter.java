package Static;

public class Counter {
	int count=0;
    static int _count=0;
    
    Counter()
    {
    	count++;
    	_count++;
    }
    void display()
    {
    	System.out.println("Value of count:"+count);
    	System.out.println("Value of Static count:"+_count);
    }
    public static void main(String arg)
    {
    	Counter c1=new Counter();
    	c1.display();
    	Counter c2=new Counter();
    	c2.display();
    	Counter c3=new Counter();
    	c3.display();
    	
    }
    
   
}
