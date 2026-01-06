package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonFindMobilePrice {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Search for phone and hit ENTER
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones", Keys.ENTER);
		
		//Get the webElements of all phone price and store in a list
		List<WebElement> mobilePriceWebElement = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		//Empty list
		List<Integer> list = new ArrayList<Integer>();
		
		//for each loop for iterating
		
		for (WebElement each : mobilePriceWebElement) {
			String mobilePrice = each.getText(); //get text from each WebElement
			String replaceAll = mobilePrice.replace(",", ""); //replace , with ""
			if(!replaceAll.isEmpty()) {
			int convertToInt = Integer.parseInt(replaceAll); 
			list.add(convertToInt);
			}		
		}
		// Before sort
		System.out.println("Phone prices are: " +list);
		Collections.sort(list);
		System.out.println("Sorted phone prices are: " +list);
		
	}
}