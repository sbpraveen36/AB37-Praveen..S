package assignment1;
import java.util.Arrays;
public class Assignment84 {
	public static void main(String[] args) {
		String str1 = "heart";
		String str2 = "earth";
		if(str1.length()!=str2.length())
		{
			System.out.println("Given two strings are not an anagram");
		}
		else
		{
			char[] c1 = str1.toCharArray();
			Arrays.sort(c1);
			System.out.println(c1);
			char[] c2 = str2.toCharArray();
			Arrays.sort(c2);
			System.out.println(c2);
		if(Arrays.equals(c1, c2)==true)
		{
			System.out.println("Given two strings are anagram");
		}
		else
		{
			System.out.println("Given two strings are not anagram");	
		}		
		}
	}
}