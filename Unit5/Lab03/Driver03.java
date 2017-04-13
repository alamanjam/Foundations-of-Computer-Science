public class Driver03
{
   public static void main(String[] args)
   {
      int[] array = {100, 101, 102, 103, 104, 105, 106, 107, 108, 109};
      System.out.print("Original: ");
      print(array);
      scramble(array);
      System.out.print("Scrambled: ");
      print(array);
      sortMax(array);
      System.out.print("Big to Small: ");
      print(array);
      sortMin(array);
      System.out.print("Small to Big: ");
      print(array);
      scramble(array);
      System.out.print("Scrambled: ");
      print(array);
      bubblesort(array);
      System.out.print("Bubble Sort: ");
      print(array);
      scramble(array);
      System.out.print("Scrambled: ");
      print(array);
      insertionsort(array);
      System.out.print("Insertion Sort: ");
      print(array);
   }
   public static void print(int[]apple)
   {
      for(int k = 0; k < apple.length; k++)
         System.out.print(apple[k]+"\t");
      System.out.println();
   
   }
   public static void scramble(int[]apple)
   {
      for(int x=0;x<100;x++)
      {
         int a= (int)(Math.random()*10);
         int b= (int)(Math.random()*10);
         swap(apple,a,b);
      }
   }
   public static void sortMax(int[] array)
   {
      int maxPos;
      for(int k = 0; k < array.length; k++)
      {
         maxPos = findMax(array, array.length - k);
         swap(array, maxPos, array.length - k - 1);
      }
   }
   public static void sortMin(int[] array)
   {
      int minPos;
      for(int k = 0; k < array.length; k++)
      {
         minPos = findMin(array, array.length - k);
         swap(array, minPos, array.length - k - 1);
      }
   }
   public static void swap(int[] array, int a, int b)//what are "a" and "b" for???
   {
         
      int temp=array[b];
      array[b]=array[a];
      array[a]=temp;
   }
   public static int findMax(int[] array, int upper) //what does "upper" do???
   {
      int index=0;
      for(int x=0 ;x<upper;x++)
      {
         if(array[index]<array[x])
         {
            index=x;
         }
      }
      
      return index;
         
   
   }
   public static int findMin(int[] array, int upper) //what does "upper" do???
   {
      int index=0;
      for(int x=0 ;x<upper;x++)
      {
         if(array[index]>array[x])
         {
            index=x;
         }
      }
      
      return index;
         
   
   }

   public static void bubblesort(int[] array)
   {
      for(int n = 0; n<array.length;n++)
      {
         for(int x = 1; x<array.length-n;x++)
         {
            if(array[x-1] > array[x])
            {
               swap(array, x, x-1);// 
            }
         }
      
      }
   }
   public static void insertionsort(int[]array)
   {
      for(int x = 1; x<array.length;x++)
      {
         int y=x;
         for(int n = 0; n<x;n++)
         {
            if(array[y-1]>array[y])
            {
               swap(array, y-1, y);
               }
         }
         if(y>1)
         {
            y--;
         }
      }    
   }
}
