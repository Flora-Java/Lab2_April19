import java.util.Scanner;

public class CalculateAreaPerimeter {

	public static void main(String[] args) {
		
		// variables
		double width = 0.0;
		double length = 0.0;
		double height = 0.0;
		double perimeter = 0.0;
		double area = 0.0;
		double volume = 0.0;
		char contin = 'y';
		char contin1;
		
		Scanner scnr = new Scanner (System.in);
		
		System.out.println("Welcome to Grand Circus'Room Detail Generator");
		
		while ( contin == 'y') {
			System.out.print("Enter length: ");
			length = scnr.nextDouble();
			
			System.out.print("Enter width: ");
			width = scnr.nextDouble();
			
			System.out.print("Enter height: ");
			height = scnr.nextDouble();
			if (length > 0 && width > 0 && height > 0) {
			  perimeter = (2 * width) + (2 * length);
			  area = (width * length);
			  volume = (width * length * height);
			
			  System.out.println("Area: " + area);
			  System.out.println("Perimeter: " + perimeter);
			  System.out.println("Volume: " + volume);
			
			  System.out.print("Continue? (y/n): ");
			  contin = scnr.next().charAt(0);
			  contin = Character.toLowerCase(contin);
			
			  System.out.println();
			}
			else {
				contin = 'n';
			    System.out.println("Values have to be greater than 0!");
			}
	
		}
		
		
	}
	
}
