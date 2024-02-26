package autoselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment117 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\praveen\\Desktop\\learningHTML1.html");
		driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("praveen123");
		driver.findElement(By.xpath("(/html/body/input)[2]")).sendKeys("my name");
		driver.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("password@123");
		driver.findElement(By.xpath("(/html/body/form/input)[1]")).sendKeys("praveen");
		//driver.findElement(By.xpath("(/html/body/form/input)[3]")).click();
		driver.findElement(By.xpath("(/html/body/form/input)[4]")).click();
		driver.findElement(By.xpath("(/html/body/form/input)[5]")).click();
		driver.findElement(By.xpath("(/html/body/form/input)[6]")).click();
		//driver.findElement(By.xpath("(/html/body/form/input)[7]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(/html/body/input)[4]")).click();
		driver.findElement(By.xpath("(/html/body/input)[5]")).click();
		driver.findElement(By.xpath("(/html/body/input)[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Click to know about us")).click();
		System.out.println("Assignment completed");
		
	}

}
