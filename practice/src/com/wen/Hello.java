package com.wen;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		while(n>1) {
			System.out.println("www");
			n = n-4;
		}
		int a = 9/4;
		System.out.println(a);
		int b = 9%4;
		System.out.println(b);
		double c = 9/4.0;
		System.out.println(c);
		float d = 45.45f;
		String nick = "Wendy";
		System.out.printf("Hi,%s,Your weight: %.1f KG\n", nick,d);
		
		Person wendy = new Person(45f,1.52f);
		System.out.println(wendy.bmi());
		
		Student stu =new Student("Wendy",82,74);
		stu.print();
		stu.hello();
		
		

	}

}
