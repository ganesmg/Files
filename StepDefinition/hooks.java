package StepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks {
	
	@Before
	public void beforetest()
	{
		System.out.println("Before Test Successfully");
	}
	
	@After("@Regression")
	public void aftertest()
	{
		System.out.println("After test Successfully");
	}
	/*@Before
	public void beforetest1()
	{
		System.out.println("Before Test Successfully 1");
	}*/
	
	@After("@Smoke, @Sanity")
	public void aftertest1()
	{
		System.out.println("After test Successfully 1");
	}

}
