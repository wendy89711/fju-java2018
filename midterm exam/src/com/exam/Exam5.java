package com.exam;

import java.util.Scanner;

public class Exam5 {
	/*
	 �Ĥ��D  �l���K�Q�c 40��
	 ���]�l������ثK�Q�c:
	 Box5: ��23�A�e14�A��13 (cm)
	 Box3: ��39.5�A�e27.5�A��23 (cm)
	 1. �ЧQ�Ϊ���ɦV�����O�]�p�o������O�A�æb�o������O���]�p��k:
	 public boolean validate(float length, float width, int height) {
	 
	 }
	   �æb�o��k���]�p�|�^��(boolean)�ӽc�l�O�_��e�ǶǤJ�����B�e�B��������C
	 
	 2. �b���{����main��k���]�p���ϥΪ̿�J�L�Q�H�e���󪺪��e���A��
	          �Q��Box5�PBox3������O�����H�U���]�p:
	   Please enter object's length: 15
	   Please enter object's width: 18
	   Please enter object's height: 10
	   Box3
	      ��
	   Please enter object's length: 20
	   Please enter object's width: 11
	   Please enter object's height: 9
	   Box5
	   �� �P�_�ɥ��ϥ�Box3�PBox5���O  �L����
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please enter object's length: ");
		Scanner scanner = new Scanner(System.in);
		int l = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Please enter object's width: ");
		int w = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Please enter object's height: ");
		int h = scanner.nextInt();
		scanner.nextLine();
	}

}
