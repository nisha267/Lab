//Q.1   Write a Java program to test if an array contains a specific value.
package lab;
import java.util.Scanner;
public class SpecificValueOfArray //main class
{
	public static void main(String[] args) //main method
	{
		Scanner sc=new Scanner(System.in);
		int arr[]= {34,67,87,78,65,45};//taking array
		int n;boolean f=false;int i;
		System.out.println("Type which number you want to search");
		n=sc.nextInt();
		//logic to search the element
		for( i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				f=true;
				break;}}
			if(f)//if f is true,then print the outputs as below
			{
				System.out.println("True");
			System.out.println("The number is found in "+i+" position");}
			else
				System.out.println("False");
		}
	}


