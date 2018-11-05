package com.wen;

public class Temperature {
	double Celsius;
	public Temperature(double c) {
		this.Celsius = c;
	}
	public double F() {
		double F = Celsius*(9/5.0)+32;
		return F;
	}
	public double K() {
		double K = (Celsius+273.15)*1.8;
		return K;
	}
}
