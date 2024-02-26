package assignment;

public class Asignmt5 {

	 void method1() {
		System.out.println("This is static method");
	}

	public static void main(String[] args) {

		System.out.println("Calling non static method from main");
		Asignmt5 a5 = new Asignmt5();
		a5.method1();

	}

}
