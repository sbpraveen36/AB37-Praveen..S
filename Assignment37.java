package assignment;

import java.util.Scanner;

public class Assignment37 {
	
	static Scanner s1 = new Scanner(System.in);
	static int a = s1.nextInt();
	static int b = s1.nextInt();
	
	static void addition() {
		
		int sum = a+b;
		System.out.println("addition of a & b is- "+sum);
	}
	
	static void subtraction() {
		
		int sub = a-b;
		System.out.println("Subtraction of a & b is- "+sub);
	}
	static void multiplication() {
		
		int multiplication = a*b;
		System.out.println("multiplication of a & b is- "+multiplication);
	}
	
	static void division() {
		int division  = a/b;
		System.out.println("Division of a & b is- "+division);
	}
	public static void main(String[] args) {
		addition();
		subtraction();
		multiplication();
		division();
	}

}
