package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("democsr2");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TESTLEAF!");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("FirstNameTest");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("LastNameTest");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("FirstNameLocalTest");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("DepartmentTest");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("DescriptionTest");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test12@gmail.com");
		
		WebElement stateOrProvince = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select se1 = new Select(stateOrProvince);
		se1.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		  
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("ImportantNoteFieldTest");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println("Edit Lead done: " +driver.getTitle()); 
		driver.close();
		 
		
	}

}
