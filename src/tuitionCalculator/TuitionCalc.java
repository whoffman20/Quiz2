package tuitionCalculator;

import java.util.Scanner;

public class TuitionCalc {
	public void Tuition() {

		java.util.Scanner input = new Scanner(System.in);
		
		System.out.println("What is your initial tuition cost");
		double ituition = input.nextDouble();
		
		System.out.println("By what percentage will your tuition increase");
		double ipercentage = 1 + ((input.nextDouble()) / 100);
		
		double total = 0;
		for (int n = 0; n < 4; n++){
			
			double yearlytotal = ituition * Math.pow(ipercentage, n);
			ituition = yearlytotal;
			total += yearlytotal;
			input.close();
		}
		
		System.out.println("The total tuition is" + total);
	}
}
