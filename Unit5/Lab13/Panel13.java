import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class Panel13 extends JPanel
{
   private static Stack<Integer> stack1, stack2, stack3;
   public Panel13()
   {
      int number = Integer.parseInt(JOptionPane.showInputDialog("How many disks?"));
      tower(1, 3, 2, number);
      stack1=new Stack<Integer>();
      stack2=new Stack<Integer>();
      stack3=new Stack<Integer>();
   }
   public void paintComponent(Graphics g)
   {
      
   }
   public static void tower(int start, int finish, int helper, int number)
   {
      if(number>=1)
      {
         tower(start, helper, finish, number-1);
        
         System.out.println("Move disk "+number+" from "+start+" to "+finish+".");
         tower(helper, finish, start, number-1);
      }
   
   }
}