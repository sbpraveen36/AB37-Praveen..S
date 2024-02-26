package assignment;
//Assignment48
class Parent 
{
	static void parentmethod()
	{
		System.out.println("parent method");
	}
}

class Daughter extends Parent
{
	static void daughtermethod()
	{
		System.out.println("daughter method");
	}
}
public class Son extends Parent {
	
	static void sonmethod()
	{
		System.out.println("son method");
	}
	public static void main(String[] args) {
		sonmethod();
		parentmethod();
	}

}
