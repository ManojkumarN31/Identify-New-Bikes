package stepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.interactions.Actions;

import factory.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import pages.basePage;
import pages.upcomingBikes;

public class upcomingbike {
	WebDriver driver=BaseClass.getDriver();
	upcomingBikes up=new  upcomingBikes(driver);
	@When("mouse event for newbikes")
	public void mouse_event_for_newbikes() throws InterruptedException {
		
		up.search(driver);
		
	}

	

	

	@And("click the honda")
	public void click_the_honda() {
	    up.honda();
	}

	@Then("click the more bikes")
	public void click_the_more_bikes() throws InterruptedException, IOException {
	    up.bikeDetails(driver);
	}

	



}
