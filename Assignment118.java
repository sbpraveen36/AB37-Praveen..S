package autoselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment118 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		WebElement userid = driver.findElement(By.id("email"));
		userid.sendKeys("praveenp936@gmail.com");
		userid.sendKeys(Keys.CONTROL+"a");
		userid.sendKeys(Keys.CONTROL+"c");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys(Keys.CONTROL+"v");
		System.out.println("Assignment done");	
	}
}
