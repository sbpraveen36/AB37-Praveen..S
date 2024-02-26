package assignment;

interface Interfacefour {
	abstract void intseven();
	abstract void inteight();
}
interface Interfacethree extends Interfacefour{
	abstract void intfive();
	abstract void intsix();
}

interface Interfaceone extends Interfacetwo{
	abstract void intone();
	abstract void inttwo();
}
interface Interfacetwo extends Interfacethree{
	abstract void intthree();
	abstract void intfour();
}
public class Assignment55_Child_Class implements Interfaceone {
	public static void main(String[] args) {
		Assignment55_Child_Class c1 = new Assignment55_Child_Class();
		c1.intone();
		c1.inttwo();
		c1.intthree();
		c1.intfour();	
		c1.intfive();
		c1.intsix();
		c1.intseven();
		c1.inteight();
	}
	public void intone() {
		System.out.println("method intone");
	}
	public void inttwo() {
		System.out.println("method inttwo");
	}
	public void intthree() {
		System.out.println("method intthree");
	}
	public void intfour() {
		System.out.println("method intfour");
	}
	public void intfive() {
		System.out.println("method intfive");
	}
	public void intsix() {
		System.out.println("method intsix");
	}
	public void intseven() {
		System.out.println("method intseven");
	}
	public void inteight() {
		System.out.println("method inteight");
	}
}
