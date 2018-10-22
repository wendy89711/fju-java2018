package com.wen;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person(44.4f,1.515f) ;
		p.hello();
		System.out.println(p.bmi());
		
		Student stu = new Student("Wendy",82,74);
		stu.print();
		
		
		

	}

}
