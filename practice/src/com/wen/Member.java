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
    public void startInput() {
    	System.out.print("Your age:");
    	Scanner scanner = new Scanner(System.in);
    	age = scanner.nextInt();
    	scanner.nextLine();
    	System.out.print("Your name:");
    	name = scanner.nextLine();
    	System.out.print("Your nickname:");
    	nickName = scanner.nextLine();
    	System.out.println(age+"/"+name+"/"+nickName);
    }
}
	
