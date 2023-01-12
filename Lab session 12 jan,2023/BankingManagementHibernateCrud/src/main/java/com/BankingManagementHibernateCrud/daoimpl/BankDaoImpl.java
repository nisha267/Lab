package com.BankingManagementHibernateCrud.daoimpl;

import java.util.Scanner;



import org.hibernate.Session;
import org.hibernate.Transaction;

import com.BankingManagementHibernateCrud.config.HibernateUtil;
import com.BankingManagementHibernateCrud.entity.Bank;

public class BankDaoImpl {
	

		public void openAcc() {
			 Scanner sc=new Scanner(System.in);
				String n,t,d; 
				int b,no;
				long p;
				System.out.println("Enter Account number : ");
				no=sc.nextInt();
				System.out.println("Enter Account Holder name : ");
				n=sc.nextLine();
				n=sc.nextLine();
				System.out.println("Enter Account Type : ");
				t=sc.nextLine();
				System.out.println("Enter IFSC code: ");
				d=sc.nextLine();
				System.out.println("Enter Balance: ");
				b=sc.nextInt();
				System.out.println("Enter pin: ");
				p=sc.nextLong();
				Bank ac = new Bank();
				ac.setAcc_no(no);
				ac.setHolderName(n);
				ac.setIFSC(d);
				ac.setAcc_type(t);
				ac.setBalance(b);
				ac.setPin(p);
				Session session=HibernateUtil.getSessionFactory().openSession();
				Transaction t1=session.beginTransaction();
				session.save(ac);
				t1.commit();}
		public void showAcc() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Name: ");
			String name=sc.nextLine();
			Session session=HibernateUtil.getSessionFactory().openSession();
			Transaction t=session.beginTransaction();
			Bank b1=session.get(Bank.class, name);
			
			System.out.println(b1.getHolderName()+" "+b1.getIFSC()+" "+b1.getBalance()+" "+b1.getPin());
			t.commit();
		 }
		public void changepin() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Name: ");
			String name=sc.next();
			Session session=HibernateUtil.getSessionFactory().openSession();
			Transaction t=session.beginTransaction();
			Bank b=session.get(Bank.class, name);
			System.out.println("Enter phone number: ");
			long p=sc.nextLong();
			b.setPin(p);
			session.update(b);
			System.out.println("Updated successfully...");
			t.commit();}
		public void closeAccount() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Name: ");
			String name=sc.next();
			Session session=HibernateUtil.getSessionFactory().openSession();
			Transaction t=session.beginTransaction();
			Bank b2=session.get(Bank.class, name);
			session.delete(b2);
			System.out.println("deleted successfully...");
			t.commit();
		}
		public void depositBal() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Account number : ");
			int acc_no=sc.nextInt();
			Session session=HibernateUtil.getSessionFactory().openSession();
			Transaction t=session.beginTransaction();
			Bank b3=session.get(Bank.class, acc_no);
			System.out.println("Enter the amount you need to deposit : ");
			int d=sc.nextInt();
			b3.setBalance(d);
			session.update(b3);
			System.out.println("Deposited successfully...");
			t.commit();
		}
		public void withdrawBal() {
			// TODO Auto-generated method stub
			
		}
		}

