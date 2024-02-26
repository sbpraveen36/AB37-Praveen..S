package assignment;
abstract class Abstract_class
{
	abstract void multiplication();
	abstract void division();
}
public class Assignment50 extends Abstract_class {

	static void add()
	{
		System.out.println("static concrete method add");
	}
	void sub()
	{
		System.out.println("non-static concrete method sub");
	}
	public static void main(String[] args) {
		Assignment50 a1 = new Assignment50();
		add();
		a1.sub();
		a1.multiplication();
		a1.division();
	}
	void multiplication() {
		System.out.println("multiplication method");	
	}
	void division() {
		System.out.println("division method");
	}
}
