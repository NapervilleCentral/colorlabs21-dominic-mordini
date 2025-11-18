
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
import java.util.List; 
import java.awt.image.ColorConvertOp;// resolves problem with java.awt.List and java.util.List
public class SheparFaireyLab
{

    /**
     * main method, to test the picture
     *
     */
  public static void main(String[] args)
  {
    Picture pic = new Picture("images/seflie.jpg");
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

        // Balanced method assigns equal ranges
        double interval = (max - min + 1) / 5.0;

        // ----------------------------------------------------
        // ----------------------------------------------------
        Color darkBlue = new Color(0, 51, 76);
        Color red = new Color(217, 26, 33);
        Color lightBlue = new Color(112, 150, 158);
        Color offWhite = new Color(222, 222, 161);
        Color offWhite2 = new Color(252, 252, 191);

        // ----------------------------------------------------
        // ----------------------------------------------------
        for (Pixel p : pixels) {
            int gray = p.getRed();

            if (gray < min + interval) {
                p.setColor(darkBlue);
            }
            else if (gray < min + 2 * interval) {
                p.setColor(red);
            }
            else if (gray < min + 3 * interval) {
                p.setColor(lightBlue);
            }
            else if (gray < min + 3.5 * interval) {
                p.setColor(offWhite);
            }
            
            else {
                p.setColor(offWhite2);
            }
        }

        // ----------------------------------------------------
        // ----------------------------------------------------
        pic.explore();
        pic.write("images/selfieBalanced+.jpg");
        
        
        
        // Picture pic = new Picture("images/seflie.jpg");
        // Pixel[] pixels = pic.getPixels();
    
   
        // for (Pixel p : pixels) {
            // int gray = (p.getRed() + p.getGreen() + p.getBlue()) / 3;
            // p.setRed(gray);
            // p.setGreen(gray);
            // p.setBlue(gray);
        // }

       
        // int min = 255;
        // int max = 0;

        // for (Pixel p : pixels) {
            // int gray = p.getRed();  // red = green = blue = gray
            // if (gray < min) min = gray;
            // if (gray > max) max = gray;
        // }

        // // Balanced method assigns equal ranges
        // double interval = (max - min + 1) / 5.0;

        // // ----------------------------------------------------
        // // ----------------------------------------------------
        // Color darkBlue = new Color(0, 51, 76);
        // Color red = new Color(217, 26, 33);
        // Color lightBlue = new Color(112, 150, 158);
        // Color offWhite = new Color(252, 252, 191);

        // // ----------------------------------------------------
        // // ----------------------------------------------------
        // for (Pixel p : pixels) {
            // int gray = p.getRed();

            // if (gray < min + interval) {
                // p.setColor(darkBlue);
            // }
            // else if (gray < min + 2 * interval) {
                // p.setColor(darkBlue);
            // }
            // else if (gray < min + 3 * interval) {
                // p.setColor(red);
            // }
            // else if (gray < min + 4 * interval) {
                // p.setColor(lightBlue);
            // }
            // else {
                // p.setColor(offWhite);
            // }
        // }

        // // ----------------------------------------------------
        // // ----------------------------------------------------
        // pic.explore();
        // pic.write("images/selfieBalanced+.jpg");
    
      
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
        // for (Pixel p : pixels) {
            // int gray = (p.getRed() + p.getGreen() + p.getBlue()) / 3;
            // p.setRed(gray);
            // p.setGreen(gray);
            // p.setBlue(gray);
        // }
        // pic.explore();

       
        // Pixel[] sorted = Arrays.copyOf(pixels, pixels.length);

       
        // Arrays.sort(sorted, new Comparator<Pixel>() {
            // public int compare(Pixel p1, Pixel p2) {
                // return p1.getRed() - p2.getRed(); // red = gray now
            // }
        // });


        // Color darkBlue = new Color(0, 51, 76);
        // Color red = new Color(217, 26, 33);
        // Color lightBlue = new Color(112, 150, 158);
        // Color offWhite = new Color(252, 252, 191);

        // // Each group size = 1/4 of all pixels
        // int group = pixels.length / 4;

        // // ----------------------------------------------------
        // // STEP 4 — Assign colors to sorted array
        // // first 25% darkest → dark blue
        // // next 25% → red
        // // next 25% → light blue
        // // last 25% brightest → off white
        // // ----------------------------------------------------
        // for (int i = 0; i < sorted.length; i++) {
            // Pixel p = sorted[i];

            // if (i < group)
                // p.setColor(darkBlue);
            // else if (i < 2 * group)
                // p.setColor(red);
            // else if (i < 3 * group)
                // p.setColor(lightBlue);
            // else
                // p.setColor(offWhite);
        // }

        // // ----------------------------------------------------
       
        // // ----------------------------------------------------
        // pic.explore();
        // pic.write("images/selfieIntense.jpg");
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

// // STEP 1 — Convert picture to grayscale
        // // ----------------------------------------------------
        // for (Pixel p : pixels) {
            // int gray = (p.getRed() + p.getGreen() + p.getBlue()) / 3;
            // p.setRed(gray);
            // p.setGreen(gray);
            // p.setBlue(gray);
        // }
        // pic.explore();

        // // ----------------------------------------------------
        // // STEP 2 — Find smallest (s) and biggest (b) grayscale
        // // ----------------------------------------------------
        // int s = 255;
        // int b = 0;

        // for (Pixel p : pixels) {
            // int gray = p.getRed();   // all channels equal now
            // if (gray < s) s = gray;
            // if (gray > b) b = gray;
        // }

        // // spacing = (b - s) / 4
        // double range = (b - s + 1) / 4.0;

        // // ----------------------------------------------------
        // // Shepard Fairey 4-color palette
        // // ----------------------------------------------------
        // Color darkBlue = new Color(0, 51, 76);      // group 1
        // Color red = new Color(217, 26, 33);         // group 2
        // Color lightBlue = new Color(112, 150, 158); // group 3
        // Color offWhite = new Color(252, 252, 191);  // group 4

        // // ----------------------------------------------------
        // // STEP 3 — Apply color based on intensity range
        // // ----------------------------------------------------
        // for (Pixel p : pixels) {
            // int gray = p.getRed();

            // if (gray < s + range) {
                // p.setColor(darkBlue);
            // }
            // else if (gray < s + 2 * range) {
                // p.setColor(red);
            // }
            // else if (gray < s + 3 * range) {
                // p.setColor(lightBlue);
            // }
            // else {
                // p.setColor(offWhite);
            // }
        // }

        // // ----------------------------------------------------
        // // STEP 4 — Show intense Shepard-Fairey result
        // // ----------------------------------------------------
        // pic.explore();
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

// // STEP 1 — Convert picture to grayscale (using 1 for-each loop)
        // // ----------------------------------------------------
        // for (Pixel p : pixels) {
            // int gray = (p.getRed() + p.getGreen() + p.getBlue()) / 3;
            // p.setRed(gray);
            // p.setGreen(gray);
            // p.setBlue(gray);
        // }
        // pic.explore();

        // // ----------------------------------------------------
        // // STEP 2 — Find min and max grayscale values (for thresholds)
        // // ----------------------------------------------------
        // int min = 255;
        // int max = 0;

        // for (Pixel p : pixels) {
            // int gray = p.getRed();  // red = green = blue = gray
            // if (gray < min) min = gray;
            // if (gray > max) max = gray;
        // }

        // // Balanced method assigns equal ranges
        // double interval = (max - min + 1) / 4.0;

        // // ----------------------------------------------------
        // // Shepard Fairey "Balanced" 4 Color Palette
        // // ----------------------------------------------------
        // Color darkBlue = new Color(0, 51, 76);
        // Color red = new Color(217, 26, 33);
        // Color lightBlue = new Color(112, 150, 158);
        // Color offWhite = new Color(252, 252, 191);

        // // ----------------------------------------------------
        // // STEP 3 — Assign each pixel a color based on grayscale range
        // // ----------------------------------------------------
        // for (Pixel p : pixels) {
            // int gray = p.getRed();

            // if (gray < min + interval) {
                // p.setColor(darkBlue);
            // }
            // else if (gray < min + 2 * interval) {
                // p.setColor(red);
            // }
            // else if (gray < min + 3 * interval) {
                // p.setColor(lightBlue);
            // }
            // else {
                // p.setColor(offWhite);
            // }
        // }

        // // ----------------------------------------------------
        // // STEP 4 — Display final Balanced Shepard-Fairey image
        // // ----------------------------------------------------
        // pic.explore();
        // pic.write("images/selfieIntense.jpg");

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
       
       
    

    
   
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
    // ferris1.write("images/ferris11.jpg");

    /**/
  }//main
}//class
