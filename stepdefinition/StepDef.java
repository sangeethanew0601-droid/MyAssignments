package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef extends BaseClass {

	@Given("Launch the browser and load the URL")
	public void launch_the_browser_and_load_the_url() {
		driver = new ChromeDriver();
	    driver.get("http://leaftaps.com/opentaps/");
	    driver.manage().window().maximize();
	    
	}

	@When("Enter the username as {string}")
	public void enter_the_username(String userName) {
		driver.findElement(By.id("username")).sendKeys(userName); 
	}

	@When("Enter the password as {string}")
	public void enter_the_password(String pw) {
		driver.findElement(By.id("password")).sendKeys(pw);
  }

	@When("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();    
	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() {
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
