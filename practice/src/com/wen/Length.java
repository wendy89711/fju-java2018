package com.wen;

public class Length {
	double Centimeter;
	public Length(double cm) {
		this.Centimeter = cm;
	}
	public double Ft() {
		double Ft = Centimeter/30.48;
		return Ft;
	}
}
