package Java2Labs;

import java.util.Scanner;

public class BMICalculatorObjectOriented {

	public static void main(String[] args) {
		//Create scanner
			Scanner inputDevice = new Scanner(System.in);
			BMI subject = new BMI();
			
			//Take weight in pounds
			System.out.print("Enter weight in pounds: ");
			subject.weightPounds = inputDevice.nextDouble();
			//Take height in inches
			System.out.print("Enter height in inches: ");
			subject.heightInches = inputDevice.nextDouble();
			
			///Convert weight from lb to kg
			subject.convertWeight();
			//Convert height from in to m
			subject.convertHeight();
			//Calculate BMI
			subject.calculateBMI();
			
			//Calculate if user is underweight, normal, or overweight
			subject.calculateHealth();
			
			//Output stats
			subject.outputStats();
	}

}
