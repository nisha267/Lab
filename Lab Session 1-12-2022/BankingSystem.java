package lab;



//1.Implement inter thread communication by creating banking methods like deposit and withdraw.
 class Bank {//sub class
	int total=100000;
	
	synchronized void deposit(int amount) {//synchronized method deposit for inter thread communication and show the depositing amount
		System.out.println("Previous balance is "+total);
		total+=amount;
		System.out.println("Deposite amount "+amount);
		System.out.println("deposit is completed");
		System.out.println("After depositing the total balance is "+total);
		notify();
		try {//try block for sleep method
			Thread.sleep(1500);}
		catch (InterruptedException e) {
			System.out.println(e);
		}
	}
	synchronized void withdraw(int amount1) {//synchronized method withdraw for inter thread communication and show the withdrawl amount
		total-=amount1;
		System.out.println("Withdrawl amount "+amount1);
		System.out.println("withdrawl is completed");
		System.out.println("After withdrawl the total balance is "+total);
		notify();
	}}
class Thread1 extends Thread{//1st thread class
	Bank b;
	Thread1(Bank b){
		this.b=b;
	}
	public void run() {
		b.deposit(50000);
	}}
	class Thread2 extends Thread{//2nd thread class
		Bank b;
		Thread2(Bank b){
			this.b=b;
		}
		public void run() {
			b.withdraw(5000);
		}}
	public class BankingSystem{//main class
public static void main(String[] args) {//main method
	Bank obj=new Bank();
	Thread1 t1=new Thread1(obj);//thread object
	Thread2 t2=new Thread2(obj);//2nd thread object
	t1.start();//starting thread 1
	t2.start();//starting thread 2
}}

	