package autoselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment113 {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid."
				+ "return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%"
				+ "2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_deskto"
				+ "p_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.op"
				+ "enid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		Thread.sleep(5000);
		WebElement userid = driver.findElement(By.id("ap_email"));
		userid.sendKeys("7892174611");
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("M@210397");
		WebElement signin_button = driver.findElement(By.id("signInSubmit"));
		signin_button.click();
		System.out.println("Sign in to Amazon successfully");
	}
}

