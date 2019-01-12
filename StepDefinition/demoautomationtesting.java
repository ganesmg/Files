package StepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class demoautomationtesting {

	WebDriver dr;
	
	@Given("Browser Name")
	public void browser_Name() {
	    // Write code here that turns the phrase above into concrete actions
		
		dr = new FirefoxDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	}

	@Then("User login to DemoAutomation Testing page")
	public void user_login_to_DemoAutomation_Testing_page() {
	    // Write code here that turns the phrase above into concrete actions
		
		dr.get("http://demo.automationtesting.in/");
		System.out.println(dr.getTitle());
	    
	}

	@Then("User click on Navigation button")
	public void user_click_on_Navigation_button() {
	    // Write code here that turns the phrase above into concrete actions
	    
		dr.findElement(By.xpath("//img[@id='enterimg']")).click();
	}

	@Then("User enter into Registration page")
	public void user_enter_into_Registration_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("User select Cricket and Hockey checkbox")
	public void user_select_Cricket_and_Hockey_checkbox() {
	    // Write code here that turns the phrase above into concrete actions
	    
		List<WebElement> chk = dr.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement ch:chk)
		{
			String str= ch.getAttribute("value");
			if(str.equalsIgnoreCase("Cricket")|| (str.equalsIgnoreCase("Hockey")))
			{
				ch.click();
			}
		}
	}

	@Then("User select Skills dropdown option")
	public void user_select_Skills_dropdown_option() {
	    // Write code here that turns the phrase above into concrete actions
	    
		WebElement slt = dr.findElement(By.xpath("//select[@id='Skills']"));
		
		Select drp = new Select(slt);
		
		drp.selectByVisibleText("Analytics");
	}

}
