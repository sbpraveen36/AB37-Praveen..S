package assignment1;

public class Assignment74 {

	public static void main(String[] args) {

		String str= "GroTechMinds";
		String a= str.replaceAll("[a-z]", "");
		String b= str.replaceAll("[A-Z]","");
		
		System.out.println("Output-1: "+a);
		System.out.println("Output-2: "+b);
	}

}
