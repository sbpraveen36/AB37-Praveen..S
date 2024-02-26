package assignment;
interface One{
	
	abstract void int_method1();
}
interface Two{
	
	abstract void int_method2();
}
abstract class Ab_class implements One, Two {
	abstract void ab_method();
}
public class Assignment56_Child extends Ab_class {
	public static void main(String[] args) {
		Assignment56_Child c56 = new Assignment56_Child();
		c56.ab_method();
		c56.int_method1();
		c56.int_method2();
	}
	void ab_method() {
		System.out.println("ab_method");
	}
	public void int_method1() {
		System.out.println("int_method1");
	}
	public void int_method2() {
		System.out.println("int_method2");
	}

}
