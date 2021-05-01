
public class Calculator {
  int x;
  int y;
  int res;
  void setVar(int x,int y)
  {
	this.x=x;
	this.y=y;
  }
  int doAddition(int a,int b)
  {
	  res=a+b;
	  return res;
  }
  int getSquare(int x)
  {
	 return x*x; 
  }
  void display()
  {
	  System.out.println("x="+x+" "+"y="+y);
  }
}
