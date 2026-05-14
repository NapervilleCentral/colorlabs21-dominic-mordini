
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
    Picture pic2 = new Picture("images/turtle.jpg");
    Picture pic3 = new Picture("images/turtle.jpg");
    Picture pic4 = new Picture("images/turtle.jpg");
    Picture pic5 = new Picture("images/turtle.jpg");
    Picture canvas = new Picture("images/posterCanvas.jpg");
    
    copytoCanvas(pic,canvas,4000,2000);
    grayScale(pic);
    mirrorVertical(pic);
    copytoCanvas(pic,canvas,0,0);
    mirrorVertical(pic2);
    mirrorHorizontal(pic2);
    shepardFarey(pic2);
    copytoCanvas(pic2,canvas,2000,0);
    upsideDown(pic3);
    invert(pic3);
    copytoCanvas(pic3,canvas,4000,0);
    recursInfinite(pic4,150,0);
    copytoCanvas(pic4,canvas,0,2000);
    sepia(pic5);
    copytoCanvas(pic5,canvas,2000,2000);
    canvas.explore();
   
    canvas.write("images/finalPoster.jpg");
        
    
     
    
     
     

 

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
  * Method to mirror a horizontal line in the middle of the picture based
  * on the height
  */
  public static void mirrorHorizontal(Picture source)
  {
     int height = source.getHeight();
     int mirrorPoint = height / 2;
     Pixel topPixel = null;
     Pixel bottomPixel = null;
    
     // Loop through all the columns
     for (int x = 0; x < source.getWidth(); x++)
     {
         // Loop from 0 to the middle of the height
         for (int y = 0; y < mirrorPoint; y++)
         {
             topPixel = source.getPixel(x, y);
             // Calculate the corresponding pixel on the bottom half
             bottomPixel = source.getPixel(x, height - 1 - y);
             bottomPixel.setColor(topPixel.getColor());
         }
     }
  }
  public static void upsideDown(Picture source) 
  {
      int height = source.getHeight();
      // Only loop to the halfway point to swap top and bottom
      int mirrorPoint = height / 2; 
      Pixel topPixel = null;
      Pixel bottomPixel = null;

      for (int x = 0; x < source.getWidth(); x++) 
      {
          for (int y = 0; y < mirrorPoint; y++) 
          {
              topPixel = source.getPixel(x, y);
              bottomPixel = source.getPixel(x, height - 1 - y);

              // 1. Save the top color temporarily
              java.awt.Color tempColor = topPixel.getColor();

              // 2. Move bottom color to the top
              topPixel.setColor(bottomPixel.getColor());

              // 3. Put the saved temporary color into the bottom
              bottomPixel.setColor(tempColor);
          }
      }
  }
  public static void invert(Picture source)
  {
      Pixel[] pixels = source.getPixels();
      int red, green, blue;

      // Iterate through every pixel in the image
      for (Pixel p : pixels)
      {
          // Get the current RGB values
          red = p.getRed();
          green = p.getGreen();
          blue = p.getBlue();

          // Invert each color component
          p.setRed(255 - red);
          p.setGreen(255 - green);
          p.setBlue(255 - blue);
      }
  }

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
     for (Pixel p : pixels) 
     {
        int gray = p.getRed();  // red = green = blue = gray
        if (gray < min) min = gray;
        if (gray > max) max = gray;
     }
  }
  public static void shepardFarey(Picture source)
  {
      Pixel[] pixels = source.getPixels();
      int min = 255;
      int max = 0;
      double interval = (max - min + 1) / 5.0;
      Color cyan = new Color(50, 168, 168);
      Color orange = new Color(240, 184, 31);
      Color tropicgreen = new Color(31, 240, 142);
      Color violet = new Color(96, 50, 168);
      Color yellow = new Color(240, 233, 31);
      for (Pixel p : pixels) 
      {
          int gray = p.getRed();

          if (gray < min + 5 * interval) {
                p.setColor(cyan);
            }
            else if (gray < min + 4 * interval) {
                p.setColor(violet);
            }
            else if (gray < min + 3 * interval) {
                p.setColor(tropicgreen);
            }
            else if (gray < min + 2 * interval) {
                p.setColor(orange);
            }
            
            else {
                p.setColor(yellow);
            }
      }
  }
  public static void recursInfinite(Picture source, int x, int y) 
  {
      int height = source.getHeight();
      int width = source.getWidth();
      if (width <= 1 || height <= 1) 
      {
          return;
      }
      int innerWidth = width / 2;
      int innerHeight = height / 2;
      int innerX = x + (width / 4);
      int innerY = y + (height / 4);
      for (int row = 0; row < innerHeight; row++) 
      {
          for (int col = 0; col < innerWidth; col++) 
          {
              int srcX = col * 2;
              int srcY = row * 2;
              Pixel sourcePixel = source.getPixel(srcX, srcY);
              Color color = sourcePixel.getColor();
              Pixel targetPixel = source.getPixel(innerX + col, innerY + row);
              targetPixel.setColor(color);
          }
      }
  }
  public static void sepia(Picture source) 
  {
    Pixel[] pixels = source.getPixels();
    for (Pixel p : pixels) { 
        
        int red = p.getRed();
        int green = p.getGreen();
        int blue = p.getBlue();

        // Calculate the sepia values using standard transformation weights
        int newRed = (int)((red * 0.393) + (green * 0.769) + (blue * 0.189));
        int newGreen = (int)((red * 0.349) + (green * 0.686) + (blue * 0.168));
        int newBlue = (int)((red * 0.272) + (green * 0.534) + (blue * 0.131));

        // Ensure values do not exceed the 255 color limit 
        if (newRed > 255) newRed = 255;
        if (newGreen > 255) newGreen = 255;
        if (newBlue > 255) newBlue = 255;

        // Apply the new sepia color to the pixel 
        p.setColor(new Color(newRed, newGreen, newBlue));
    }
  }      
}//class
