package com.wen;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person(44.4f , 1.513f);
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
