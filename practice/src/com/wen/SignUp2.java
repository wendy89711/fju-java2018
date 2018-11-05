package com.wen;

import java.util.Scanner;

public class SignUp2 {

	public static void main(String[] args) {
		System.out.print("Are u 18?(y/N)");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		boolean adult = line.toUpperCase().equals("Y");
		Member member = new Member(adult);
		if(member.adult) {
			member.startInput();
		}else {
			System.out.println("Thanks,bye");
		}
	}
}