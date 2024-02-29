package stepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.usedCars;

public class usedCars1 {
	WebDriver driver=BaseClass.getDriver();
	usedCars us=new usedCars(driver);
	
	@When("mouse event for usedcars")
	public void mouse_event_for_usedcars() throws InterruptedException {
	    us.usedcars();
	}

	@Then("print the car values")
	public void print_the_car_values() throws InterruptedException, IOException {
		us.popularCars();
	}



}
