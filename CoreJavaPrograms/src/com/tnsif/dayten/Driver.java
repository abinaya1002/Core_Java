package com.tnsif.dayten;

public class Driver {
	public static void main(String args[]) {
		int n = 10;
		int a[]; // declaration
		a = new int[n]; // instantiation

		// displaying the array
		ArrayOperationDemo.printArray(a);

		// assigning values in array a
		for (int i = 0; i < a.length; i++)
			a[i] = 5 * i;

		ArrayOperationDemo.printArray(a);

		int b[] = { 10, 20, 30, 40, 50 }; // initialization at the time of declaration
		ArrayOperationDemo.printArray(b);

		// calling variable argument function
		System.out.println("sum of array elements is : " + ArrayOperationDemo.getSum(b));
		System.out.println("sum of array elements is : " + ArrayOperationDemo.getSum(10, 20));

		b[2] = 999; // assigning single element
		// RTE - ArrayIndexOutOfBoundsException
		// b[20]=10;
		ArrayOperationDemo.printArray(b);

		// Display total no. of Odd and Even Numbers in array b

		System.out.println("Odd numbers : " + ArrayOperationDemo.getOddCount(b) + "\tEven numbers : "
				+ ArrayOperationDemo.getEvenCount(b));
		System.out.println();
		System.out.println("---------------------------------------");

		int c[];
		// ArrayOperations.printArray(c); //CTE

	}

}

