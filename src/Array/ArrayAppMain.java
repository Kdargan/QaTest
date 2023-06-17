package Array;

public class ArrayAppMain {

	public static void main(String[] args) {
		int test[] =new int[] {1,8,56,23,94};
		System.out.println(test.length);
		System.out.println(test[2]);
		System.out.println(test[3]);
		//System.out.println(test[4]);
		// To print all the elements of an array of Integer type.
		for (int i =0; i< test.length; i++) {
			System.out.println(test[i]);
		}
		// To print all the elements of an array of String type.
		String [] test2 = {"kiran", "manoj", "ruchi", "tripti"};
		System.out.println(test2.length);
		for (int i =0; i <test2.length; i++) {
			System.out.println(test2[i]);
		}
		// Assignment - Create an array of 10,20,30,40,50 using for loop and print it using loop as well
		int[] test3= new int [5];
		for (int i =0; i< test3.length; i++) {
			int k = (i*10)+10;
			System.out.println(k);
		}
		// Assignment - Copy the elements of array1 to array 2. Need to create array1 & array2.
		// Assignment 2 - Reverse the elements of an array.
		
	}
}


