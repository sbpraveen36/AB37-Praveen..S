package assignment1;

class One1
{
 void m1() {
	 System.out.println("method1");
 }
}
class Two2 extends One1
{
	void m2() {
		 System.out.println("method2");
	 }
}
class Three3 extends Two2
{
	void m3() {
		 System.out.println("method3");
	 }
}

public class Assignment93 extends Three3 {
	void m4() {
		 System.out.println("method4");
	 }
	public static void main(String[] args) {
		
		Two2 t2 = new Three3(); //upcasting
		t2.m1();
		t2.m2();
		Three3 t3 = new Assignment93(); //upcasting
		Assignment93 a3 = (Assignment93) t3; //downcasting
		a3.m1();
		a3.m2();
		a3.m3();
		a3.m4();
	
	}
}
