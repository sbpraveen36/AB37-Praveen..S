package assignment1;
class One{
	void o1()
	{
		System.out.println("method o1");
	}
}
class Two extends One{
	void t1()
	{
		System.out.println("method t1");
	}
}
public class Assignment91 extends Two {
	
	public static void main(String[] args) {

		Two t =  new Assignment91();
		t.t1();
		t.o1();	
	}

}
