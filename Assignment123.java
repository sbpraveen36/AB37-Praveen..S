package autoselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Assignment123 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		
		WebElement skills = driver.findElement(By.id("Skills"));
		Select s1 = new Select(skills);
		s1.selectByIndex(1);
		System.out.println("skills dropdown selected");
		Thread.sleep(2000);
		
		WebElement skills1 = driver.findElement(By.id("technicalskills"));
		Select s4 = new Select(skills1);
		s4.selectByIndex(0);
		System.out.println("technical skills dropdown selected");
		
		WebElement country = driver.findElement(By.id("Country"));
		Select s2 = new Select(country);
		s2.selectByVisibleText("India");
		System.out.println("country dropdown selected");
		
		WebElement relegion = driver.findElement(By.id("Relegion"));
		Select s3 = new Select(relegion);
		s3.selectByVisibleText("Hindu");
		System.out.println("relegion dropdown selected");
	}
}



