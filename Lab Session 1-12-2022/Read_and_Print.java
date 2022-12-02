package lab;
//Question no 2
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
public class Read_and_Print {//main class
	Read_and_Print r=new Read_and_Print();	//creating object of main class
	
	public static void main(String[]args) {//main method
		Scanner sc=new Scanner(System.in);//scanner class object for getthing choice from user
		System.out.println("Press 1 or 2");
		int a=sc.nextInt();//receiving the object
		 {
		try {//can get exception,so writing the code in a try catch block
			switch(a) {
			case 1:{
				FileOutputStream f= new FileOutputStream("C:\\TestInputoutput\\Test.txt");//taking the file
				String s="Hi,welcome to java world";//taking a string
				byte b[]=s.getBytes();//changing string to bye array
				f.write(b);//writing in the file
				f.close();}
			case 2:{
				FileInputStream f1=new FileInputStream("C:\\TestInputoutput\\Test2.txt");

				int i1=0;
				while((i1=f1.read())!=-1) {//start reading from 1st character
					System.out.print((char)i1);
				}
				f1.close();}
			}
			System.out.println("Done");
		}catch(Exception e) {//catching exception
		System.out.println(e);	
		}}}}
		
		