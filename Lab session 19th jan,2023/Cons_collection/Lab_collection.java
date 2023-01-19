package com.Spring.entity;

//1. Create a spring application with Constructor Dependency 
//Injection & apply :
//
//a.. constructor injection with collection
import java.util.Iterator;
import java.util.List;

public class Lab_collection {
	private String sname;
	private int rollno;
	private List<Integer> marks;

	public Lab_collection() {
	}

	public Lab_collection(String sname, int rollno, List<Integer> marks) {
		super();
		this.sname = sname;
		this.rollno = rollno;
		this.marks = marks;
	}

	public void display() {
		System.out.println(sname + " " + rollno);
		System.out.println("Subjects marks are: ");
		Iterator<Integer> itr = marks.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
	}
}
