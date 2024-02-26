package assignment;

public class Assignmt11 {

		static void m1(int a) {
			System.out.println("This is int");
		}
		static void m1(double a) {
			System.out.println("This is double");
		}
		static void m1(char a) {
			System.out.println("This is char");
		}
		void m1(boolean a) {
			System.out.println("This is boolean");
		}
		void m1(String a) {
			System.out.println("This is String");
		}
	public static void main(String[] args) {
		
		m1(100);
		m1(10.5);
		m1('m');
		Assignmt11 a3 = new Assignmt11();
		a3.m1(true);
		a3.m1("non_static_method");	
	}
}
