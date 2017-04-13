  public class Rectangle extends Shape
   {
      public double myWidth;
   	public double myHeight;
   
       public Rectangle(double x, double y)
      {
         myWidth=x;
         myHeight=y;
      }

       public double getBase()
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
       public void setWidth(double x)
      {
      myWidth=x;
      }
       public void setHeight(double x)
      {
      myHeight=x;
      }
		
   	/***************************************************************
   	* Calculates and returns the circle's area.
   	* @return	 area
   	**************************************************************/
       public double findArea()
      {
         double area= myWidth*myHeight;
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