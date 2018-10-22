package com.wen;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person wendy = new Person(45f,1.52f);
		System.out.println(wendy.bmi());
		
		Student stu =new Student("Wendy",82,74);
		stu.print();
		stu.hello();
		
		

	}

}
