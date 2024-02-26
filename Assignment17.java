package assignment;

public class Assignment17 {
	{
		System.out.println("This is IIB");
	}
	Assignment17()
	{
		System.out.println("Constructor-1");
	}
	Assignment17(int a)
	{
		System.out.println("Constructor-2");
	}
	Assignment17(int a, int b)
	{
		System.out.println("Constructor-3");
	}
	Assignment17(int a, double b)
	{
		System.out.println("Constructor-4");
	}
	public static void main(String[] args) {
		new Assignment17();
		new Assignment17(55);
		new Assignment17(35, 49);
		new Assignment17(49, 83.5);
	}
}
