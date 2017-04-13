	//Name______________________________ Date_____________
  

import java.io.*;
import java.util.Arrays;
public class Driver01
{
   public static void main(String[] args)
   {
      	//input
      double[] myArray = {2.0, 3.7, 9.9, 8.1, 8.5, 7.4, 1.0, 6.2};
      double[] tempar;			      
      	//sort the array
      int maxIndex=0;
      double temp;
     
      
      for(int x = 0; x<(myArray.length-1);x++)
      {
         tempar = new double[myArray.length-x];
         for(int y = 0;y<myArray.length-x;y++)
         {            
            tempar[y]=myArray[y];
         }
         
         maxIndex=findMax(tempar);
         temp=tempar[maxIndex];
         myArray[maxIndex]=myArray[myArray.length-x-1];
         myArray[myArray.length-x-1]=temp;
      }
        
      for(double a: myArray)
      {
         System.out.println(a);
      }
      	/**********************
         }***********
      	*   write your code here
      	*
      	*********************************/
   }
   private static int findMax(double[] banana)
   {
      int pos = 0;
      for (int k = 1; k < banana.length; k++) {
         if (banana[pos] < banana[k]) {
            pos = k;
         }
      }
      return pos;
   }   
		  
      	//output
         
         
      	
}
