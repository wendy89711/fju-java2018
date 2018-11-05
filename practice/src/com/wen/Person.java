package com.wen;

public class Person {
	float weight;
	float height;
	public Person(float kg,float m) {
		this.weight = kg;
		this.height = m;
	}
	public float bmi() {
		float bmi = weight/(height*height);
		return bmi; 
	}
}


