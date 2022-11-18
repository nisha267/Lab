/*3.Write a method called addTwoPositive that takes two int 
parameters, and if either value is not positive, throw an 
ArithmeticException, passing the string "Non-positive 
integer sent". to the constructor of the exception.if the
values are both positive, then return the sum of them. 
Under what curcumstances will the finally code block be 
executed in a try/catch/finally segments.*/

public class AddtwoPositive {
	public static int addTwoPositive(int x, int y) {

		try {
			if (x < 0 || y < 0) {

				throw new ArithmeticException("Non positive integer sent");

			}
		} catch (ArithmeticException e) {
			System.out.println(e);

		}

		finally {
			System.out.println("The code is executed");
		}
		return (x + y);
	}

	public static void main(String[] args) {
		addTwoPositive(6, -9);
	}
}
