package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class NewToursLoginPage {

	WebDriver dr;
	@Given("User enter into new tours login page")
	public void user_enter_into_new_tours_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		
		dr = new FirefoxDriver();
		
		dr.manage().deleteAllCookies();
		
		dr.get("http://newtours.demoaut.com/");
	
	}

	@When("Enter {string} and {string} on login page")
	public void enter_and_on_login_page(String uname, String pwd) {
	    // Write code here that turns the phrase above into concrete actions
		
		dr.findElement(By.xpath("//input[@name='userName']")).sendKeys(uname);
		dr.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		
	    
	}

	@When("user click on signin button")
	public void user_click_on_signin_button() {
	    // Write code here that turns the phrase above into concrete actions
		
		dr.findElement(By.xpath("//input[@name='login']")).click();
	    
	}

	@When("Select how many {string} in drop down list")
	public void select_how_many_in_drop_down_list(String passenger) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(passenger);
		WebElement slt = dr.findElement(By.xpath("//select[@name='passCount']"));
		
		Select st = new Select(slt);
		
		st.selectByVisibleText(passenger);
	}

	@When("User select {string} drop down list")
	public void user_select_drop_down_list(String departingfrom) {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement sl = dr.findElement(By.xpath("//select[@name='fromPort']"));                           
		
		Select ss = new Select(sl);
		
		ss.selectByVisibleText(departingfrom);

		
	}

	@When("User select {string} and {string} values from drop down list")
	public void user_select_and_values_from_drop_down_list(String Month, String Day) {
	    // Write code here that turns the phrase above into concrete actions
	    
		WebElement mo = dr.findElement(By.xpath("//select[@name='fromMonth']"));
		
		Select m1 = new Select(mo);
		
		m1.selectByVisibleText(Month);
		
		
		WebElement dd = dr.findElement(By.xpath("//select[@name='fromDay']"));
		
		Select d1 = new Select(dd);
		
		d1.selectByVisibleText(Day);
		
	}

	@When("User Select {string} option from drop down list")
	public void user_Select_option_from_drop_down_list(String ArrvingIn) {
	    // Write code here that turns the phrase above into concrete actions
	    
		WebElement arrive = dr.findElement(By.xpath("//select[@name='toPort']"));
		
		Select a1 = new Select(arrive);
		
		a1.selectByVisibleText(ArrvingIn);
		
	}

	@When("User select Returning {string} and {string} from drop down list")
	public void user_select_Returning_and_from_drop_down_list(String month, String day) {
	    // Write code here that turns the phrase above into concrete actions
	    
		WebElement mo1 = dr.findElement(By.xpath("//select[@name='fromMonth']"));
		
		Select m2 = new Select(mo1);
		
		m2.selectByVisibleText(month);
		
		
		WebElement dd1 = dr.findElement(By.xpath("//select[@name='fromDay']"));
		
		Select d2 = new Select(dd1);
		
		d2.selectByVisibleText(day);
		
	}


}
