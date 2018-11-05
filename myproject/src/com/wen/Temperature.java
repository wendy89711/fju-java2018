package com.wen;

public class Temperature {
	double celsius;
	public Temperature(double c) {
		this.celsius = c;
	}
	public double F() {
		double F = celsius*(9/5.0)+32;
		return F;
	}
}
