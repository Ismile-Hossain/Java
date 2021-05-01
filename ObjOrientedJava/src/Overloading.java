/*
  3 types of overloading
   1.number of parameters different
   2.data type of the parameter different
   3.same data type but parameter sequence is different
*/
public class Overloading {
    int doAddition(int a,int b)
    {
    	int result=a+b;
    	return result;
    }
    int doAddition(int a,int b,int c)
    {
    	int result=a+b+c;
    	return result;
    }
    
    float doAddition(float a,int b)
    {
    	float result=a+b;
    	return result;
    }
    float doAddition(int a, float b)
    {
    	float result=a+b;
    	return result;
    }
    
}
