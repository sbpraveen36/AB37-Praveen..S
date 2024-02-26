package assignment1;

public class Assignment106 {

	int method1(int a, int b)
	{
		int sum= a+b;
		
		return sum;
	}
	
	double method2(double a, double b)
	{
		double sub = a-b;
		
		return sub;
		
	}
	public static void main(String[] args) {
		
		Assignment106 a1 = new Assignment106();
		System.out.println("Method1 return type int: "+ a1.method1(10, 15));
		System.out.println("Method2 return type double: "+a1.method2(30.5, 22.0));
		
	}
}



