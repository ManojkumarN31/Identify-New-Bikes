package TestSuite;




import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import pages.login;
import pages.upcomingBikes;
import pages.usedCars;
import testBase.baseclass;
import testCase.TC_02_usedcars;
	



public class RegressionTest extends baseclass {

	@Test
	void click_usedCar1() throws InterruptedException, IOException {

		usedCars mk=new usedCars(driver);
		mk.usedcars();
		mk.popularCars();
	}
	

}
