package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FinanceYahoo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://finance.yahoo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions act=new Actions(driver);
		WebElement scroll = driver.findElement(By.xpath("//h2[text()='More News']"));
		act.scrollToElement(scroll).perform();
		Thread.sleep(2000);
		WebElement mouseHover = driver.findElement(By.xpath("//button[@aria-label='More']/span"));
		act.moveToElement(mouseHover).perform();//perform is a mandotory method
		Thread.sleep(2000);
		WebElement cryptoOption = driver.findElement(By.xpath("(//li[@class='_yb_1vixdbi'])[4]/ul/li[8]"));
		act.click(cryptoOption).perform();
		String columnName = driver.findElement(By.xpath("//table/thead/tr/th[2]")).getText();
		System.out.println("-------------" +columnName);
		List<WebElement> elements = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		for (WebElement cryptoName : elements) {
			System.out.println(cryptoName.getText());
			
		}
		
	}

}
