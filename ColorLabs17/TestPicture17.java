
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
    Picture pic = new Picture("images/turtle.jpg");
    Picture canvas = new Picture("images/posterCanvas.jpg");
    
    grayScale(pic);
    //mirrorVertical(pic);
    mirrorHoriz(pic);
    copytoCanvas(pic,canvas,0,0);
    canvas.explore();
        
    
     
    
     
     

 

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
   * Method to mirror a vertical line in the middle of the picture based
   * on the width
   */
  public static void mirrorHoriz(Picture source)
  {
      int height = source.getHeight();
      int mirrorPoint = height/2;
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      
      //loop through all the rows
      for(int y = 0; y < source.getHeight(); y++)
      {
          //loop from 0 to the middle
          for(int x = 0; x < mirrorPoint; x++)
          {
              leftPixel = source.getPixel(x,y);
              rightPixel = source.getPixel(height -1 -x,y);
              rightPixel.setColor(leftPixel.getColor());
          }
      }
  }//mirrorVertical
  /**
   * copy one pic to another pic/canvas
   * add two ints to params to place you want pic on the target
   */
  public static void copytoCanvas(Picture source, Picture target, int x, int y)
  {
      Pixel sourcePix = null;
      Pixel targetPix = null;
      
      //loop through columns (targetX is starting point on Canvas) sourceX+=2 - smaller copy every other pixel
      //                                                           sourceX+=.5 - larger, copy every pixel twice, cast as int in the getPixel & set color
      for(int sourceX = 0, targetX = x; sourceX < source.getWidth(); sourceX++, targetX++)
      {
          //loop through the rows                                         sourceY+=2 - smaller
          //                                                              sourceY+=.5 - larger
          for(int sourceY = 0, targetY = y; sourceY < source.getHeight(); sourceY++, targetY++)
          {
              sourcePix = source.getPixel(sourceX, sourceY);
              targetPix = target.getPixel(targetX, targetY);
              targetPix.setColor(sourcePix.getColor());
          }
      }
  }
  public static void grayScale(Picture source)
  {
      Pixel[] pixels = source.getPixels();
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

  }

  
  
  
}//class
