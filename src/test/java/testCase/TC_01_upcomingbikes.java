package testCase;

import testBase.baseclass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.upcomingBikes;
import pages.upcomingBikes;

@Test(priority=1)
public class TC_01_upcomingbikes extends baseclass{
//	 WebDriver driver;
	public void upcomingbike() throws InterruptedException, IOException {
		upcomingBikes ups=new upcomingBikes(driver);
		ups.search(driver);
		logger.info("searched");
		ups.honda();
		logger.info("honda clicked");
		ups.bikeDetails(driver);
		logger.info("bike details printed");
	}
}
