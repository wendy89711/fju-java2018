package com.wen;

import java.util.Random;
import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
	System.out.print("Please guess a number");
	Random random = new Random();
	int secret = random.nextInt(100)+1;
//	System.out.println(secret);
	Scanner scanner = new Scanner(System.in);
	int high = 100;
	int low = 1;
	while(true) {
		int guess = scanner.nextInt();
		if (guess == secret) {
			System.out.println("Bingo!");
		}else {
			if(guess>=low&&guess<secret) low=guess;
			if(guess>secret&&guess<=high) high=guess;
			System.out.println(low+"~"+high);
		}
	}

	}

}
