package lab;
/*Hands-on Exercise 3
1… Write the following code:
1. A class named Arithmetic with a method named add that takes integers as 
parameters and returns an integer denoting their sum.*/
//A class named Adder that inherits from a superclass named Arithmetic
public class Arithmetic{//parent class
	public int add(int a,int b) {//method
		int c=a+b;
		return c;}
	class Adder extends Arithmetic{};//child class
		public static void main(String[]args) {//main method
			Arithmetic a=new Arithmetic();
		int result=a.add(13,15)	;
		System.out.println(result);
			
		}
		
	}
 