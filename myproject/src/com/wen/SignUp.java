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
//		boolean adult = line.equalsIgnoreCase("y");
//		boolean adult = line.toUpperCase().equals("Y");
		if (adult){
			System.out.print("Your age?");
			int age = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Your name?");
			String name = scanner.nextLine();
			System.out.print("Your nick name?");
			String nickName = scanner.nextLine();
			System.out.println(age+"/"+name+"/"+nickName);
			
		} else{
			System.out.println("Thanks,bye");
		}

	}

}
