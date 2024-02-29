package stepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.login;

public class login2 {
	WebDriver driver=BaseClass.getDriver();
	login log=new login(driver);
	@When("click the login")
	public void click_the_login() throws InterruptedException {
	    log.login1(driver);
	}

	@When("handle the window")
	public void handle_the_window() {
	    log.winHandle(driver);
	}

	@Then("sign in")
	public void sign_in() throws InterruptedException, IOException {
	    log.signIn(driver);
	}


}
