package com.wen;

import java.util.Scanner;

public class Ticket {
	int number;
	int roundTrip;
	int total;
	public Ticket(int number){
		this.number = number;
	}
	public void startInput(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many round trip : ");
		int roundTrip = scanner.nextInt();
		int total = (number-roundTrip)*1000 + (int)(roundTrip*2000*0.9f);
		System.out.println("Total tickets : " + number);
		System.out.println("Round-trip : " + roundTrip);
		System.out.println("Total : " + total);
	}
}
