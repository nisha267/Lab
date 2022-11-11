package lab;

import java.util.StringTokenizer;

public class ProblemString1 {

	public static void main(String[] args) 
	{
		System.out.println();
		//problem statement 1
		System.out.println("problem statement 1");
		
		String s="Welcome to Java World"; //taking the string
		System.out.println(s.charAt(5)); // prints the character present at index 5
		System.out.println(s.compareTo("Welcome")); //compares the String with Welcome
		System.out.println(s.concat("Let us learn")); // Welcome to Java World and Let us learn 
		System.out.println(s.indexOf("a")); //printing index of a
		System.out.println(s.replaceAll("a","e")); //java to jeve
		System.out.println(s.substring(4, 10)); //printing substring from index 4 to 9
		System.out.println(s.toLowerCase()); //prints the text in lowercase
		//problem statement 2
		System.out.println();
		System.out.println("problem statement 2");
		
		StringBuffer sb=new StringBuffer("This is StringBuffer"); //
		
		System.out.println(sb.append("This is a sample program")); //prints the strings merging with This is a sample program
		System.out.println(sb.insert(21,"Object")); //prints object in 21 position
		System.out.println(sb.replace(14, 20, "Builder"));//replace  buffer to builder
		System.out.println(sb.reverse()); //reverse the text
		System.out.println();
		
		System.out.println("problem statement 3");
		StringBuilder st=new StringBuilder("C://IBM//DB2//PROGRAM//DB2COPY1.EXE");
		System.out.println("Drive:"+st.substring(0,3));
		System.out.println("Folder:"+st.substring(3,6).concat("||")+st.substring(7,10).concat("||")+st.substring(11,16));
		System.out.println("File:"+st.substring(20));
		
	}
}

