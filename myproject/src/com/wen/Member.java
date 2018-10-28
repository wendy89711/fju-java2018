package com.wen;

import java.util.Scanner;

public class Member {
	boolean adult;
	int age;
	String name;
	String nickName;
	public Member(boolean adult) {
		this.adult = adult;
	}
	public Member(int age,String name,String nickname) {
		this.age = age;
		this.name = name;
		this.nickName = nickname;
	}
	public void startInput(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Your age?");
		age = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Your name?");
		name = scanner.nextLine();
		System.out.print("Your nickname?");
		nickName = scanner.nextLine();
		System.out.println(age +"/"+ name +"/"+ nickName);
	}
}
