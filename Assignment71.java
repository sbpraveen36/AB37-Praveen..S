package assignment1;
import java.util.Date;
public class Assignment71 {
	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1.getTime());
		Date d2 = new Date(d1.getTime());
		String str= d2.toString();
		System.out.println(str);
		String day = str.substring(0, 3);
		System.out.println("day: "+day);
		String date = str.substring(8, 10);
		System.out.println("date: "+date);
		String mth = str.substring(4, 7);
		System.out.println("month: "+mth);
		String year = str.substring(24, 28);
		System.out.println("year: "+year);
		
	}
}
