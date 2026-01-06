package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LeaftapsApplication {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test Firstname");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Test Lastname");
		
		WebElement SourceDD = driver.findElement(By.name("dataSourceId"));
		Select sel = new Select(SourceDD);
		sel.selectByIndex(4);
		
		WebElement MarketingCampaignDD = driver.findElement(By.name("marketingCampaignId"));
		Select sel1 = new Select(MarketingCampaignDD);
		sel1.selectByVisibleText("Automobile");
		
		WebElement OwnershipDD = driver.findElement(By.name("ownershipEnumId"));
		Select sel2 = new Select(OwnershipDD);
		sel2.selectByValue("OWN_CCORP");
		
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());

	}

}
