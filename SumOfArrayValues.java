package JAVA;

public class SumOfArrayValues {

	public static void main(String[] args) {
		
		int[] array = {10, 20, 30, 40, 50, 10};
		int sum = 0;
		// Advanced for loop
		for(int num : array)
		{
			sum = sum+num;
		}
System.out.println("Sum of array element is:" +sum);
	}

}
