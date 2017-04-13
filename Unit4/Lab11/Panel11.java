   //Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 7.14.2003

   import java.awt.*;
   import java.awt.event.*;
   import javax.swing.*;
    public class Panel11 extends JPanel
   {
      private JTextField box;
      private JLabel label;
      private JPanel panel;
      private Display11 display;
      private JButton button2;
       public Panel11()
      {
         setLayout(new BorderLayout());
      
         panel= new JPanel();
         panel.setLayout(new FlowLayout());
         label= new JLabel("Enter a digit from 0 to 255:");
         label.setFont(new Font("Serif", Font.BOLD, 20));
         panel.add(label);
         box= new JTextField("", SwingConstants.RIGHT);
         panel.add(box);
         add(panel, BorderLayout.NORTH);
         /********************
      	a local panel, holding a label and a textField, is in the north.
      	
      	a display is in the center.
      	*********************/
      	display = new Display11();
         add(display, BorderLayout.CENTER);
         JPanel south = new JPanel();
         south.setLayout(new FlowLayout());
         add(south, BorderLayout.SOUTH);
         JButton button1 = new JButton("Convert");
         button1.addActionListener(new Listener1());
         south.add(button1);
         button2 = new JButton("Step");
         button2.addActionListener(new Listener2());
         south.add(button2);
         button2.setEnabled(false);
         label = new JLabel("");
         south.add(label);
      }
       private class Listener1 implements ActionListener
      {
          public void actionPerformed(ActionEvent e)
         {
            button2.setEnabled(false);
            int x;
            try
            {
               x = Integer.parseInt(box.getText());
            }
                catch(NumberFormatException f)
               {
                  label.setText("That's not a number!");
                  display.setBlank();
                  return;
               }
            if( x > 255 || x < 0 )
            {
               label.setText("Number must be from 0 to 255.");
               display.setBlank();
               return;
            }
            label.setText("");
            display.setValue(x);
            button2.setEnabled(true);
         }
      }
       private class Listener2 implements ActionListener
      {
          public void actionPerformed(ActionEvent e)
         {
          int x = Integer.parseInt(box.getText());
          x++;
          box.setText(""+x);
          display.setValue(x);
            /******************
         	increment and display both numbers here
         	******************/
         }
      }
   }