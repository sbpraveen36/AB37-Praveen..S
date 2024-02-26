package assignment;
public class Assignment59 {
	
	public void method1() {
	System.out.println("method1 with public access specifier");
	}
	private void method2() {
	System.out.println("method2 with private access specifier");
	}
	protected void method3() {
	System.out.println("method3 with protected access specifier");	
	}
	void method4() {
	System.out.println("method4 with default access specifier");	
	}
	public static void main(String[] args) {
		
		Assignment59 a1 = new Assignment59();
		a1.method1();
		a1.method2();
		a1.method3();
		a1.method4();
		
	}

}
