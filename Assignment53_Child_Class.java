package assignment;
interface Int1{
	
	abstract void method2();
}
abstract class Abstract_Class1 implements Int1 {
	abstract void abstract_method1();
	static void concrete_method(){

		System.out.println("Concrete method inside abstract class");
	}
}
public class Assignment53_Child_Class extends Abstract_Class1 {

	public static void main(String[] args) {
		Assignment53_Child_Class ac1 = new Assignment53_Child_Class();
		ac1.abstract_method1();
		ac1.concrete_method();
		ac1.method2();	
	}

	void abstract_method1() {
		System.out.println("method1");
		
	}

	public void method2() {
		System.out.println("method2");
	}
}
