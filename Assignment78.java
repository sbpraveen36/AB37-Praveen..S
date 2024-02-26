package assignment1;

import java.util.Arrays;

public class Assignment78 {

	public static void main(String[] args) {

		int num[]= {10, 15, 24, 29};
		int num1[]= {10, 15, 29, 24};
		
		if(Arrays.equals(num, num1))
		{
			System.out.println("Two arrays are equal");
		}
		else
		{
			System.out.println("Two arrays are not equal");
		}
	}
}
