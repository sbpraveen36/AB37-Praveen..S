package autoselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment112 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		WebElement userid = driver.findElement(By.id("email"));
		userid.sendKeys("praveenp936@gmail.com");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("Praveenp@936");
		WebElement login_button=driver.findElement(By.id("loginbutton"));
		login_button.click();
		System.out.println("Successfully logged into facebook ");
		
	}
}



