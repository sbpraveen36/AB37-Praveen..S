package autoselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment125 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\praveen\\Desktop\\learningHTML1.html");
		driver.findElement(By.name("lname")).sendKeys("abcd");
		System.out.println("Clicked in disabled component");
		
	}
	
}


