//
// Torbert, 24 July 2013
//
import java.awt.Color;
import java.awt.image.BufferedImage;
//
public class PixelOperations
{
   public Color[][] getArray(BufferedImage img)
   {
      Color[][] arr;
   	//
      int numcols = img.getWidth();
      int numrows = img.getHeight();
   	//
      arr = new Color[numrows][numcols];
   	//
      for(int j = 0; j < arr.length; j++)
      {
         for(int k = 0; k < arr[0].length; k++)
         {
            int rgb = img.getRGB(k,j);
         	//
            arr[j][k] = new Color(rgb);
         }
      }
   	//
      return arr;
   }
   public void setImage(BufferedImage img, Color[][] arr)
   {
      for(int j = 0; j < arr.length; j++)
      {
         for(int k = 0; k < arr[0].length; k++)
         {
            Color tmp = arr[j][k];
            //
            int rgb = tmp.getRGB();
            //
            img.setRGB(k,j,rgb);
         }
      }
   }
   //
	/**********************************************************************/
	//
	// pixel operations
	// 
   public void zeroBlue(Color[][] arr)
   {
      for(int j = 0; j < arr.length; j++)
      {
         for(int k = 0; k < arr[0].length; k++)
         {
            Color tmp = arr[j][k];
            arr[j][k] = new Color( tmp.getRed(), tmp.getGreen(), 0 );
         }
      }
   }
	//--------> your new methods go here   <--------------
   public void grayScale(Color[][] arr)
   {
      for(int j = 0; j < arr.length; j++)
      {
         for(int k = 0; k < arr[0].length; k++)
         {
            Color tmp = arr[j][k];
            int g = ((tmp.getRed()+tmp.getGreen()+tmp.getBlue())/3);
            arr[j][k] = new Color(g,g,g );
         }
      }
   }
  public void splash(Color[][] arr)
   {
      for(int j = 0; j < arr.length; j++)
      {
         for(int k = 0; k < arr[0].length; k++)
         {
            Color tmp = arr[j][k];
            if(tmp.getRed()>165&&tmp.getBlue()<110&&tmp.getGreen()<90)
            {
            arr[j][k] = new Color(255,0,0 );

                       }
            else
            {
            int g = ((tmp.getRed()+tmp.getGreen()+tmp.getBlue())/3);
            arr[j][k] = new Color(g,g,g );
            }
         }
      }
   }


   public void sepia(Color[][] arr)
   {
      for(int j = 0; j < arr.length; j++)
      {
         for(int k = 0; k < arr[0].length; k++)
         {
            Color tmp = arr[j][k];
            int r=(int)((0.393*tmp.getRed())+(0.769*tmp.getGreen())+(0.189*tmp.getBlue()));
            if(r>255)
            {
               r=255;
            }
            int g=(int)((0.349*tmp.getRed())+(0.686*tmp.getGreen())+(0.168*tmp.getBlue()));
            if(g>255)
            {
               g=255;
            }
            int b=(int)((0.272*tmp.getRed())+(0.534*tmp.getGreen())+(0.131*tmp.getBlue()));
            if(g>255)
            {
               g=255;
            }
            arr[j][k] = new Color(r,g,b );
         }
      }
   }
     public void sun(Color[][] arr)
   {
      for(int j = 0; j < arr.length; j++)
      {
         for(int k = 0; k < arr[0].length; k++)
         {
            Color tmp = arr[j][k];
    
            arr[j][k] = new Color(tmp.getRed(),((int)(tmp.getGreen()*.8)),((int)(tmp.getBlue()*.8)) );
         }
      }
   }
  public void pixelate(Color[][] arr)
   {
      for(int j = 1; j < arr.length; j+=3)
      {
         for(int k = 1; k < arr[0].length; k+=3)
         {
            Color tmp = arr[j][k];
    
            arr[j][k] = new Color(tmp.getRed(),tmp.getGreen(),tmp.getBlue() );
            arr[j-1][k-1] = new Color(tmp.getRed(),tmp.getGreen(),tmp.getBlue() );
            arr[j-1][k] = new Color(tmp.getRed(),tmp.getGreen(),tmp.getBlue() );
            arr[j][k-1] = new Color(tmp.getRed(),tmp.getGreen(),tmp.getBlue() );
            arr[j+1][k+1] = new Color(tmp.getRed(),tmp.getGreen(),tmp.getBlue() );
            arr[j+1][k] = new Color(tmp.getRed(),tmp.getGreen(),tmp.getBlue() );
            arr[j][k+1] = new Color(tmp.getRed(),tmp.getGreen(),tmp.getBlue() );
            arr[j-1][k+1] = new Color(tmp.getRed(),tmp.getGreen(),tmp.getBlue() );
            arr[j+1][k-1] = new Color(tmp.getRed(),tmp.getGreen(),tmp.getBlue() );
         }
      }
   }

    public void mirrorLR(Color[][] arr)
   {

      for(int j = 0; j < arr.length; j++)
      {
         for(int k = 0; k < arr[0].length/2-1; k++)
         {
            Color tmp = arr[j][k];
            arr[j][(arr[0].length)-k-1]=new Color(tmp.getRed(), tmp.getGreen(),tmp.getBlue());
         }
      }
   }
  public void mirrorUD(Color[][] arr)
   {

      for(int j = 0; j < arr.length/2; j++)
      {
         for(int k = 0; k < arr[0].length; k++)
         {
            Color tmp = arr[j][k];
            arr[arr.length-j-1][k]=new Color(tmp.getRed(), tmp.getGreen(),tmp.getBlue());
         }
      }
   }
 public void setRed(Color[][] arr, double red)
   {
      for(int j = 0; j < arr.length; j++)
      {
         for(int k = 0; k < arr[0].length; k++)
         {
            Color tmp = arr[j][k];
            arr[j][k] = new Color( (int)(tmp.getRed()+(red/100)), tmp.getGreen(), tmp.getBlue());
   
}
}
}
}
//
// end of file
//