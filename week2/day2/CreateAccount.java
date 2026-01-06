package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("democsr2");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.className("inputBox")).sendKeys("Sangeetha Testing 025253");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		WebElement industry = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select sel1 = new Select(industry);
		sel1.selectByVisibleText("Computer Software");
		
		WebElement ownership = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select sel2 = new Select(ownership);
		sel2.selectByVisibleText("S-Corporation");
		
		WebElement source = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select sel3 = new Select(source);
		sel3.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketingCampaign = driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		Select sel4 = new Select(marketingCampaign);
		sel4.selectByIndex(6);
		
		WebElement state = driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
		Select sel5 = new Select(state);
		sel5.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String accName = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		System.out.println("Account created: " +accName);
		driver.close();

	}

}
