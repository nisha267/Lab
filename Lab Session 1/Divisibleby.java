//Hands-on Exercise 2
/*Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by 
both.*/
package lab;

public class Divisibleby {
	public static void main(String[] args) {
	System.out.println("Numbers divided by 3 are");
		for (int i=1;i<=100;i++) {
			if(i%3==0) 
				System.out.print(i+" , ");
			}
		System.out.println();
		System.out.println("Numbers divided by 5 are");
		 
		for(int j=1;j<=100;j++) {
			if(j%5==0) 
				System.out.print(j+" , ");
			}
		System.out.println();
		System.out.println("Numbers divided by both 3 & 5 are");
		
		for(int k=1;k<=100;k++)
			if(k%3==0 && k%5==0) {
				System.out.print(k+" , ");
			}
		}
		
	}
	


