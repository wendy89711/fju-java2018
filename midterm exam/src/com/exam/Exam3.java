package com.exam;

import java.util.Random;
import java.util.Scanner;

public class Exam3 {
    /* �ĤT�D  �q�Ʀr�{�� 20�� 
		1. �����ͤ@�Ӥ���1��10���üơA�����K�Ʀr (���]�O7)
		2. ���ϥΪ̲q�o�ӼƦr�A�p�U:
		Your guess: 5(�ϥΪ̲q5)
		3. ���ܨϥΪ̭n���@�I�ΧC�@�I�A�A�ХL�q�U�@���A�p�U:
		higher
		Your guess: 9(�ϥΪ̲q9)
		lower
		4. ��ϥΪ̲q�����K�Ʀr�ɡA�L�X:
		Great! The secret number is 7
		
		����: �bwhile�j�餤�i�ϥ�break���O���X�j��~�C
		�� �Y���Q�����O�]�p�������D�A�[�������C
		
	    �ĥ|�D �p��q�X�� 10��
	        �ӲĤT�D�A�p�G�ϥΪ̲q�G���H��(�]�A�G��)�q��ɡA�����:
	   Excellent! The secret number is 7

    */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int secret = random.nextInt(10)+1;
		System.out.println(secret);
		System.out.print("Guess a number(1-10):");
		Scanner scanner = new Scanner(System.in);
		int high = 10;
		int low = 1;
		while(true){
			int guess = scanner.nextInt();
			if(guess ==secret){
				System.out.println("Great! The secret number is"+"\t"+guess);
			}else{
				if (guess >= low && guess < secret)
				System.out.println("Your guess:"+guess+"\n"+"higher");
				if (guess > secret && guess <= high)
				System.out.println("Your guess:"+guess+"\n"+"lower");
			}
		}
		

	}

}
