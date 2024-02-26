package assignment1;

import java.util.Arrays;

public class Assignment64 {

	public static void main(String[] args) {

		String str[] = new String[3];
		str[0] = "praveen";
		str[1] = "gtm";
		str[2] = "manish";
		
		System.out.println("array without sorting");
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println();
		Arrays.sort(str);
		System.out.println("array after sorting");
		System.out.println(Arrays.toString(str));
		
	}

}
