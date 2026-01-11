package week5.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasket {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions ac = new Actions(driver);
		WebElement shopByCategory = driver.findElement(By.xpath("(//span[text()='Shop by'])[2]"));
		ac.click(shopByCategory).perform();
		
		WebElement foodGrainOil = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		ac.moveToElement(foodGrainOil).perform();
		
		WebElement riceProduct = driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"));
		ac.moveToElement(riceProduct).perform();
		
		WebElement boiledRice = driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']"));
		ac.click(boiledRice).perform();
		
		WebElement bbRoyal = driver.findElement(By.xpath("//input[@id='i-bbRoyal']"));
		ac.click(bbRoyal).perform();
		
		Thread.sleep(2000);
		
		WebElement tamilPonni = driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled Rice']"));
		ac.click(tamilPonni).perform();
		
		List<String> list = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(list.get(1));
		
		Thread.sleep(2000);
		
		WebElement fiveKG = driver.findElement(By.xpath("(//div[@class='flex flex-col items-start justify-start w-full p-2.5'])[1]"));
		ac.click(fiveKG).perform();
		
		Thread.sleep(2000);

		String packPrices = driver.findElement(By.xpath("//table/tr[1]/td[contains(@class,'Description')]")).getText();
		System.out.println("5Kg Ricepack "+packPrices);
		
		Thread.sleep(2000);
		
		WebElement addToBasket = driver.findElement(By.xpath("(//button[text()='Add to basket'])[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addToBasket);

		Thread.sleep(500);

		((JavascriptExecutor) driver).executeScript("arguments[0].click();", addToBasket);
		System.out.println("Added to basket");
		
		String message = driver.findElement(By.xpath("//p[contains(text(),'An item has been added to your basket successfully')]")).getText();
		System.out.println(message);
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./snapshot/bigbasket.png");
		FileUtils.copyFile(source, destination);
		
		driver.quit();
	}

}
