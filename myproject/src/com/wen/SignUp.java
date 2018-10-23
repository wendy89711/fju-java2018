package com.wen;

import java.util.Scanner;

public class SignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Are you 18? (y/N)");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		
		System.out.println("*"+line+"*");
		boolean adult = line.equals("y");
		System.out.println(adult);

	}

}
