package javaProject;

public class Array1 {

	public static void main(String[] args) {
		
		int arr[]= {2, 98, 6, 61, 40};
		
		System.out.println("Original array : ");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		
		System.out.println();
		
		System.out.println("Reversed array : ");
		for(int i=arr.length-1; i>=0; i--)
			System.out.print(arr[i] + " ");

	}

}
