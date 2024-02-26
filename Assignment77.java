package assignment1;

import java.util.Arrays;

public class Assignment77 {

	public static void main(String[] args) {

		String str[]= {"praveen", "bangalore", "hello"};
		String name[]= {"bangalore", "praveen", "hello"};
		
		if(Arrays.equals(str, name)) 
		{
			System.out.println("Two arrays are equal");
		}
		else
		{
			System.out.println("Two arrays are not equal");
		}
	}
}
