package pipe;

import java.util.Scanner;

/* Program calculating the gradient of the sewer pipe.
 * You have to enter your unit, first and second pipe level and pipe length.
 * That' all. Pretty simple. */

public class SewerPipeGradient {

	public static void main(String[] args) {
		float plvl1, plvl2, g, l;
		int unit;
		
		System.out.println("Program calculating the gradient of the sewer pipe.");
		System.out.println("Choose your unit '1' = m, '2' = cm, '3' = mm");
		Scanner scanUnit = new Scanner(System.in);
        unit = scanUnit.nextInt();
		
		switch (unit) {
        case 1:
            System.out.println("Your choice = meters");
            System.out.println("Now you have to enter first pipe level = higher level");
            System.out.println("Please use integer ;)");
    		Scanner scanMetersFirstPipeLevel = new Scanner(System.in);
            plvl1 = scanMetersFirstPipeLevel.nextInt();  
            System.out.println("Please enter the second pipe level");
    		Scanner scanMetersSecondPipeLevel = new Scanner(System.in);
            plvl2 = scanMetersSecondPipeLevel.nextInt();  
            System.out.println("Please enter: pipe length (unit = meters)");
    		Scanner scanLength1 = new Scanner(System.in);
            l = scanLength1.nextInt(); 
            g = (((plvl1 - plvl2)/l)*100);
            System.out.println("Gradient of the sewer pipe = " + g + " %");
            break;
        case 2:
            System.out.println("Your choice = centimeters");
            System.out.println("Now you have to enter first pipe level = higher level");
            System.out.println("Please use integer ;)");
    		Scanner scanCentimetersFirstPipeLevel = new Scanner(System.in);
            plvl1 = scanCentimetersFirstPipeLevel.nextInt(); 
            System.out.println("Please enter the second pipe level");
    		Scanner scanCentimetersSecondPipeLevel = new Scanner(System.in);
            plvl2 = scanCentimetersSecondPipeLevel.nextInt(); 
            System.out.println("Please enter: pipe length (unit = centimeters)");
    		Scanner scanLength2 = new Scanner(System.in);
            l = scanLength2.nextInt(); 
            g = (((plvl1 - plvl2)/l)*100);
            System.out.println("Gradient of the sewer pipe = " + g + " %");
            break;
        case 3:
            System.out.println("Your choice = millimeters");
            System.out.println("Now you have to enter first pipe level = higher level");
            System.out.println("Please use integer ;)");
    		Scanner scanMillimetersFirstPipeLevel = new Scanner(System.in);
            plvl1 = scanMillimetersFirstPipeLevel.nextInt();  
            System.out.println("Please enter the second pipe level");
    		Scanner scanMillimetersSecondPipeLevel = new Scanner(System.in);
            plvl2 = scanMillimetersSecondPipeLevel.nextInt(); 
            System.out.println("Please enter: pipe length (unit = millimeters)");
    		Scanner scanLength3 = new Scanner(System.in);
            l = scanLength3.nextInt(); 
            g = (((plvl1 - plvl2)/l)*100);
            System.out.println("Gradient of the sewer pipe = " + g + " %");
            break;
       }
	}
}
