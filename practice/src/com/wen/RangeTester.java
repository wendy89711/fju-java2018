package com.wen;

import java.util.Scanner;

public class RangeTester {

	public static void main(String[] args) {
		System.out.println("Please write a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean corrent = number >=-3 && number <=5;
        System.out.println(corrent);
        
		
	}

}
