package autoselenium;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment132 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://grotechminds.com/drag-and-drop/");
		Thread.sleep(3000);
		WebElement src = driver.findElement(By.id("div1"));
		WebElement dst = driver.findElement(By.id("div2"));
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(src, dst).perform();
		Thread.sleep(3000);
		a1.dragAndDrop(dst, src).perform();
		System.out.println("Image drag & drop performed");
	}
}
