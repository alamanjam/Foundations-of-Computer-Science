  public class Square extends Rectangle
   {
   
   private double mySide;
       public Square(double x)
      {
         super(x,x);
      }

       public double getSide()
      {
         return myWidth;
      }
      public double getHeight()
      {
         return myHeight;
      }
		
   	/***************************************************************
   	* Sets the radius to the input number.
   	* @param x	 assigns x to myRadius
   	**************************************************************/
       public void setSide(double x)
      {
      myWidth=x;
      }		
   	/***************************************************************
   	* Calculates and returns the circle's area.
   	* @return	 area
   	**************************************************************/
       public double findArea()
      {
         double area= Math.pow(myWidth, 2);
         return area;
      }
		
   	/**************************************************************
   	* Calculates and returns the circle's circumference.
   	* @return	 circumference
   	**************************************************************/
       public double findPerimeter()
      {
         double p = (2*myWidth)+(2*myHeight);
         return p;
      }
      public double findDiagonal()
      {
       double d = Math.sqrt((Math.pow(myWidth, 2))+(Math.pow(myHeight,2)));
       return d;
   }
   }