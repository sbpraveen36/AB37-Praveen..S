package assignment1;
import java.util.Scanner;
public class Assignment107 {

	float fmethod(float a, float b)
	{
		float sum = a+b;
		return sum;
	}
	double dmethod(double a, double b)
	{
		double sum=a+b;
		return sum;
	}
	String smethod(String a)
	{
		String s = "praveen";
		return s;
	}
	boolean bmethod(boolean c)
	{
		boolean b = false;
		return b;
	}
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter two float values");
		float fa=s1.nextFloat();
		float fb=s1.nextFloat();
		System.out.println("Enter two double values");
		double da = s1.nextDouble();
		double db = s1.nextDouble();
		System.out.println("Enter String value");
		String s = s1.next();
		System.out.println("Enter boolean value");
		boolean bb = s1.nextBoolean();
		
		Assignment107 a1 = new Assignment107();
		System.out.println("return type float: "+a1.fmethod(fa, fb));
		System.out.println("return type double: "+a1.dmethod(da, db));
		System.out.println("return type String: "+a1.smethod(s));
		System.out.println("return type boolean: "+a1.bmethod(true));
				
	}
}


