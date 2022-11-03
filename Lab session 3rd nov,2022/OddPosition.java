package lab;
//Q.3   we need to print the elements of the array which are present in odd positions. This can be accomplished by looping through the array and printing the elements of an array by incrementing i by 2 till the end of the array is reached.

public class OddPosition //main class
{
	public static void main(String[] args)//main method
	{
		int arr[]= {34,56,78,87,98,89,90};//taking array
		System.out.println("Elements which are present in odd position are");
		for(int i=0;i<arr.length;i+=2)//printing odd positions
			System.out.println(arr[i]);
	}

}
