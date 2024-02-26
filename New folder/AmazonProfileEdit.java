package automatethesewithddt;import java.io.FileInputStream;import java.io.IOException;import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell; import org.apache.poi.ss.usermodel.Row;import org.apache.poi.ss.usermodel.Sheet;import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.edge.EdgeDriver;import org.openqa.selenium.interactions.Actions;

public class AmazonProfileEdit {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream f1 = new FileInputStream("C:\\Users\\praveen\\eclipse-workspace\\automationselenium\\Excellsheet\\aryan1.xlsx");
		Workbook wb = WorkbookFactory.create(f1);
		Sheet s1 = wb.getSheet("login");
		String id = NumberToTextConverter.toText(wb.getSheet("login").getRow(0).getCell(0).getNumericCellValue());
		Row r2 = s1.getRow(1);
		Cell c2 = r2.getCell(0);
		String pwd = c2.getStringCellValue();
		EdgeDriver driver = new EdgeDriver();
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
		System.out.println("Amazon login successful");
		Thread.sleep(10000);
		WebElement hoverover1 = driver.findElement(By.xpath("((//div[@id='nav-tools'])/a)[2]"));
		Actions a2 = new Actions(driver);
		a2.moveToElement(hoverover1).perform();
		Thread.sleep(3000);
		WebElement manage_profile = driver.findElement(By.xpath("//span[@class='sc-ksBlkl sc-jRwbcX fedVjG fqsXfW']"));
		manage_profile.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='a-popover-inner']/div/button/div)[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("radix-1")).click();
		driver.findElement(By.xpath("//button[@class='attribute-action']")).click();
		driver.findElement(By.xpath("(//span[@class='a-button-inner'])[12]")).click();
		System.out.println("Amazon profile successfully edited");		
	}
}
