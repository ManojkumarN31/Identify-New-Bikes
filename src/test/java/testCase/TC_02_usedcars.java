package testCase;

import testBase.baseclass;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.usedCars;





public class TC_02_usedcars extends baseclass{
	@Test(priority=2)
	public void usedCars() throws InterruptedException, IOException {
		usedCars car=new usedCars(driver);
		car.usedcars();
		logger.info("used cars clicked");
		car.popularCars();
		logger.info("popular cars printed");
	}

}
