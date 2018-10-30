package com.wen;

import java.util.Random;

public class Practice {

	public static void main(String[] args) {
		int a = 3;
		while (a>1){
			System.out.println("yyy");
			a = a -4;
		}
		
		System.out.println("I'm thinking of a number between 1 and 100(including both). Can you guess what it is?");
		Random random = new Random();
		int secret = random.nextInt(100)+1;
		System.out.println(secret);
		
		int n = 5/3;
		System.out.println(n);
		short m = 5%3;
		System.out.println(m);
		double q = 5/3.0;
		System.out.println(q);
		
		float b = 10.66f;
		String nick = "Wendy";
		System.out.printf("Hi,%s,Your age:,%.2f\n",nick,b);
		
		double c = 24;
		System.out.println(c*(9/5.0)+32);
	}

}
