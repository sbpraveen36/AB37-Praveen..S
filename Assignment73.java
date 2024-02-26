package assignment1;

public class Assignment73 {

	public static void main(String[] args) {

		String name = "My Name Is Praveen";
		
		String name_capital= name.replaceAll("[a-z]", "");
		System.out.println("Only capital letters: "+name_capital);
		System.out.println("After removing empty space: "+name_capital.replaceAll(" ",""));
	}

}
