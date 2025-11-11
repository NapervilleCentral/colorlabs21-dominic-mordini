
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
     Picture apic = new Picture("images\\beach.jpg");
     Picture ferris1 = new Picture("images/2000 ferris wheel2.jpg");
     Picture bMark = new Picture("images/blue-mark.jpg");
     Picture cycle = new Picture("images/blueMotorcycle.jpg");
     Picture temple1 = new Picture("images/temple.jpg");
     
    

     //!!!!!!!! Displays the picture
     
    
     
     //makes an array of pixels
     Pixel[] pixels;
     Pixel[] pixels2;
     Pixel[] pixels3;
     Pixel[] pixels4;
     Pixel[] pixels5;
     //gets pixels from picture and assigns to pixels array
     pixels = ferris1.getPixels();
     pixels2 = apic.getPixels();
     pixels3 = bMark.getPixels();
     pixels4 = cycle.getPixels();
     pixels5 = temple1.getPixels();
    
     //how many pixels or how large array
    System.out.println("This is a large array"+pixels.length  );
    temple1.explore();
    bMark.explore();

    /**/
        //access each index, arrray note
    // System.out.println(pixels[17]);
    // //access each pixel pic.methods.getPixel
    // Pixel spot = ferris1.getPixel(100,100);
    // Pixel spot50 = ferris1.getPixel(50,50);
    // Color lesteel = new Color(176,196,222);
    
    
    // System.out.println(pixels[17].getColor());
    // System.out.println(spot);
    
    // Pixel spot17 = pixels[17];
    // spot17.setRed(200);
    // spot17.setBlue(150);
    // spot17.setGreen(175);
    // ferris1.explore();
    
    // spot.setColor(Color.yellow);
    // ferris1.explore();
/*
    pixels[17].setColor(Color.blue);
    spot.setColor(new Color(252,252,252));
    pixels[500034].setColor(Color.blue);

    ferris1.explore();
/**/
   // loop to access indexes of array or collection

    //for each loop spot  is a ?
    int red;
    int blue;
    int green;
    for (Pixel spot1 : pixels)
    {
        blue = spot1.getBlue();
        red = spot1.getRed();
        green = spot1.getGreen();
        blue = (int)(blue * .25);
        red = (int)(red * .50);
        green = (int)(green * 1.5);
        spot1.setBlue(blue);
        spot1.setRed(red);
        spot1.setGreen(green);
    }
        //System.out.println( spot1 );
     ferris1.explore();
    for (Pixel spot2 : pixels4)
    {
        red = spot2.getRed();
        green = spot2.getGreen();
        blue = spot2.getBlue();
        red = red;
        blue = (red + 5);
        green = (red - 5);
        spot2.setBlue(blue);
        spot2.setRed(red);
        spot2.setGreen(green);
    }
     cycle.explore();
    for (Pixel spot3 : pixels5)
    {
        red = spot3.getRed();
        green = spot3.getGreen();
        blue = spot3.getBlue();
        red = (red + 50);
        green = (green + 50);
        blue = (blue + 50);
        spot3.setBlue(blue);
        spot3.setRed(red);
        spot3.setGreen(green);
    }
    temple1.explore();
    for (Pixel spot3 : pixels5)
    {
        red = spot3.getRed();
        green = spot3.getGreen();
        blue = spot3.getBlue();
        red = (red - 50);
        green = (green - 50);
        blue = (blue - 50);
        spot3.setBlue(blue);
        spot3.setRed(red);
        spot3.setGreen(green);
    }
    temple1.explore();
    // for (Pixel spot4 : pixels3)
    // {
        // red = spot4.getRed();
        // green = spot4.getGreen();
        // blue = spot4.getBlue();
        // if ((blue >= 20) && (red < 30))
        // {
          // red = (red + 250);
        // green = (green - 250);
        // blue = (blue - 250);
        // spot4.setBlue(blue);
        // spot4.setRed(red);
        // spot4.setGreen(green);  
        // }
    // }
    //bMark.explore();
    for (Pixel spot4 : pixels3)
    {
        red = spot4.getRed();
        green = spot4.getGreen();
        blue = spot4.getBlue();
        if ((red >= 80) && (green >= 70) && (blue < 130));
        {
          red = (int)(red * 0.5);
          green = (int)(green * .25);
          blue = (int)(blue * 1.5);
          spot4.setBlue(blue);
          spot4.setRed(red);
          spot4.setGreen(green);  
        }
    }
    bMark.explore();
    //ferris1.write("images/SFTry1.jpg");

 /**
  * Method to clear red from picture
  * @param none
  * @return none
  */
 /*
    for (Pixel pixelObj : pixels)
        {
            //set the red value of the current pixel to the new value
           

        }
    ferris1.explore();
    
/**/
 /**
  * Method to reduce red from picture by a factor of n
  * @param none
  * @return none
  */

/*
int value;
final double  FACTOR = .5;
    for (Pixel pixelObj : pixels)
    {

        //get the redvalue
        value = pixelObj.getRed();
        //System.out.println(value);

        //decrease the red value by 50%
        
        //set the red value of the current pixel to the new value
        

    }
    // use new picture when changing or it will make changes to 
    // pic you already changed
    ferris1.explore();
    ferris2.explore();

  /**/ 
    //write/save a picture as a file
    ferris1.write("images/ferris11.jpg");

    /**/
  }//main
}//class
