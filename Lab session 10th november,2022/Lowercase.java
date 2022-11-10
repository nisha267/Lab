//Q. 2 

//Write a Java program to find sequences of lowercase letters joined with a underscore.

package lab;

public class Lowercase {//main class
	public static void main(String[] args) {//main method
		String s="Java_program";//taking the string
		boolean b=false;
		for(int i=0;i<s.length();i++) {//loop upto the string length
			if(s.charAt(i)=='_') {//check conditions
				char c=s.charAt(i+1);//initializing the next character
			
				if(Character.isLowerCase(c)) {//if the character will be lowercase
				b=true;
				break;
			}
				
				
		}
	} if(b)
		System.out.println("matched");
	else
		System.out.println("not matched");
		}}


