package com.wen;

public class Student {
	String name;
	int chinese;
	int english;
	
	public Student(String name,int chinese,int english) {
		this.name = name;
		this.chinese = chinese;
		this.english = english;
	}
	public void print() {
		System.out.println(name + "\t" + chinese + "\t" + english + "\t"+ (chinese + english)/2);
	}

}
