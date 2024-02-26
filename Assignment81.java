package assignment1;

public class Assignment81 {

	public static void main(String[] args) {

		String name = "Rahul123";
		
		char character[] = name.toCharArray();
		int j = 0;
		int k = 0;
		 
		for(int i=0; i<name.length(); i++)
		{  boolean b = Character.isDigit(character[i]);
		   
		   if(b==true)
		   {
			j++;   
		   }
		   else
		   {
			 k++;
		   }
		}
		
		System.out.println("number of numeric in given String: "+j);
		System.out.println("number of char in given String: "+k);
	}

}
