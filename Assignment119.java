package autoselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment119 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		WebElement catagorydropdown = driver.findElement(By.id("searchDropdownBox"));
		catagorydropdown.click();
		catagorydropdown.sendKeys(Keys.ARROW_DOWN,  Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN,
				Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN,
				Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN);
		Thread.sleep(2000);
		catagorydropdown.click();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("books");
		search.sendKeys(Keys.ENTER);
		System.out.println("Searched for books");
	}
}

