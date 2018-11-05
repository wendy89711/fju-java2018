package com.wen;

public class Student {
	String Name;
	int English;
	int Chinese;
	public Student(String name,int english,int chinese) {
		this.Name = name;
		this.English = english;
		this.Chinese = chinese;
	}
	public void print() {
		System.out.println(Name+"\t"+English+"\t"+Chinese+"\t"+(English+Chinese)/2);
	}
}
