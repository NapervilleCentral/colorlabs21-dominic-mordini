
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
      //opens picture using a dialog box
      /**/
     // String fileName = FileChooser.pickAFile();
     // Picture pictObj = new Picture(fileName);
     // pictObj.explore();

     //opens a pictue using a path
     //Picture apic = new Picture("C:\\Users\\khayes\\Favorites\\Documents\APCS- Java\chap03\Curriclum 2013\Picture Color labs\images\\beach.jpg");
     
     //Know it, Love it, Live it!!!!!!!!!!
     //relative path               dir/folder/file
     Picture apic = new Picture("images/jellyFish.jpg");
     Picture canvas = new Picture("images/posterCanvas.jpg");
     Picture bMark = new Picture("images/blue-mark.jpg");
     Picture cycle = new Picture("images/blueMotorcycle.jpg");
     Picture temple1 = new Picture("images/temple.jpg");
     
     mirrorVertical(apic);
     apic.explore();
     // copytoCanvas(apic,canvas);
     // canvas.explore();
     
     // ferris1.explore();
     // bMark.explore();
    
     
     
     
     

     //!!!!!!!! Displays the picture
     
    
     
     //makes an array of pixels
     // Pixel[] pixels;
     // Pixel[] pixels2;
     // Pixel[] pixels3;
     // Pixel[] pixels4;
     // Pixel[] pixels5;
     // //gets pixels from picture and assigns to pixels array
     // pixels = ferris1.getPixels();
     // pixels2 = apic.getPixels();
     // pixels3 = bMark.getPixels();
     // pixels4 = cycle.getPixels();
     // pixels5 = temple1.getPixels();
    
     // //how many pixels or how large array
    // System.out.println("This is a large array"+pixels.length  );
    // temple1.explore();
    // bMark.explore();

    // /**/
        // //access each index, arrray note
    // // System.out.println(pixels[17]);
    // // //access each pixel pic.methods.getPixel
    // // Pixel spot = ferris1.getPixel(100,100);
    // // Pixel spot50 = ferris1.getPixel(50,50);
    // // Color lesteel = new Color(176,196,222);
    
    
    // // System.out.println(pixels[17].getColor());
    // // System.out.println(spot);
    
    // // Pixel spot17 = pixels[17];
    // // spot17.setRed(200);
    // // spot17.setBlue(150);
    // // spot17.setGreen(175);
    // // ferris1.explore();
    
    // // spot.setColor(Color.yellow);
    // // ferris1.explore();

    // pixels[17].setColor(Color.blue);
    // spot.setColor(new Color(252,252,252));
    // pixels[500034].setColor(Color.blue);

    // ferris1.explore();

   // // loop to access indexes of array or collection

    // //for each loop spot  is a ?
    // int red;
    // int blue;
    // int green;
    // for (Pixel spot1 : pixels)
    // {
        // blue = spot1.getBlue();
        // red = spot1.getRed();
        // green = spot1.getGreen();
        // blue = (int)(blue * .25);
        // red = (int)(red * .50);
        // green = (int)(green * 1.5);
        // spot1.setBlue(blue);
        // spot1.setRed(red);
        // spot1.setGreen(green);
    // }
        // //System.out.println( spot1 );
     // ferris1.explore();
    // for (Pixel spot2 : pixels4)
    // {
        // red = spot2.getRed();
        // green = spot2.getGreen();
        // blue = spot2.getBlue();
        // red = red;
        // blue = (red + 5);
        // green = (red - 5);
        // spot2.setBlue(blue);
        // spot2.setRed(red);
        // spot2.setGreen(green);
    // }
     // cycle.explore();
    // for (Pixel spot3 : pixels5)
    // {
        // red = spot3.getRed();
        // green = spot3.getGreen();
        // blue = spot3.getBlue();
        // red = (red + 50);
        // green = (green + 50);
        // blue = (blue + 50);
        // spot3.setBlue(blue);
        // spot3.setRed(red);
        // spot3.setGreen(green);
    // }
    // temple1.explore();
    // for (Pixel spot3 : pixels5)
    // {
        // red = spot3.getRed();
        // green = spot3.getGreen();
        // blue = spot3.getBlue();
        // red = (red - 50);
        // green = (green - 50);
        // blue = (blue - 50);
        // spot3.setBlue(blue);
        // spot3.setRed(red);
        // spot3.setGreen(green);
    // }
    // temple1.explore();
    // for (Pixel spot4 : pixels3)
    // {
        // red = spot4.getRed();
        // green = spot4.getGreen();
        // blue = spot4.getBlue();
        // red = (250 - red);
        // blue = (250 - blue);
        // green = (250 - green);
        // spot4.setBlue(blue);
          // spot4.setRed(red);
          // spot4.setGreen(green);
    // }
    // bMark.explore();
    // for (Pixel spot4 : pixels3)
    // {
        // red = spot4.getRed();
        // green = spot4.getGreen();
        // blue = spot4.getBlue();
        // if ((red > 80) && (green >= 50) && (blue < 130))
        // {
          // red = (int)(red * 0.5);
          // green = (int)(green * .25);
          // blue = (int)(blue * 1.5);
          // spot4.setBlue(blue);
          // spot4.setRed(red);
          // spot4.setGreen(green);  
        // }
    // }
    // bMark.explore();
    // //ferris1.write("images/SFTry1.jpg");

 

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
  // /**
   // * copy one pic to another pic/canvas
   // * add two ints to params to place you want pic on the target
   // */
  // public static void copytoCanvas(Picture source, Picture target)
  // {
      // Pixel sourcePix = null;
      // Pixel targetPix = null;
      
      // //loop through columns (targetX is starting point on Canvas)
      // for(int sourceX = 0, targetX = 0; sourceX < source.getWidth(); sourceX++, targetX++)
      // {
          // //loop through the rows
          // for(int sourceY = 0, targetY = 0; sourceY < source.getHeight(); sourceY++, targetY++)
          // {
              // sourcePix = source.getPixel(sourceX, sourceY);
              // targetPix = target.getPixel(targetX, targetY);
              // targetPix.setColor(sourcePix.getColor());
          // }
      // }
  // }
  
  
  
}//class
