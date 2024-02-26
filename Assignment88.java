package assignment1;

public class Assignment88 {

	public static void main(String[] args) {

		byte b = 75;
		double d = b; //implicitly
		System.out.println("byte to double is: "+d);
		
		int i = (int)d; //explicitly
		System.out.println("double to int is: "+i);
	}

}
