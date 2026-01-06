package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFrameAndAlertInteractions {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Switch to iframe by frame id
		driver.switchTo().frame("iframeResult");
		
		// Locating web element and click
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//Accept the alert
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Activity for Frames and Alert together");
		alert.accept();
		WebElement element = driver.findElement(By.xpath("//p[@id='demo']"));
		String enteredName = element.getText();
		System.out.println(enteredName);
		
		//Comparing the text
		
		if (enteredName.contains("Activity for Frames and Alert together")) {
		System.out.println("Test Passed!!"); 
		  }
		  
		else {
		System.out.println("Test Failed"); 
		  }
	}
}