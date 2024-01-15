package javaProject;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		int arr[]= new int[4];
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the elements of the array");
		
		for(int i=0; i<arr.length; i++)
			arr[i]=s.nextInt();
		
		System.out.println("Array elements are ");
		
	    int sum=0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum=arr[i] + sum;
		}
		
		System.out.println();
		System.out.println("Sum of the given values is : "+sum);
		
	}

}
