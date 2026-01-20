package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefSalesforceApp {
	
	public ChromeDriver driver;
	JavascriptExecutor js;
	
	@Given("Launch the browser and load the URL of Salesforce")
	public void launch_the_browser_and_load_the_url_of_salesforce() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--user-data-dir=C:\\SeleniumProfile");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
	    driver.get("https://login.salesforce.com");
	}

	@When("Enter the username in login page")
	public void enter_the_username_in_login_page() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("sangeethaalagirisamy.20972bce109c@agentforce.com");
	}

	@When("Enter the password in login page")
	public void enter_the_password_in_login_page() {
		driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("Sangeetha@2026");
	}

	@When("check the Remember me checkbox")
	public void check_the_remember_me_checkbox() {
		driver.findElement(By.xpath("//label[text()='Remember me']")).click();
	}

	@When("click on login button in Salesforce")
	public void click_on_login_button_in_salesforce() {
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}

	@When("click on toggle menu button from the left corner")
	public void click_on_toggle_menu_button_from_the_left_corner() {
		WebElement appLauncher = driver.findElement(By.xpath("//span[text()='App Launcher']"));
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", appLauncher);
	}

	@When("click on view All")
	public void click_on_view_all() {
		driver.findElement(By.xpath("//button[text()='View All']")).click();
	}

	@When("Search for Sales and press ENTER")
	public void search_for_accounts_and_press_enter() {
		driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys("Sales", Keys.ENTER);
	}

	@When("click on Sales")
	public void click_on_accounts() {
	    driver.findElement(By.xpath("//p[text()='Manage your sales process with accounts, leads, opportunities, and more']")).click();
	}
	
	@When("click on Accounts tab")
	public void click_on_account_tab() {
	    WebElement element1 = driver.findElement(By.xpath("//one-app-nav-bar-item-root[@data-id='Account']/a/span"));
	    js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", element1);
	}

	@When("stay on Accounts page")
	public void stay_on_Accounts_page() {
	    driver.get("https://orgfarm-8461a0f2e5-dev-ed.develop.lightning.force.com/lightning/o/Account/list?filterName=__Recent");
	}

	@When("click on New button")
	public void click_on_new_button() {
	    driver.findElement(By.xpath("//div[text()='New']")).click();
	}

	@When("enter the account name")
	public void enter_the_account_name() {
	    driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Test Account 201_01_1");
	}

	@When("select the ownership as public")
	public void select_the_ownership_as_public() {
	   WebElement ownerShipDD = driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value'])[3]"));
	   js = (JavascriptExecutor) driver;
	   js.executeScript("arguments[0].click();", ownerShipDD);
	   WebElement publicOption = driver.findElement(By.xpath("//span[text()='Public']"));
	   js.executeScript("arguments[0].click();", publicOption);
	}

	@When("click on Save")
	public void click_on_save() {
	    driver.findElement(By.xpath("//button[text()='Save']")).click();
	}

	@Then("verify the toast message that Account is created")
	public void verify_the_toast_message_that_account_is_created() {
	    String accCreateToastMsg = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
	    System.out.println(accCreateToastMsg);
	    if(accCreateToastMsg.contains("Test Account 201_01_1")) {
	    	System.out.println("Test Passed!!");
	    }
	    else {
	    	System.out.println("Test failed");
	    }
	    System.out.println(driver.getTitle());
	}

}