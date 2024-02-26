package autoselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment124 {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/x-path/#1");
		Thread.sleep(2000);
		WebElement product = driver.findElement(By.xpath("(//nav[@class='tree-nav default'])/ul/li/span"));
		product.click();
		Thread.sleep(2000);
		WebElement mobiles = driver.findElement(By.xpath("((//nav[@class='tree-nav default'])/ul/li/ul/li)[2]/span"));
		mobiles.click();
		System.out.println("clicked no mobiles");
		
		Thread.sleep(1000);
		WebElement cloths = driver.findElement(By.xpath("((//*[@class='sub-items'])[1]/li)[3]/span"));
		cloths.click();
		System.out.println("clicked no cloths");
		
		Thread.sleep(2000);
		WebElement chocolates = driver.findElement(By.xpath("((//*[@class='sub-items'])[1]/li)[4]/span"));
		chocolates.click();
		System.out.println("clicked no chocolates");	
	}
}
