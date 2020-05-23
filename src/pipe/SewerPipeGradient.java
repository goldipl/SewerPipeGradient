package pipe;

import java.util.Scanner;

/* Program calculating the gradient of the sewer pipe.
 * You have to enter your unit, first and second pipe level and pipe length.
 * That' all. Pretty simple. */

public class SewerPipeGradient {

	public static void main(String[] args) {
		float plvl1, plvl2, g, l;
		int unit;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Program calculating the gradient of the sewer pipe.");
		System.out.println("Choose your unit '1' = m, '2' = cm, '3' = mm");
		Scanner scanUnit = new Scanner(System.in);
        unit = scanUnit.nextInt();
        
        if (unit == 1 ) { 

                System.out.println("Your choice = meters");
                System.out.println("Now you have to enter first pipe level = higher level");
                System.out.println("Please use integer ;)");
                plvl1 = scn.nextInt();  
                System.out.println("Please enter the second pipe level");
                plvl2 = scn.nextInt();  
                System.out.println("Please enter: pipe length (unit = meters)");
                l = scn.nextInt(); 
                g = (((plvl1 - plvl2)/l)*100);
                System.out.println("Gradient of the sewer pipe = " + g + " %");
            
        } else if (unit == 2 ) { 
             
                System.out.println("Your choice = centimeters");
                System.out.println("Now you have to enter first pipe level = higher level");
                System.out.println("Please use integer ;)");
                plvl1 = scn.nextInt(); 
                System.out.println("Please enter the second pipe level");
                plvl2 = scn.nextInt(); 
                System.out.println("Please enter: pipe length (unit = centimeters)");
                l = scn.nextInt(); 
                g = (((plvl1 - plvl2)/l)*100);
                System.out.println("Gradient of the sewer pipe = " + g + " %");
                
        } else if (unit == 3 ) { 
                
                System.out.println("Your choice = millimeters");
                System.out.println("Now you have to enter first pipe level = higher level");
                System.out.println("Please use integer ;)");
                plvl1 = scn.nextInt();  
                System.out.println("Please enter the second pipe level");
                plvl2 = scn.nextInt(); 
                System.out.println("Please enter: pipe length (unit = millimeters)");
                l = scn.nextInt(); 
                g = (((plvl1 - plvl2)/l)*100);
                System.out.println("Gradient of the sewer pipe = " + g + " %");
    		
        } else {
        	
        	System.out.println("You have chosen the wrong number of unit!");
        	System.out.println("Run application one more time :)");      	
        	System.out.println("END :)");
            scanUnit.close();
          
        }
      scn.close();  
   }           
}
