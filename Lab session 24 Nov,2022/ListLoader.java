package lab;
//question no 1
import java.util.ArrayList;

public class ListLoader extends Thread {//main class
	ArrayList Integer= new ArrayList <Integer> ();//taking arraylist
	public void loadlist(int startNumber, int lastNumber) //method
	{
		for(Integer i=startNumber;i<=lastNumber;i++) {//adding numbers
			Integer s=i+i;
			
		}
		
	}
	public static void main(String[] args) {//main method
		ListLoader l=new ListLoader();//object of listloader class
		Thread th=new Thread();//object of thread class
		double t=System.currentTimeMillis();//response time
		
		l.loadlist(0, 100000);//taking numbers range
		double t2=System.currentTimeMillis();//response time
		th.start();//staring the thread
		System.out.println("Time Taken "+(t2-t));
	}
}