package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class SalesforceAss1 {
    
	@Test
	@Parameters({"URL","Username","Password","Legal Entity Name"})
	public void createLegalEntity(String url, String UName, String Pd, String le) {

		ChromeDriver driver;
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--user-data-dir=C:\\SeleniumProfile");

		driver = new ChromeDriver(options);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(UName);
		driver.findElement(By.xpath("//input[@name='pw']")).sendKeys(Pd);
		driver.findElement(By.xpath("//label[text()='Remember me']")).click();
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		WebElement appLauncher = driver.findElement(By.xpath("//span[text()='App Launcher']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", appLauncher);
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys("Legal Entities", Keys.ENTER);
		driver.findElement(By.xpath("//mark[text()='Legal Entities']")).click();
		driver.findElement(By.xpath("//div[@title='New']")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(le);
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("(//textarea[@part='textarea'])[2]")).sendKeys("Salesforce");
		
		// Locate the combobox button
		WebElement statusDropdown = driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value']"));

		// Click using JavaScript
		js.executeScript("arguments[0].click();", statusDropdown);

		// Locate the 'Active' option
		WebElement activeOption = driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Active']"));
		js.executeScript("arguments[0].click();", activeOption);
 
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		String text = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		System.out.println(text);
		if(text.contains(le)) {
			System.out.println("Legal Entity created!!");
		}
		else {
			System.out.println("Test failed");
		}
		driver.quit();
	}

}