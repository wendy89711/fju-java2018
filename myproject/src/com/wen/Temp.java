package com.wen;

import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		System.out.print("Please enter a temperature(Celsius):");
		Scanner scanner = new Scanner(System.in);
		double c = scanner.nextDouble();
		Temperature temp = new Temperature(c);
		System.out.printf("%.1f C = %.1f F", c,temp.F());

	}

}
