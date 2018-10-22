package com.wen;

public class Student {
	String name;
	int chinese;
	int math;
	
	public Student(String name,int chinese,int math) {
		this.name = name;
		this.chinese = chinese;
		this.math = math;
	}
	
	public void print() {
		System.out.println( name + "\t" + chinese + "\t" + math + "\t" + (chinese+math)/2);	
	}
	
	public void hello() {
		System.out.println("Hey");
	}
}
