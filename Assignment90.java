package assignment1;
class ClassOne
{
	void m1()
	{
		System.out.println("method m1");
	}
}

class ClassTwo extends ClassOne
{
	void m2()
	{
		System.out.println("method m2");
	}
}
public class Assignment90 extends ClassTwo{
	public static void main(String[] args) {
		ClassOne c1 = new Assignment90(); //upcasting
				 c1.m1();
	}
}
