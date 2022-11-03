package lab;
//Q.2   Write a Java program to find the duplicate values of an array of integer values.

public class DuplicateArrayValue//main class
{
	public static void main(String[] args)//main method
	{
		int arr[]= {3,6,6,8,5,3,7,8};//taking array
		int i;
		int count=0;//initializing count variable as 0
		System.out.println("The Duplicate elements are");
		//logic to find and count duplicate element
		for(i=0;i<arr.length;i++)//outer loop
		{
			for(int j=0;j<arr.length;j++)//inner loop 
				{
				if(arr[i]==arr[j]){
					count++;
				}else
					break;
			}
			if(count>1)//if count becomes more than 1
			System.out.println(arr[i]+" - "+count);
			i+=(count-1);
		}
	}

}
