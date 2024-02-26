package assignment1;
public class Assignment83 {
	public static void main(String[] args) {

		String s1 = "how";
		String output ="";		
		for (int i=s1.length()-1; i>=0;i--)
		{
			char reverse = s1.charAt(i);
			output = output+reverse;
		}
		if(s1.equals(output))
		{
			System.out.println("Gievn String is a Palindrome");
		}
		else {
			System.out.println("Given String is not a Palindorme");
		}
	}

}