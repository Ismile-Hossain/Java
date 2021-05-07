package DesignPattern;

public class HeadBlockInitialization {
   
   String learn="Static block initialization";
   String why="It is used when only small number resourcce use the instance";
   private static HeadBlockInitialization headBlockInitialization;
	
   private HeadBlockInitialization()
   {
	   
   }
   
   ///Static block
   static
   {
	   try {
		   headBlockInitialization=new HeadBlockInitialization();
	   }
	   catch(Exception e)
	   {
		   throw new RuntimeException("Exception occured in creating the instance");
	   }
   }
   
   public static HeadBlockInitialization returnObj()
   {
	   return headBlockInitialization;
   }
}
