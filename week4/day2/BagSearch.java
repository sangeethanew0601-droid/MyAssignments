package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BagSearch {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.className("desktop-searchBar")).click();
		driver.findElement(By.className("desktop-searchBar")).sendKeys("bags", Keys.ENTER);
		
		WebElement radioButtonClick = driver.findElement(By.xpath("(//label[@class='common-customRadio gender-label'])[1]"));
		
		Actions action = new Actions(driver);
		action.click(radioButtonClick).perform();
		Thread.sleep(2000);
		
		WebElement checkBoxClick = driver.findElement(By.xpath("//label[text()='Laptop Bag']"));
		action.click(checkBoxClick).perform();
		
		Thread.sleep(2000);
		
		String countOfBagsFound = driver.findElement(By.xpath("//div[@class='title-container']")).getText();
		System.out.println(countOfBagsFound);
		
		 List<WebElement> productsBrand = driver.findElements(By.xpath("//div[@class='product-productMetaInfo']/h3"));
		 System.out.println("Brands: " +productsBrand.size());
	
		 List<WebElement> bagItems = driver.findElements(By.xpath("//h4[@class='product-product']"));
		 System.out.println("Bag items found are: " +bagItems.size());
		 
		 List<String> brands = new ArrayList<String>();
		 List<String> bagNames = new ArrayList<String>();

		 for (WebElement each1 : productsBrand) { 
			 if (each1.isDisplayed()) {  
			        String text1 = each1.getText();
			        String replace1 = text1.replaceAll(",", "");
			        brands.add(replace1);  
			    }
		     }
		 System.out.println("Brand of the products displayed in the page: " +brands);
		 
		 
		 
		 for (WebElement each2 : bagItems) {
			 if(each2.isDisplayed()) {
			 String text2 = each2.getText();
			 String replace2 = text2.replaceAll(",", "");
			 bagNames.add(replace2); 
		     }	
		 }
		 System.out.println("Bag Names displayed: " +bagNames);
		 
}
}
