package com.cognizant.shape;

public class Circle {
	float radius;
	static float pi=3.5f;
	public Circle(){
		radius=1.5f;
	}
	Circle(float radius){
		this.radius=radius;
	}
 public Circle(float radius,float pi) {
	 this.radius=radius;this.pi=pi;
}
 float calculateArea(float r)
 { return pi*r*r;}
 float circumference(float r) {
	 return 2* pi*r;
 }
 public static void main(String[]args) {
	 Circle c=new Circle();
	 Circle c1=new Circle();
	 System.out.println(c.calculateArea(6.4f));
	 System.out.println(c1.calculateArea(6.4f));
 }
 }

