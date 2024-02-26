package assignment;
import java.util.Scanner;

public class Assignment39 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int age  = s.nextInt();
		
		if (age >=18) 
		{
			System.out.println("i am adult");
		}
		else
		{
			System.out.println("i am young");
		}
	}

}
