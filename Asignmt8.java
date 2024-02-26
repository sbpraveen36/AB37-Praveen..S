package assignment;

public class Asignmt8 {

	Asignmt8() {

		System.out.println("Constructor 1");
	}

	Asignmt8(int d) {

		System.out.println("Constructor 2");
	}

	Asignmt8(double b) {

		System.out.println("Constructor 3");
	}

	public static void main(String[] args) {

		System.out.println("Calling constructor");
		new Asignmt8();
		new Asignmt8(25);
		new Asignmt8(115.2);
	}
}
