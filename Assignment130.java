package autoselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment130 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		WebElement click_on_login = driver.findElement(By.xpath("(//a[.='CONTINUE TO LOGIN'])[1]"));
		click_on_login.click();
		WebElement username = driver.findElement(By.name("userName"));
		username.sendKeys("praveen123");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("aryan@123");
		WebElement captcha = driver.findElement(By.name("loginCaptchaValue"));
		captcha.sendKeys("wfGrFs");
		System.out.println("SBI login page element inspected");	
	}

}





