
/**
 * Kevin Hayes
 * Test Picture Classes
 *
 * @author (Kevin Hayes)
 * @version (10-19-2016)
 */
import java.util.Random;
import java.awt.*;// the color class in awt library
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List
public class TestPicture17
{

    /**
     * main method, to test the picture
     *
     */
  public static void main(String[] args)
  {
    Picture pic = new Picture("images/jellyFish.jpg");
    Pixel[] pixels = pic.getPixels();
    
   
        for (Pixel p : pixels) {
            int gray = (p.getRed() + p.getGreen() + p.getBlue()) / 3;
            p.setRed(gray);
            p.setGreen(gray);
            p.setBlue(gray);
        }

       
        int min = 255;
        int max = 0;

        for (Pixel p : pixels) {
            int gray = p.getRed();  // red = green = blue = gray
            if (gray < min) min = gray;
            if (gray > max) max = gray;
        }

        mirrorVertical(pic);
        pic.explore();
        
     
    
     
     

 

    /**/
  }//main
  /**
   * Method to mirror a vertical line in the middle of the picture based
   * on the width
   */
  public static void mirrorVertical(Picture source)
  {
      int width = source.getWidth();
      int mirrorPoint = width/2;
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      
      //loop through all the rows
      for(int y = 0; y < source.getHeight(); y++)
      {
          //loop from 0 to the middle
          for(int x = 0; x < mirrorPoint; x++)
          {
              leftPixel = source.getPixel(x,y);
              rightPixel = source.getPixel(width -1 -x,y);
              rightPixel.setColor(leftPixel.getColor());
          }
      }
  }//mirrorVertical
  /**
   * copy one pic to another pic/canvas
   * add two ints to params to place you want pic on the target
   */
  public static void copytoCanvas(Picture source, Picture target)
  {
      Pixel sourcePix = null;
      Pixel targetPix = null;
      
      //loop through columns (targetX is starting point on Canvas) sourceX+=2 - smaller copy every other pixel
      //                                                           sourceX+=.5 - larger, copy every pixel twice, cast as int in the getPixel & set color
      for(int sourceX = 0, targetX = 0; sourceX < source.getWidth(); sourceX++, targetX++)
      {
          //loop through the rows                                         sourceY+=2 - smaller
          //                                                              sourceY+=.5 - larger
          for(int sourceY = 0, targetY = 0; sourceY < source.getHeight(); sourceY++, targetY++)
          {
              sourcePix = source.getPixel(sourceX, sourceY);
              targetPix = target.getPixel(targetX, targetY);
              targetPix.setColor(sourcePix.getColor());
          }
      }
  }
  /**
  * Method to mirror part of the temple picture around a 
  * vertical line at the mirror point to fix the right side of the roof. [cite: 221]
  */
  public static void mirrorTemple(Picture source) 
  {
    int mirrorPoint = 276; 
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    for (int y = 27; y < 97; y++) 
    {
        for (int x = 13; x < mirrorPoint; x++) 
        {
            leftPixel = source.getPixel(x, y); 
            rightPixel = source.getPixel(mirrorPoint + (mirrorPoint - x), y); 
            rightPixel.setColor(leftPixel.getColor());
            count++;
        }
    }
  }

  
  
  
}//class
