package lab;

import java.util.ArrayList;
import java.util.List;

public class Colour3 {//main class
public static void main(String[] args) {//main method
	List<String>color_list=new ArrayList<String>();//creating array list
	color_list.add("Red");//adding properties of arraylist
	color_list.add("Green");
	color_list.add("Black");
	color_list.add("White");
	color_list.add("Pink");
	System.out.println("First ArrayList "+color_list);//printing previous arraylist
	List<String>color_list1=new ArrayList<String>();//creating array list 2
	color_list1.add("Red");//adding properties of arraylist
	color_list1.add("Green");
	color_list1.add("Black");
	color_list1.add("Pink");
	System.out.println("Second ArrayList "+color_list);//printing 2nd arraylist
	List<String>ob=new ArrayList<String>();//creating new arraylist to compare and storing elements
	System.out.println("Comparing elements");
	for(String s:color_list)//storing individual elements of 1st arraylist in string s
		ob.add(color_list1.contains(s)?"Yes":"No");//comparing if elements contains in arraylist or not
	System.out.println(ob);//printing the result
	}

}
