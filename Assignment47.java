package assignment;
 class class1
 {
	 void method1()
	 {
		System.out.println("method 1"); 
	 }
 }
 
class class2 extends class1
{
	void method2()
	{
		System.out.println("method 2");
	}
}
public class Assignment47 extends class2 {
	
	void method3()
	{
		System.out.println("method 3");
	}
	public static void main(String[] args) {
		
		Assignment47 a1 = new Assignment47();
		a1.method3();
		a1.method1();
		a1.method2();
	}
}
