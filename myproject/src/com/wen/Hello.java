package com.wen;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Your name:");
//		String name = scanner.nextLine();
//		System.out.println(name);
//		
//		
//		System.out.println(3 == 5);
//		String s = new  String("abc");
//		System.out.println(s);
		
		Student stu = new Student("Wendy",70,50);
		/*stu.name = "Hank";
		stu.english = 70;
		stu.math = 90;*/
		stu.print();
		
//		String name = "Hank";
//		int english = 70;
//		int math = 90;
//		System.out.println(name + "\t" + english +"\t" + math + "\t"+(english+math)/2);
		
//		System.out.println("Hank 70 90 ");
		
		Person p = new Person(44.4f , 1.513f);
//		Person p = new Person();
//		p.weight = 44.4f;
//		p.height = 1.513f;
		System.out.println(p.bmi());
		p.hello();
		Person hank = new Person(55.4f , 1.8f);
		System.out.println(hank.bmi());
//      Person jack = null;
//      jack.hello();
		
        /*System.out.println("Hello.world");
        int age = 18;
        float weight = 44.4f;
        float height = 151.3f;
        String name = "Wendy";
        int schoolYear = 107;
        System.out.println(age);
        System.out.println(weight);
        System.out.println(name);
        System.out.println(schoolYear);*/
        
        
	}

}
