/*Problem Statement 4:

Write a Java program to test an array list is empty or not.*/

package lab;

import java.util.ArrayList;

public class Colour4 {
public static void main(String[] args) {
	ArrayList<String>color_list=new ArrayList<String>();//creating array list
	color_list.add("Red");//adding properties of arraylist
	color_list.add("Blue");
	color_list.add("Green");
	color_list.add("white");
	color_list.add("Black");
	System.out.println(color_list);//printing  arraylist
	System.out.println("Is the ArrayList empty? ");
	boolean b=color_list.isEmpty();//checking if arraylist is empty or not and storing the boolean value in b
	System.out.println(b);
	color_list.removeAll(color_list);
	System.out.println("After removing all elements of arraylist");
	System.out.println("Is the ArrayList empty? ");
	boolean a=color_list.isEmpty();////checking if arraylist is empty or not and storing the boolean value in a
	System.out.println(a);
}
}
