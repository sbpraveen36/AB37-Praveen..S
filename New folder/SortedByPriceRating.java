package automatethesewithddt;import java.io.FileInputStream;import java.io.IOException;import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell; import org.apache.poi.ss.usermodel.Row;import org.apache.poi.ss.usermodel.Sheet;import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.edge.EdgeDriver;import org.openqa.selenium.interactions.Actions;

public class SortedByPriceRating {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream f1 = new FileInputStream("C:\\Users\\praveen\\eclipse-workspace\\automationselenium\\Excellsheet\\aryan.xlsx");
		Workbook wb = WorkbookFactory.create(f1);
		Sheet s1 = wb.getSheet("login");
		String id = NumberToTextConverter.toText(wb.getSheet("login").getRow(0).getCell(0).getNumericCellValue());
		Row r2 = s1.getRow(1);
		Cell c2 = r2.getCell(0);
		String pwd = c2.getStringCellValue();
		Row r3 = s1.getRow(2);
		Cell c3 = r3.getCell(0);
		String product = c3.getStringCellValue();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement hoverover = driver.findElement(By.id("nav-link-accountList"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(hoverover).perform();
		driver.findElement(By.linkText("Sign in")).click();
		WebElement phone_number = driver.findElement(By.id("ap_email"));
		phone_number.sendKeys(id);
		WebElement continu = driver.findElement(By.id("continue"));
		continu.click();
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys(pwd);
		WebElement signin = driver.findElement(By.id("signInSubmit"));
		signin.click();
		WebElement searchbar = driver.findElement(By.id("twotabsearchtextbox"));
		searchbar.sendKeys(product);
		searchbar.sendKeys(Keys.ENTER);	
		Thread.sleep(2000);
		WebElement rating = driver.findElement(By.xpath("//section/i[@class='a-icon a-icon-star-medium a-star-medium-4']"));
		rating.click();
		
		
		
		
	}
}


