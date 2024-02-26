package assignment;

interface interface1{
	abstract void interface1method();
}

interface interface2{
	abstract void interface2method();
}

public class Assignment54_Child_Class implements interface1, interface2 
{
	public static void main(String[] args) {

		Assignment54_Child_Class c1 = new Assignment54_Child_Class();
		c1.interface1method();
		c1.interface2method();
	}
	public void interface2method() {

		System.out.println("interface2method");
	}
	public void interface1method() {

		System.out.println("interface1method");
	}

}
