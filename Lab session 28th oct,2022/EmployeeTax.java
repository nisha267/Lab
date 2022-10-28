package com.cognizant.tax;

public class EmployeeTax{
	public static void main(String[] args) {
		TaxCalculator t=new TaxCalculator();
		t.BasicSalary=25000;
		t.calculateTax();
		t.deductTax();
		t.validateSalary();
		t.BasicSalary=125000;
		t.calculateTax();
		t.deductTax();
		t.validateSalary();
		
	}
}
 class TaxCalculator{
	float BasicSalary;
	float tax;
	boolean citizenship;
	float netSalary;
	
	public void calculateTax() {
		 tax=30*BasicSalary/100;
		System.out.println("The Tax of the employee for the"+BasicSalary+" is "+tax);
			}
	public void deductTax() {
		netSalary=BasicSalary-tax;
		System.out.println("The net salary of the employee "+netSalary);
	}
	public void validateSalary() {
		if(BasicSalary>100000) {
			citizenship=true;
			System.out.println("The salary and citizenship eligibility: "+citizenship);
		}
		else
			citizenship=false;
		System.out.println("The salary and citizenship eligibility: "+citizenship);
	}

}
