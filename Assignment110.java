package autoselenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment110 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		System.out.println("Launched google");
		
	}

}



