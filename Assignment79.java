package assignment1;

public class Assignment79 {

	public static void main(String[] args) {

		String 	str1 = "hello123";
		
		char c1[] = str1.toCharArray();
		
		for(int i=0; i<str1.length(); i++)
		{
			if(Character.isDigit(c1[i]))
			{
				System.out.println(c1[i]+": is a digit");
			}
			else 
			{
				System.out.println(c1[i]+": is a char");
			}
			
		}
		
	}

}
