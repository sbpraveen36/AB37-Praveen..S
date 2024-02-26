package assignment1;
public class Assignment94 {

	public static void main(String[] args) {

	  double pi = (int) Math.PI;
	  double area=0;
	  
	  for(int i=0; i<10; i++)
	  {
		  double ramdom = Math.random();
		 area = pi*ramdom*ramdom;
		 System.out.println("Area of Circle is: "+area);	  
	  }
	
	}
}
