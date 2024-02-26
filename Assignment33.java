package assignment;

public class Assignment33 {

	final static double pi = 3.14;

	static void circle1() {
		int r = 7;
		double area = pi * r * r;
		System.out.println("Area of circle is- " + area);
	}
	static void circle2() {
		int r = 14;
		double area = pi * r * r;
		System.out.println("Area of circle is- " + area);
	}

	public static void main(String[] args) {
		circle1();
		circle2();
	}
}
