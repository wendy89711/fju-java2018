package com.wen;

import java.util.Scanner;

public class Len {

	public static void main(String[] args) {
		System.out.print("Enter legth(Centimeter):");
		Scanner scanner = new Scanner(System.in);
		double cm = scanner.nextDouble();
		Length leng = new Length(cm);
		System.out.printf("%.1f cm = %.3f ft",cm,leng.Ft());
	}

}
