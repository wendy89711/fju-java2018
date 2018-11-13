package com.wen;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		int number = 0;
		while(number != -1){
		System.out.print("Please enter number of tickets: ");
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		if(number == -1)
			break;
		Ticket ticket = new Ticket(number);
		ticket.startInput();
		}
	}

}
