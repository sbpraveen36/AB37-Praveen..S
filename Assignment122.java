package autoselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment122 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		driver.findElement(By.id("fname")).sendKeys("Manish Kumar Tiwari");
		driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
		
		System.out.println("done");
	}

}
