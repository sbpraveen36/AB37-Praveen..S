package assignment1;

public class Assignment80 {

	public static void main(String[] args) {

		String s1 = "charlie123";
		char c1[] = s1.toCharArray();
		
		for(int i=0; i<s1.length(); i++)
		{
		boolean b1 = Character.isDigit(c1[i]);
			
		if(b1==true)
		{
			System.out.println(c1[i]+ ": numeric is present at index - "+i);
		}
	}
		
  }

}
