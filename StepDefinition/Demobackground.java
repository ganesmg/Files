package StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Demobackground {
	
	WebDriver dr;

	@Given("Enter Demo Automation URL")
	public void enter_Demo_Automation_URL() {
	    // Write code here that turns the phrase above into concrete actions
	    
		dr = new FirefoxDriver();
		dr.manage().window().maximize();
		dr.get("http://demo.automationtesting.in/");
		
	}

	@Then("User Clicks Navigation button")
	public void user_Clicks_Navigation_button() {
	    // Write code here that turns the phrase above into concrete actions
	    
		dr.findElement(By.xpath("//img[@id='enterimg']")).click();
	}

	@Given("User click on Gender Option")
	public void user_click_on_Gender_Option() {
	    // Write code here that turns the phrase above into concrete actions
		List <WebElement> rd = dr.findElements(By.xpath("input[@type='radio']"));
		
		for(WebElement radio:rd)
		{
			String str = radio.getAttribute("value");
			if(str.equalsIgnoreCase("Male"))
			{
				radio.click();
				break;
			}
		}
	    
	}

	@Given("User select checkbox")
	public void user_select_checkbox() {
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
			

	@Given("Enter the password")
	public void enter_the_password() {
	    // Write code here that turns the phrase above into concrete actions
	    
		dr.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Ganesh@123");
	}

}
