package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public ChromeDriver driver;
	
	@BeforeMethod
	@Parameters({"URL","Username","Password"})
	public void preSetUp(String url, String UName, String Pd) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--user-data-dir=C:\\SeleniumProfile");

		driver = new ChromeDriver(options);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(UName);
		driver.findElement(By.xpath("//input[@name='pw']")).sendKeys(Pd);
		driver.findElement(By.xpath("//label[text()='Remember me']")).click();
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
}
	@AfterMethod
	public void postSetUp() {
		driver.quit();
	}
	}
