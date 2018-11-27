package com.tom;

import java.util.Random;

public class PockerGame {

	public static void main(String[] args) {
		Random random = new Random();
		int number = random.nextInt(13)+1;
		int flower = random.nextInt(4);
		System.out.print(number);
		char c = 0;
		switch(flower){
		case 0:
			c = 'C';
			break;
		case 1:
			c = 'D';
			break;
		case 2:
			c = 'H';
			break;
		case 3:
			c = 'S';
			break;
		}
		System.out.print(c);
		
        

	}

}