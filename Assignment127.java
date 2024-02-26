package autoselenium;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment127 {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://flipkart.com");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("books");
		Thread.sleep(4000);
		WebElement second_option = driver.findElement(By.xpath("(//*[@class='_1sFryS _2x2Mmc _3ofZy1']/li)[2]"));
		second_option.click();
		System.out.println("Books 2nd option selected");	
	}
}


