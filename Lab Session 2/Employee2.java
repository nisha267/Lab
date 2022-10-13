package demo;

//Q.2... Write a java class to develop an employee class object & initialized the emp name & emp Id for 5 Emp. now write another class having name and from this class you have to create 5 employee objects but you are not allowed to use new keyword.
class Employee1 {
	static String emp_name;
	static String emp_id;

	static void display(String n, String id) {
		emp_name = n;
		emp_id = id;
		System.out.println(emp_name + " " + emp_id);

	}

}

public class Employee2 {
	public static void main(String[] args) {
		Employee1.display("Ritesh Paul", "123ayy66");
		Employee1.display("Rita Paul", "873ayy66");
		Employee1.display("Ramen Paul", "4563ayy66");

	}
}
