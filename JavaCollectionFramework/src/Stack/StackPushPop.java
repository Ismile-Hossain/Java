package Stack;

import java.util.Stack;

public class StackPushPop {
	
	static void pushElement(Stack stk,int n)
	{
		stk.push(n);
		System.out.println("Push Element-->"+n);
		System.out.println(stk);
	}
	static void popElement(Stack stk)
	{
		int n=(int) stk.pop();
		System.out.println("Pop Element-->"+n);
		System.out.println(stk);
		
	}

	public static void main(String[] args) {
		Stack<String> sk=new Stack<String>();
		pushElement(sk,5);
		pushElement(sk,7);
		pushElement(sk,9);
		pushElement(sk,10);
		
		System.out.println();
		
		popElement(sk);
		popElement(sk);
		popElement(sk);
		popElement(sk);
		
		try
		{
			popElement(sk);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
