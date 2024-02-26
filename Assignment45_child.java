package assignment;

	class Assignment45_parent
	{
		 void selenium() 
		{
			System.out.println("selenium");
		}
		
		void java()
		{
			System.out.println("java");
		}
	}
public class Assignment45_child extends Assignment45_parent {

		void gk()
		{
			System.out.println("general knowledge");
		}
	public static void main(String[] args) {
		
		Assignment45_child a1 = new Assignment45_child();
		a1.gk();
		a1.selenium();
		a1.java();
	}

}
