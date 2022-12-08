/*Problem Statement 1:

Write a Java program to update specific array element by given element*/
package lab;

import java.util.ArrayList;

public class Colour {//main class
	public static void main(String[] args) {//main method
ArrayList<String>color_list=new ArrayList<String>();//creating array list
color_list.add("Red");//adding properties of arraylist
color_list.add("Blue");
color_list.add("Green");
color_list.add("Black");
System.out.println(color_list);//printing previous arraylist
color_list.remove(2);//removing the element of index 2
color_list.add(2,"Yellow");//adding yellow in place of green
System.out.println(color_list);//printing updated arraylist
}}
