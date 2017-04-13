 public class Triangle extends Shape
   {
      public double mySide;
   	
   
       public Triangle(double x)
      {
         mySide=x;
      }

       public double getSide()
      {
         return mySide;
      }
		public double getHeight()
      {
      double height=((Math.sqrt(3))/2)*mySide;
      return height;
      }
   	/***************************************************************
   	* Sets the radius to the input number.
   	* @param x	 assigns x to myRadius
   	**************************************************************/
       public void setSide(double x)
      {
      mySide=x;
      }
       
		
   	/***************************************************************
   	* Calculates and returns the circle's area.
   	* @return	 area
   	**************************************************************/
       public double findArea()
      {
         double area= ((Math.sqrt(3))/4)*(Math.pow(mySide, 2));
         return area;
      }
		
   	/**************************************************************
   	* Calculates and returns the circle's circumference.
   	* @return	 circumference
   	**************************************************************/
       public double findPerimeter()
      {
         double p = (3*mySide);
         return p;
      }
   }