package assignment;

interface one1 extends two2{
	abstract void m1();
}
interface two2 extends three3{
	abstract void m2();
}
interface three3{
	abstract void m3();
}
public class Assignment58_Child implements one1 {
	public static void main(String[] args) {
		Assignment58_Child a1 = new Assignment58_Child();
		a1.m1();
		a1.m2();
		a1.m3();
	}
	public void m2() {
		System.out.println("method m2");
	}

	public void m3() {
		System.out.println("method m3");
	}

	public void m1() {
		System.out.println("method m1");
	}
}
