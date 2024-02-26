package assignment;

public class Assignmt10 {
	static void add() {
		int a = 79;
		int b = 45;
		int sum = a + b;
		System.out.println("addition of a & b is - " + sum);
	}
	static void sub() {
		int a = 40;
		int b = 17;
		int sub = a - b;
		System.out.println("Subtraction of a & b is - " + sub);
	}
	void mul() {
		int a = 15;
		int b = 8;
		int mul = a * b;
		System.out.println("Multiplication of a & b is - " + mul);
	}
	void div() {
		int a = 35;
		int b = 7;
		int div = a / b;
		System.out.println("Division of a & b is - " + div);
	}
	public static void main(String[] args) {

		add();
		sub();
		Assignmt10 a2 = new Assignmt10();
		a2.mul();
		a2.div();
	}
}
