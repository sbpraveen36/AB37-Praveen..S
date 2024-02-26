package autoselenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment134 {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_"
				+ "to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%"
				+ "3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle="
				+ "inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid."
				+ "net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2"
				+ "Fauth%2F2.0");
		Thread.sleep(6000);
		/*WebElement hoverover = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(hoverover);
		WebElement signin = driver.findElement(By.xpath("(//*[@id='nav-flyout-ya-signin'])/a"));
		signin.click();
		*/
		WebElement username = driver.findElement(By.id("ap_email"));
		username.sendKeys("7892174611");
		WebElement continue_button = driver.findElement(By.id("continue"));
		continue_button.click();
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("Madhu@210397");
		WebElement signin_click = driver.findElement(By.id("signInSubmit"));
		signin_click.click();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("pen");
		WebElement product = driver.findElement(By.id("nav-search-submit-button"));
		product.click();
		WebElement select_pen = driver.findElement(By.xpath("(//*[@class='a-size-base-plus a-color-base a-text-normal'])[1]"));
		select_pen.click();
		Set <String> multiwindow = driver.getWindowHandles();
		Iterator <String> window_id = multiwindow.iterator();
		String penrent_window = window_id.next();
		String child_window = window_id.next();
		driver.switchTo().window(child_window);
		WebElement add_cart = driver.findElement(By.id("add-to-cart-button"));
		add_cart.click();
		WebElement proceed_buy = driver.findElement(By.name("proceedToRetailCheckout"));
		proceed_buy.click();
		WebElement address = driver.findElement(By.xpath("(//*[@class='a-button-input'])[6]"));
		address.click();
		Thread.sleep(2000);
		WebElement paymentmethod = driver.findElement(By.xpath("//*[@for='pp-PJ2Ecp-97']"));
		paymentmethod.click();
		Thread.sleep(2000);
		WebElement carddetails = driver.findElement(By.linkText("Enter card details"));
		carddetails.click();
		Thread.sleep(5000);
		WebElement iframe = driver.findElement(By.id("pp-xs9RjP-14"));
		driver.switchTo().frame(iframe);
		WebElement cardnumber = driver.findElement(By.id("pp-xs9RjP-16"));
		cardnumber.sendKeys("123456789012");
		WebElement name = driver.findElement(By.id("pp-xs9RjP-18"));
		name.clear();
		name.sendKeys("Praveen S");
		WebElement expdate = driver.findElement(By.id("pp-xs9RjP-22"));
		Select s1 = new Select(expdate);
		s1.selectByIndex(5);
		WebElement expyear = driver.findElement(By.id("pp-xs9RjP-23"));
		Select s2 = new Select(expyear);
		s2.selectByValue("2026");
		WebElement enter = driver.findElement(By.name("ppw-widgetEvent:AddCreditCardEvent"));
		enter.click();
		
		
		
	}

}
