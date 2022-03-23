package Java2Labs;

public class BMI {
	//Create variables
	double weightPounds;
	double heightInches;
	double weightKilograms;
	double heightMeters;
	double bmi;
	String health;
	
	//Convert weight into kilograms
	void convertWeight() {
	weightKilograms = weightPounds/2.2046;
	}
	
	//Convert height to meters
	void convertHeight() {
	heightMeters = heightInches/39.37;
	}
	
	//Calculate BMI (weight/height^2)
	void calculateBMI() {
	bmi = weightKilograms/(heightMeters*heightMeters);
	}
	
	//Calculate if user is underweight, normal, or overweight
	void calculateHealth() {
		//underweight <= 18.5
		if (bmi <= 18.5) {
			health = "underweight";
		}
			//overweight >= 25
		else if (bmi >= 25) {
			health = "overweight";
		}
			//normal > 18.5 & < 25
		else {
			health = "normal weight";
		}
	}
	//Output height, weight, bmi, health
	void outputStats() {
		System.out.println();
		System.out.printf("Height: %.2f", heightMeters); System.out.println(" m. ("+heightInches+" in.)");
		System.out.printf("Weight: %.2f", weightKilograms); System.out.println(" kg. ("+weightPounds+" lb.)");
		System.out.print("BMI: "); System.out.printf("%.4f %n", bmi);
		System.out.println("Assessment: "+health);
	}
}
