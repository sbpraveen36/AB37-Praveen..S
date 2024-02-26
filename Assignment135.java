package autoselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment135 {

	public static void main(String[] args) throws InterruptedException {

	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.goibibo.com/flights/air-BLR-DEL-20240206--1-0-0-E-D/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only%20Goibibo&utm_term=!SEM!DF!G!Brand!RSA!108599293!6504095653!617695092667!e!goibibo!c!&gad_source=1&gclid=EAIaIQobChMIiMnBidKUhAMVIhCDAx1vBQUPEAAYASAAEgKMa_D_BwE");
	Thread.sleep(2000);
	WebElement from = driver.findElement(By.name("autosuggest"));
	from.sendKeys("Bangalore");

	Thread.sleep(2000);
	WebElement first_option = driver.findElement(By.xpath("(//div[@class='search-widget-autosuggeststyles__SuggestEleDesc-sc-d4g22y-7 hryPxR'])[1]"));
	first_option.click();
	
	Thread.sleep(2000);
	
	WebElement to = driver.findElement(By.id("downshift-2-input"));
	to.sendKeys("Delhi");
	
	Thread.sleep(2000);
	WebElement first_option1 = driver.findElement(By.xpath("(//div[@class='search-widget-autosuggeststyles__SuggstEleHd-sc-d4g22y-4 fBSVbN'])[1]"));
	first_option1.click();
	
	WebElement search = driver.findElement(By.xpath("(//button)[1]"));
	search.click();
	
	}

}
