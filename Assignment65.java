package assignment1;
import java.util.Arrays;
public class Assignment65 {

	public static void main(String[] args) {
		int idno[] = new int[4];
		idno[0] = 121;
		idno[1] = 122;
		idno[2] = 123;
		idno[3] = 124;
		System.out.println("1st array idno[] is: "+Arrays.toString(idno));
		int idno2[] = new int[4];
		
		for(int i=0; i<idno.length; i++)
		{
			idno2[i]=idno[i];
		}
		System.out.println("After copying values of array one to array two, 2nd array idno2[] is: "+Arrays.toString(idno2));
	}

}
