package com.wen;

import java.util.Random;
import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		 Random random = new Random();
		 int secret = random.nextInt(10)+1;
		 System.out.println(secret);
		 int guess = -1;
		 while(guess !=secret){
		 System.out.print("Your guess : ");
		 Scanner scanner = new Scanner(System.in);
		 guess = scanner.nextInt();
		 if(guess > secret){
			 System.out.println("lower");
		 }else{
			 if(guess < secret){
				 System.out.println("higher");
			 }else{
				 System.out.println("Great! The secret number is " + secret);
			 }
		 }
	}

}
}