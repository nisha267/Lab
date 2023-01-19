package com.Spring.entity;

public class Lab_Object2 {

	private long acc_no;
	private String IFSC;
	private String Branch;

	public Lab_Object2(long acc_no, String IFSC, String Branch) {
		super();
		this.acc_no = acc_no;
		this.IFSC = IFSC;
		this.Branch = Branch;
	}

	public String toString() {
		return "Lab_Object2 [acc_no=" + acc_no + ", IFSC=" + IFSC + ", Branch=" + Branch + "]";
	}
}
