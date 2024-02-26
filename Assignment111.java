package autoselenium;

import java.util.Arrays;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment111 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flipkart.com");
		String title1 = driver.getTitle();
		System.out.println("Title : "+title1);
		String[] title = new String[15];
		title = title1.split(" ");
		for(int i=0; i<title.length; i++)
		{
			System.out.println(title[i]);
		}
		
	}

}



