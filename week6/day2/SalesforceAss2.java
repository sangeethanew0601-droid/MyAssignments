package week6.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SalesforceAss2 extends BaseClass {
	
	@Test(dataProvider = "fetchData")
	public void createLegalEntity2(String dyanamicLEName) {
		
		WebElement appLauncher = driver.findElement(By.xpath("//span[text()='App Launcher']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", appLauncher);
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys("Legal Entities", Keys.ENTER);
		driver.findElement(By.xpath("//mark[text()='Legal Entities']")).click();
		driver.findElement(By.xpath("//div[@title='New']")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(dyanamicLEName);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		String text = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		System.out.println("Legal Entity is created: " +text);
		
		if(text.contains(dyanamicLEName)) {
			System.out.println("Legal Entity created!!");
		}
		else {
			System.out.println("Test failed");
		}
}

	@DataProvider(name = "fetchData")
	public String[][] sendData() {
		String[][] legalEntityName = new String[3][1];
		legalEntityName[0][0] = "Salesforce Automation by Sangeetha A";
		legalEntityName[1][0] = "Salesforce Automation by Tester A";
		legalEntityName[2][0] = "Salesforce Automation by Tester B";
		return legalEntityName;
	}
	
}
