package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("democsr2");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("firstname test");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("lastname test");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("companyname");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("title");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("Page title is: " +driver.getTitle());
		driver.close();
	}
}
