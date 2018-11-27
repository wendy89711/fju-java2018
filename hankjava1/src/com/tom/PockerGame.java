package com.tom;

import java.util.Random;

public class PockerGame {
	public static void main(String[] args) {
		int[]flowers = {0x2663,0x2666,0x2665,0x2660};
		/*
		int[] nums = new int[5]; //°}¦CArray
		nums[4] = 55;
		nums[1] = 44;
		System.out.println(nums[1]);
		System.out.println(nums.length);
		for (int i=0;i<nums.length;i++){
			System.out.println(nums[i]);
		}
		*/
		char f = 0x2660;
		System.out.println(f);
		
		Random random = new Random();
		int number = random.nextInt(13)+1;
		int flower = random.nextInt(4);
//		System.out.print(number);
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
//		System.out.print(c);
		
        

	}

}