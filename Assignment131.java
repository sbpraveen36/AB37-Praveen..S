package autoselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment131 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://flipkart.com");
		Thread.sleep(3000);
		WebElement fashion = driver.findElement(By.xpath("(//*[@class='_1ch8e_'])[3]"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(fashion).perform();
		Thread.sleep(2000);
		WebElement webTShirt = driver.findElement(By.xpath("(//*[@class='_31z7R_']/object/a)[2]"));
		webTShirt.click();
		System.out.println("Clicked on Men's T Shirt");
		
	}

}



