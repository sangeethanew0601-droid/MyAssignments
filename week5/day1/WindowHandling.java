package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("democsr2");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("(//table[@class='twoColumnForm']/tbody/tr/td[2]/a)[1]")).click();
		
		String parentWindow = driver.getWindowHandle();
		
		List<String> list = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(list.get(1));
		
		driver.findElement(By.linkText("DemoCustomer")).click();
	
		driver.switchTo().window(parentWindow);
		
		driver.findElement(By.xpath("(//table[@class='twoColumnForm']/tbody/tr/td[2]/a)[2]")).click();
		
		List<String> list1 = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(list1.get(1));
	
		driver.findElement(By.linkText("DemoLBCust")).click();
		
		driver.switchTo().window(parentWindow);
		
		driver.findElement(By.linkText("Merge")).click();
		
		driver.switchTo().alert().accept();
		
		System.out.println(driver.getTitle());
	}
}
