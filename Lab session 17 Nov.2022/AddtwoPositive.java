/*3.Write a method called addTwoPositive that takes two int 
parameters, and if either value is not positive, throw an 
ArithmeticException, passing the string "Non-positive 
integer sent". to the constructor of the exception.if the
values are both positive, then return the sum of them. 
Under what curcumstances will the finally code block be 
executed in a try/catch/finally segments.*/

public class AddtwoPositive {//main class
	public static int addTwoPositive(int x, int y) {//method to get two numbers

		try {//try block for throwing exception
			if (x < 0 || y < 0) {

				throw new ArithmeticException("Non positive integer sent");

			}
		} catch (ArithmeticException e) {//catch block to print the exception
			System.out.println(e);

		}

		finally {//finally block to print the message either exception occurs or not
			System.out.println("The code is executed");
		}
		return (x + y);//returning sum of x and y
	}

	public static void main(String[] args) {//main method
		addTwoPositive(6, -9);//calling the TwoPositive method and passing two value
	}
}
