package assignment;

interface interface_1 extends interface_2{
	abstract void m2();
}
interface interface_2{
	abstract void m3();
}
abstract class Abstract_class_One implements interface_1{
	abstract void m1();
}
public class Assignment57_Child extends Abstract_class_One{

	public static void main(String[] args) {
		Assignment57_Child a1 = new Assignment57_Child();
		a1.m1();
		a1.m2();
		a1.m3();
	}
	public void m2() {
		System.out.println("method- m2");
	}
	void m1() {
		System.out.println("method- m1");
	}
	public void m3() {
		System.out.println("method- m3");
	}

}
