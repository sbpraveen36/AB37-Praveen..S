package assignment1;
import java.util.Arrays;

public class Assignment75 {

	public static void main(String[] args) {

		int num[]= new int[4];
		num[0]=40;
		num[1]=41;
		num[2]=35;
		num[3]=44;
		System.out.println(Arrays.toString(num));
		for(int i=0; i<4; i++)
		{
			if(41==num[i])
			{
				System.out.println("number 41 present in an array- num[]");
			}		
		}
	}
}
