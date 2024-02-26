package assignment;
import java.util.Scanner;
public class Assignment36 {
	static Scanner s1 = new Scanner(System.in);
	static void add() {
		int a = s1.nextInt();
		int b = s1.nextInt();
		int sum = a+b;
		System.out.println("Sum of a & b is- "+sum);
	}
	static void subtract() {
		int a = s1.nextInt();
		int b = s1.nextInt();
		int sub = a-b;
		System.out.println("Subtraction of a & b is- "+sub);
	}
	static void multiplication() {
		int a = s1.nextInt();
		int b = s1.nextInt();
		int mul = a*b;
		System.out.println("Multiplication of a & b is- "+mul);
	
	}
	static void division() {
		int a = s1.nextInt();
		int b = s1.nextInt();
		int div = a/b;
		System.out.println("Division of a & b is- "+div);	
	}
	public static void main(String[] args) {
		
		add();
		subtract();
		multiplication();
		division();
		
	}

}
