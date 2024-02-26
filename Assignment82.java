package assignment1;

public class Assignment82 {

	public static void main(String[] args) {
	
		String s1 ="praveen";
		String output ="";
		System.out.println("Given String is: "+s1);
		for(int i=s1.length()-1; i>=0; i--)
		{
			char reverse = s1.charAt(i);
			output = output+reverse;
		}
		System.out.println();
		System.out.println("Reverse of String is: "+output);
	}

}
