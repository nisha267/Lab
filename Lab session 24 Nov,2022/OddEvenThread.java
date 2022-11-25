package lab;
//Create two threads to print even numbers and odd numbers from 1 to 100?
//note: after printing of all even numbers only odd numbers should print
public class OddEvenThread extends Thread {
	public void run() {//run method
		System.out.println("Even numbers are");
		for(int i=1;i<100;i++) {//getting number from 1 to 100
			if(i%2==0) {//for even no
				System.out.print(" "+i);
				
			}
			
		}}
	public void run2() {//for odd number
		System.out.println();
		System.out.println("Odd numbers are");
		for(int i=1;i<100;i++) {
			if(i%2!=0) {
				System.out.print(" "+i);
				}}
		
		
	}
	public static void main(String[] args) {
		OddEvenThread t1=new OddEvenThread();//creating thread of main class
		OddEvenThread t2=new OddEvenThread();//creating thread of main class
		t1.run();
		t2.run2();
	}}
		
		
	
