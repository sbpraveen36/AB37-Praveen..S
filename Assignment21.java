package assignment;

public class Assignment21 {

	int a = 10;
	int b = 15;
	
	static void add()
	{
		Assignment21 a21= new Assignment21();
		int sum = a21.a + a21.b;
		System.out.println("sum of a & b is - " + sum);
	}
	
	static void subtract()
	{
		Assignment21 a21= new Assignment21();
		int subtract = a21.a - a21.b;
		System.out.println("subtraction of a & b is - " + subtract);
	
	}
	
	public static void main(String[] args) {
		
		//Assignment21 a21= new Assignment21();
		add();
		subtract();
	}

}
