package stepdefinition;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class CreateLeadSD extends BaseClass {
	
	@When("click on CRMSFA link")
	public void click_on_crmsfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();   
	}

	@When("click on Leads link")
	public void click_on_leads_link() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@When("Click on Create Lead link")
	public void click_on_create_lead_link() {
		driver.findElement(By.linkText("Create Lead")).click();
		
	}

	@When("Enter the companyName as {string}")
	public void enter_the_company_name_as(String companyN) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyN);
	}

	@When("Enter the firstName as {string}")
	public void enter_the_first_name_as(String firstN) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstN);
	}

	@When("Enter the lastName as {string}")
	public void enter_the_last_name_as(String lastN) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastN);
	}

	@When("click on Create Lead button")
	public void click_on_create_lead_button() {
		driver.findElement(By.name("submitButton")).click();
	}

	@Then("ViewLead page is displayed")
	public void view_lead_page_is_displayed() {
	    String title = driver.getTitle();
	    System.out.println(title);
	}

}
