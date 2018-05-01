package ch03_pr1_TemperatureConverter;

import java.text.NumberFormat;
import java.util.Scanner;

public class TempConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Temperature Converter");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		
		System.out.println("Enter degrees in Fahrenheit: ");
		double f = sc.nextDouble();
		
		double c = (f - 32) * 5/9;
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(2);
		String celString = number.format(c);
		
		System.out.println("Degrees in Celsius: " + celString + "\n");
		System.out.println("Continue? (y/n): ");
		choice = sc.next();
		System.out.println();
		}
	System.out.println("Bye!");
	sc.close();
		
		
					

	}

}
