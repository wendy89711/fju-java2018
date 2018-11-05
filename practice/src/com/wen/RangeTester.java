package com.wen;

import java.util.Scanner;

public class RangeTester {

	public static void main(String[] args) {
		System.out.print("Enter a number(>=-9&&<=8)");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		boolean corrent = n>=-9 && n<=8;
		System.out.println(corrent);

	}

}
