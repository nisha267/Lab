package lab;

import java.util.Scanner;

/*Problem 2.
Banking Operations relate a class with customer private instance
variables as accountNumber,accountName,accountBalance and
create methods as
1. create account => accnumber,accname,accbal
2. setAmount=> add amount to accbal
3. getAmount=>print accbal and name account
4. withDrawAmount()=to withdraw amount from accBalance
create a main class to use customer and create atleast two
customers*/
class Create_Ac{//sub class
	private  int accountNumber;//creating instance variables
	private String accountName;
	private double accountBalance;double total;
	public  void Create_Ac(int accnumber,String accname,double accbal) {//constructor
		accountNumber=accnumber;
		accountName=accname;
		accountBalance=accbal;
	}
	public void set_accno(int bank)//setter method to show account number
	 {
		 accountNumber=bank; 
	 }
	 public void set_amount(double bank)//setter method to show account balance
	 {
		 accountBalance=bank; 
	 }
	 public void set_name(String bank)//setter method to show account holder name
	 {
		 accountName=bank;
	 }
	 
	//setAmount method to calculate accountbalance
		 public void setAmount(double amount)
		 {   accountBalance+=amount;
		 System.out.println("Account balance is"+accountBalance);
		 }
		 
		 
		 //withdraw method to calculate withdraw amount
		 public void withdraw(double with) {
			 accountBalance-=with;
			 System.out.println("After withdraw balance is"+accountBalance);
			 
		 }}
public class BankingSystem_main {//main class
	public static void main(String[] args) {//main method
		Scanner sc=new Scanner(System.in);//for input
		int accno,accno1;String name,name1;double bal,bal1,bal2,bal3,bal4,bal5;
		Create_Ac c1=new Create_Ac();//creating object
		Create_Ac c=new Create_Ac();//creating 2nd object
		//taking input from user through object
		System.out.println("Enter account Number");
		accno=sc.nextInt();
		System.out.println("Enter account holder name");
		name=sc.nextLine();
		System.out.println("Enter account balance");
		bal=sc.nextDouble();
		System.out.println("deposit balance");
		bal2=sc.nextDouble();
		System.out.println("withdrawl balance");
		bal3=sc.nextDouble();
		//calling required methods
		c1.set_accno(accno);
		c1.set_name(name);
		c1.set_amount(bal);
		c1.withdraw(bal2);
		c1.setAmount(bal3);
		//taking input from user for 2nd account holder
		System.out.println("Enter account Number");
		accno1=sc.nextInt();
		System.out.println("Enter account holder name");
		name1=sc.nextLine();
		System.out.println("Enter account balance");
		bal1=sc.nextDouble();
		System.out.println("Deposit Balance");
		bal4=sc.nextDouble();
		System.out.println("Withdraw Balance");
		bal5=sc.nextDouble();
		//calling required methods
		c.set_accno(accno1);
		c.set_name(name1);
		c.set_amount(bal);
		c.setAmount(bal4);
		c.withdraw(bal5);

}}
