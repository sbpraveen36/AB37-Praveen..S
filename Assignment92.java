package assignment1;
class UpcastingOne
{
	void up1() {
		System.out.println("method up1");
	}
}
class UpcastingTwo extends UpcastingOne
{
	void up2() {
		System.out.println("method up2");
	}
}
class UpcastingThree extends UpcastingTwo
{
	void up3() {
		System.out.println("method up3");
	}
}
public class Assignment92 extends UpcastingThree {

	public static void main(String[] args) {
	UpcastingTwo u1 = new UpcastingThree();
	u1.up2();
	u1.up1();
	
	
	}

}
