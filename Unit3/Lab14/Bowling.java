import javax.swing.JOptionPane;
public class Bowling
{
   private static int frame=1;
   private static int ball=1;
   private static int pins1, pins2,score,welcome, closing;
  
   public static void main(String[] args)
   {
      welcome=Integer.parseInt(JOptionPane.showInputDialog("Tryna bowl fam?\nPress 1 to play\nPress 0 to quit"));
      if(welcome==1)
      {
      //start of frame 1
      for(int x=0;x<10;x++)
      {
         pins1 = Integer.parseInt(JOptionPane.showInputDialog("Score "+score+"\nFrame "+frame+", Ball "+ ball ));
         if(pins1==10)
         {
            score=score+pins1;
            frame++;
         }
         else{
            while(pins1<0||pins1>10)
            {
               pins1 = Integer.parseInt(JOptionPane.showInputDialog("That's not valid!\nScore "+score+"\nFrame "+frame+", Ball "+ ball ));
            
            
            }
            score=score+pins1;
            ball++;
            pins2 = Integer.parseInt(JOptionPane.showInputDialog("Score "+score+"\nFrame "+frame+", Ball "+ ball ));
            while(pins2<0||pins2>(10-pins1))
            {
               pins2 = Integer.parseInt(JOptionPane.showInputDialog("That's not valid!\nScore "+score+"\nFrame "+frame+", Ball "+ ball ));
            
            
            }
            score=score+pins2;
            ball--;
            frame++;
         }
         }
         
         closing=Integer.parseInt(JOptionPane.showInputDialog("Thank you for playing(Press 0 to quit)"));
         if(closing==0)
         {
         System.exit(0);
         }
         while(closing!=0)
         {
          closing=Integer.parseInt(JOptionPane.showInputDialog("Not a proper exit command\nThank you for playing(Press 0 to quit)"));
         } 
         //start of frame 2
      }
       else 
         {
         while(welcome<0||welcome>1)
         {
         welcome=Integer.parseInt(JOptionPane.showInputDialog("Tryna bowl fam?\nPress 1 to play\nPress 0 to quit"));
         if(welcome==0)
         {
         System.exit(0);
         }
         if(welcome==1)
         {
         for(int x=0;x<10;x++)
      {
         pins1 = Integer.parseInt(JOptionPane.showInputDialog("Score "+score+"\nFrame "+frame+", Ball "+ ball ));
         if(pins1==10)
         {
            score=score+pins1;
            frame++;
         }
         else{
            while(pins1<0||pins1>10)
            {
               pins1 = Integer.parseInt(JOptionPane.showInputDialog("That's not valid!\nScore "+score+"\nFrame "+frame+", Ball "+ ball ));
            
            
            }
            score=score+pins1;
            ball++;
            pins2 = Integer.parseInt(JOptionPane.showInputDialog("Score "+score+"\nFrame "+frame+", Ball "+ ball ));
            while(pins2<0||pins2>(10-pins1))
            {
               pins2 = Integer.parseInt(JOptionPane.showInputDialog("That's not valid!\nScore "+score+"\nFrame "+frame+", Ball "+ ball ));
            
            
            }
            score=score+pins2;
            ball--;
            frame++;
         }
         }
         
         closing=Integer.parseInt(JOptionPane.showInputDialog("Thank you for playing(Press 0 to quit)"));
         if(closing==0)
         {
         System.exit(0);
         }
         while(closing!=0)
         {
          closing=Integer.parseInt(JOptionPane.showInputDialog("Not a proper exit command\nThank you for playing(Press 0 to quit)"));
         } 
         //start of frame 2
      }


   }
}

}
}
