package demo;
//Create a class “InheritanceActivity.java” with a main method which performs the below functions,

/*Test case #1:
Create an instance of Manager class by calling the overloaded constructor with the below parameters,

Constructor parameter	Instance Variable
id	126534
Name	"Peter"
address	"Chennai India”
phone	237844
salary	65000

Invoke the calculateSalary method of the manager object. 
The salary calculated should be printed in the console.


Test case #2:
Create an instance of Trainee class by calling the overloaded constructor with the below parameters,
Constructor parameter	Instance Variable
id	29846
Name	"Jack"
address	"Mumbai India”
phone	442085
salary	45000

Invoke the calculateSalary method of the trainee object. 
The salary calculated should be printed in the console.

Problem Statement 2:
Add a method called calculateTransportAllowance in Employee class which should calculate the transport allowance by calculating 10% (default allowance) of the salary. Print the salary after calculating. 
transportAllowance = 10/100*basicSalary.

For a manager, the transportation allowance is 15% of the basic salary. So override the calculateTransportAllowance method in Manager class which should calculate the transport allowance as 15% of the base salary. Print the salary after calculating. 

transportAllowance = 15*basicSalary /100.

For a trainee, the transport allowance is same as the default allowance; the method calculateTransportAllowance in the base class can be used. 

Invoke the calculateTransportAllowance for the manager and trainee class in the main method of  InheritanceActivity.java.*/

public class InheritanceActivity {
	public static void main(String[] args) {
		Manager m = new Manager(126534, "Peter", "chennai india", 237844, 65000);
		Trainee t = new Trainee(29846, "Jack", "Mumbai india", 448025, 45000);
		System.out.println(t.calculatesalary());
		m.tallowance();
		t.calculateTransportAllowance();
	}

}
