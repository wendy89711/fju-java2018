package com.exam;

import java.util.Scanner;

public class Tickets {
	int number;
	int roundTrip;
	public Tickets(int n){
		this.number = n;
	}
	public double Total(){
		double Total = (number-roundTrip)*2000+roundTrip*2000*0.9;
		return Total;
	}
	public void startInput(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many round-trip tickets:");
		roundTrip = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Total tickets:" +number +"\n"+"Round-trip:"+roundTrip +"\n"+"Total:"+Total());
		
	}

}
