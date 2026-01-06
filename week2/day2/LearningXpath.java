package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningXpath {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//attribute based xpath
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("testleaf.2023@gmail.com");
		
		//attribute based xpath
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Tuna@321");
		
		//partial attribute based xpath
		driver.findElement(By.xpath("//button[contains(@class,'selected')]")).click();
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		String test = "TEST";
		test.length();
	}

}
