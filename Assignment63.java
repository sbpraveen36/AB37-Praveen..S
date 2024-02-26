package assignment1;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment63 {
	
	public static void main(String[] args) {

		int array1[] = new int[5];
		for(int i=0; i<5; i++) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value of Array index: "+i);
		array1[i]= s1.nextInt();
		
		}
		
		System.out.println("array[5]:");
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		System.out.println(array1[3]);
		System.out.println(array1[4]);
		
	}
}
