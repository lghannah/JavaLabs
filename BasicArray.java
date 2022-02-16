//********************************************************************
//  BasicArray.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates basic array declaration and use.
//********************************************************************

public class BasicArray
{
   final static int LIMIT = 15;
   final static int MULTIPLE = 10;
                   
   //-----------------------------------------------------------------
   //  Creates an array, fills it with various integer values,
   //  modifies one value, then prints them out.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      /*int[] list = new int[LIMIT];
      
      //  Initialize the array values
      for (int index = 0; index < LIMIT; index++)
         list[index] = index * MULTIPLE;
      
      list[5] = 999;  // change one array value
      */
      int[] list = {0, 10, 20, 30, 40, 999, 60, 70, 80, 90, 100, 110, 120, 130, 140};
      /*
      for (int index = 0; index < LIMIT; index++)
         System.out.print (list[index] + "  ");
      */
      for (int number:list)
      	System.out.print(number+"   ");
      System.out.println ();
   }
}
