package autoselenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment133 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://grotechminds.com/registration/");
		Thread.sleep(5000);
		WebElement dd = driver.findElement(By.xpath("(//div[@id='skillsDropdown'])[1]"));
		Select s1 = new Select(dd);
		List <WebElement> count =s1.getOptions();
		int options = count.size(); 
		for(int i=0; i<options; i++)
		{
			String dropdown = count.get(i).getText();
			System.out.println(dropdown);
			
		}
		
		
	}

}
