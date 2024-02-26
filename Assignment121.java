package autoselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment121 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement first_name= driver.findElement(By.xpath("//input[@id='fname']"));
		first_name.sendKeys("praveen");
		
		WebElement last_name = driver.findElement(By.id("lname"));
		last_name.sendKeys("S");
		WebElement username = driver.findElement(By.id("Username"));
		username.sendKeys("praveen@123");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("password123");
		WebElement who_r_u_Male = driver.findElement(By.id("Male"));
		who_r_u_Male.click();
		WebElement who_r_u_FeMale = driver.findElement(By.id("FeMale"));
		who_r_u_FeMale.click();
		WebElement present_address = driver.findElement(By.id("w3review"));
		present_address.sendKeys("Bangalore, Karnataka");
		WebElement permanent_address = driver.findElement(By.id("Address"));
		permanent_address.sendKeys("Bangalore, Karnataka");
		WebElement pincode = driver.findElement(By.id("Pincode"));
		pincode.sendKeys("560100");
		WebElement submit = driver.findElement(By.xpath("(//*[@value='Submit'])[2]"));
		submit.click();
		WebElement agree = driver.findElement(By.id("Agree"));
		agree.click();
		System.out.println("Assignment done");
	}
}


