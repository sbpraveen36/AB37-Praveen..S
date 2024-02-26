package autoselenium;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment128 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https:/amazon.in");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoes");
		WebElement search_click = driver.findElement(By.id("nav-search-submit-button"));
		search_click.click();
		WebElement shoe = driver.findElement(By.xpath("(//*[@class='a-carousel-card'])[2]"));
		shoe.click();
		//String parentid = driver.getWindowHandle();
		Set <String> parentandchildid = driver.getWindowHandles();
		Iterator <String> pcid = parentandchildid.iterator();
		String parentid = pcid.next();
		String childid = pcid.next();
		System.out.println(parentid);
		System.out.println(childid);
		driver.switchTo().window(childid);
		WebElement add_to_cart = driver.findElement(By.id("add-to-cart-button"));
		add_to_cart.click();
		System.out.println("30th Shoe added to cart");
	}
}
