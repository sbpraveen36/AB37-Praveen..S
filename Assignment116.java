package autoselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment116 {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String[] lnktext = new String[3];
		lnktext[0] = "Emirates";
		lnktext[1] = "Kingdom";
		lnktext[2] = "States";
		String[] text = new String[3];
		text[0] = "United Arab Emirates";
		text[1] = "United Kingdom";
		text[2] = "United States";
		
		for(int i=0; i<3; i++)
		{
			driver.get("https://amazon.in");
			WebElement place = driver.findElement(By.partialLinkText(lnktext[i]));
			place.click();
			System.out.println("Successfully clicked on- "+text[i]);
				
		}
		System.out.println("Assignment Completed");
	}
}


