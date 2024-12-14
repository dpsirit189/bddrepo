package pk1;

import static org.junit.Assert.*;

import org.junit.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Demotest {

	@Given("user is Login page") 
	public void mygiven() throws Throwable 
	{
		System.out.println("inside given");
	}
	
	@When("user enter credentials") 
	public void mywhen() throws Throwable 
	{
		System.out.println("inside when");
	}
	
	@Then("home page should be displayed") 
	public void homepage() throws Throwable 
	{
		System.out.println("inside then");
	}

}
