package assignment1;

public class Assignment66 {

	public static void main(String[] args) {

		int num[]= new int[4];
		num[0]= 231;
		num[1]= 123;
		num[2]= 312;
		num[3]= 153;
		int sum=0;
		
		for(int i=0; i<num.length; i++)
		{
			 sum = sum+num[i];	
		}
		double average = sum/num.length;
		double reminder = sum%num.length;
		System.out.println("Average of numbers: "+average);
		System.out.println("Reminder of numbers: "+reminder);
	}

}
