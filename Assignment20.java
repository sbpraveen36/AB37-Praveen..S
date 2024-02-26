package assignment;

public class Assignment20 {

	static int a;
	static int b;
	
	static void add()
	{
		a = 15;
		b = 20;
		int sum = a+b;
		System.out.println("sum of a & b is - "+ sum);
	}
	
	static void subtract()
	{
		a = 13;
		b = 10;
		int subtract = a-b;
		System.out.println("subtract of a & b is - "+ subtract);	
	}
	public static void main(String[] args) {
		
		add();
		subtract();
	}

}
