package com.wen;

import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		
		System.out.print("Please enter temparature(Celsius):");
		Scanner scanner = new Scanner(System.in);
		double c = scanner.nextDouble();
		double f = c * (9/5.0) + 32;
		System.out.printf("%.1f C = %.1f F",c, f); 

	}

}
