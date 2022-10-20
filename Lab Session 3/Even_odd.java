
package lab;

import java.util.Scanner;

/*Problem 1:Write a Java method to check whether every digit of a given integer
is even. Return true if every digit is odd otherwise false?*/
public class Even_odd {//main class
	public static void main(String[] args) //main method
	{
		Scanner sc=new Scanner(System.in);//taking input
		System.out.println("Enter a number");
		
		int n=sc.nextInt();//storing the input
		
		System.out.println("Checking if every digit of the number is even");
		System.out.println(testing(n));
		}
		public static  boolean testing(int n) //method to check the numbers are even or not
		{
			
			if(n==0)//if the number is 0,return false
			{ 
				return false;
				}
			while(n!=0) {//if the number is not 0
				if((n%10)%2!=0){//number is divided by ten and getting the digit,if it is not divisible by 2,return false
					return false;
				}
				n /= 10;
			}
			return true;//otherwise return true
		}}

			