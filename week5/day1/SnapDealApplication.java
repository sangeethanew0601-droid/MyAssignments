package week5.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDealApplication {

	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Mouse hover on Men's Fashion
		WebElement mouseHover = driver.findElement(By.xpath("//div[@id='tab-category-0']/div"));
		Actions act = new Actions(driver);
		act.moveToElement(mouseHover).perform();

		// Clicking Sports Shoes under footwear
		WebElement sportsShoes = driver.findElement(By.xpath("//div[text()='Sports Shoes']"));
		act.click(sportsShoes).click().perform();

		// Count of Sports Shoes for Men
		String sportShoesCount = driver.findElement(By.xpath("//div[@class='child-cat-count ']")).getText();
		System.out.println("Count of Sports Shoes: " + sportShoesCount);

		// Click on Training Shoes
		WebElement traningShoes = driver.findElement(By.xpath("//div[text()='Training Shoes']"));
		act.click(traningShoes).perform();

		// Sorting the Price "Low to High"
		WebElement sortArrow = driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']"));
		act.click(sortArrow).perform();

		WebElement lowToHigh = driver.findElement(By.xpath("(//li[@class='search-li'])[1]"));
		act.click(lowToHigh).perform();

		Thread.sleep(2000);

		// Get all price elements
		List<WebElement> priceElements = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));

		// Convert prices to Integer list
		List<Integer> actualPrices = new ArrayList<>();

		for (WebElement price : priceElements) {
			String text = price.getText().replaceAll("Rs.|\\s|,", "");
			if(!text.isEmpty()) {
			actualPrices.add(Integer.parseInt(text));
			}
		}

		// Create a copy of actual list
		List<Integer> sortedPrices = new ArrayList<>(actualPrices);

		// Sort the copied list (Low → High)
		Collections.sort(sortedPrices);

		// Compare both lists
		if (actualPrices.equals(sortedPrices)) {
			System.out.println("Prices are sorted correctly (Low to High)");
		} else {
			System.out.println("Prices are NOT sorted correctly");
		}

		// Filter by entering the price range from 500 to 2000
		driver.findElement(By.xpath("//input[@name='fromVal']")).clear();
		driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("400");

		driver.findElement(By.xpath("//input[@name='toVal']")).clear();
		driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("1000");

		WebElement goClick = driver.findElement(By.xpath("//div[contains(text(),'GO')]"));
		act.click(goClick).perform();

		Thread.sleep(2000);

		// Filtering By color White and Blue
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),' White & Blue')]"));
		act.click(element).perform();

		Thread.sleep(2000);

		String priceFilter = driver.findElement(By.xpath("(//div[@class='navFiltersPill']/a)[1]")).getText();

		String colorFilter = driver.findElement(By.xpath("(//div[@class='navFiltersPill']/a)[2]")).getText();
		System.out.println("Filter Applied: "+priceFilter +" " +"and"+" "+colorFilter);

		// Mouse hover on first resulting shoe
		WebElement mouseHover1 = driver.findElement(By.xpath("(//a[@class='dp-widget-link noUdLine hashAdded'])[1]"));
		act.moveToElement(mouseHover1).perform();

		Thread.sleep(2000);

		// Mouse Hover on Quick View button on first resulting shoe
		WebElement quickView = driver.findElement(By.xpath("(//div[@class='clearfix row-disc']/div)[1]"));
		act.moveToElement(quickView).perform();

		Thread.sleep(2000);

		// Click on Quick View button
		driver.findElement(By.xpath("(//div[@class='clearfix row-disc']/div)[1]")).click();

		Thread.sleep(4000);

		// Taking Snapshot
		WebElement img = driver.findElement(By.xpath("//img[@itemprop='image']"));
		File source = img.getScreenshotAs(OutputType.FILE);
		File destination = new File("./snapshot/bagImage.png");
		FileUtils.copyFile(source, destination);
		
		// Printing price & discount
		String price = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		String discount = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("Price and discount: "+price + "" + "" +discount);

		WebElement closeQV = driver.findElement(By.xpath("//div[@class='close close1 marR10']/i"));
		act.click(closeQV).perform();

		driver.close();
	}
}
