//Name: _______________________  Date: ______________

   import javax.swing.*;
   import java.util.*;
   import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;

    public class Lab13
   {
       public static void main(String[] args)
      {
         JFrame frame = new JFrame("Hanoyyyy");
         frame.setSize(400, 400);
         frame.setLocation(100, 50);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new Panel13());
         frame.setVisible(true);
             
      }
      
     
   
   }
	/**********************************
      Sample run, n = 3					Sample run, n = 4
    Move disk 1 from 1 to 3.    	Move disk 1 from 1 to 2.
 	 Move disk 2 from 1 to 2.   	Move disk 2 from 1 to 3.
    Move disk 1 from 3 to 2.   	Move disk 1 from 2 to 3.
	 Move disk 3 from 1 to 3.     Move disk 3 from 1 to 2.
	 Move disk 1 from 2 to 1.		Move disk 1 from 3 to 1.
    Move disk 2 from 2 to 3.    	Move disk 2 from 3 to 2.
	 Move disk 1 from 1 to 3. 		Move disk 1 from 1 to 2.
	 										Move disk 4 from 1 to 3. 
											Move disk 1 from 2 to 3.
											Move disk 2 from 2 to 1.
											Move disk 1 from 3 to 1.
   										Move disk 3 from 2 to 3.
   										Move disk 1 from 1 to 2.
   										Move disk 2 from 1 to 3.
 											Move disk 1 from 2 to 3.
   									
    ******************************/