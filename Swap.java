package javaProject;

public class Swap {

	public static void main(String[] args) {

		int a=15;
		int b=10;
		
		System.out.println("Before swapping a =" + a + " and b =" + b);
		
		a= a+b;
		b= a-b;
		a= a-b;
		
		System.out.println("After swapping a =" + a + " and b =" + b);

	}

}
