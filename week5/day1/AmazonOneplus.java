package week5.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonOneplus {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro", Keys.ENTER);
		
		String priceSym = driver.findElement(By.xpath("(//span[@class='a-price-symbol'])[1]")).getText();
		String productPrice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText().replace(",", "");
		System.out.println("Price: " +priceSym+ "" +productPrice);
		
		String customerRating = driver.findElement(By.xpath("(//span[@class='a-size-small a-color-base'])[1]")).getText();
		System.out.println("Customer rating for the first displayed product: " +customerRating);
		
		WebElement mobile = driver.findElement(By.xpath("(//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal'])[1]"));
		Actions a = new Actions(driver);
		a.click(mobile).perform();
		
		List<String> list = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(list.get(1));
		
		WebElement image = driver.findElement(By.xpath("//img[@id='landingImage']"));
		File source = image.getScreenshotAs(OutputType.FILE);
		File destination = new File("./snapshot/mobImg.png");
		FileUtils.copyFile(source, destination);
		
		WebElement addToCart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		a.click(addToCart).perform();
		
		String cartTotal = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText().replace(",", "");
		System.out.println("Cart subtotal: " +cartTotal);
		
		int p = Integer.parseInt(productPrice);
		int c = Integer.parseInt(cartTotal);

		if(p == c) {
		    System.out.println("Price is matching in the cart subtotal! Test Passed");
		} else {
		    System.out.println("Price mismatch! Test Failed");
		}

		driver.quit();
	}
}