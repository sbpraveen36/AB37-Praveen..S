package assignment;
import java.util.Scanner;
public class Assignment44 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter value of a");
		int a = s1.nextInt();
		System.out.println("enter value of b & c");
		int b = s1.nextInt();
		int c = s1.nextInt();
		switch (a) {
		case (1): {
			int sum = b + c;
			System.out.println("addition of b&b- " + sum);
			break;
		}
		case (2): {
			int sub = b - c;
			System.out.println("subtraction of b&c- " + sub);
			break;
		}
		case (3): {
			int mul = b * c;
			System.out.println("multiplication of b&c- " + mul);
			break;
		}
		case (4): {
			int div = b / c;
			System.out.println("division of b&c- " + div);
			break;
		}
		}
	}
}
