package assignment;

public class Asignmt6 {
	
		 void method1(){
			
			System.out.println("It is non static method 1");
		}

		 void method2(){
			
			System.out.println("It is non static method 2");	
		}
		
		 void method3(){
			
			System.out.println("It is non static method 3");
		}
		
		 void method4(){
			
			System.out.println("It is non static method 4");
			
		}
	public static void main(String[] args) {
		System.out.println("Calling non static method");
		Asignmt6 a6 = new Asignmt6();
		a6.method1();
		a6.method2();
		a6.method3();
		a6.method4();
	}
	
}
