package TestSuite;




import java.io.IOException;
import org.testng.annotations.*;

import pages.login;
import pages.upcomingBikes;
import pages.usedCars;
import testBase.baseclass;
import testCase.TC_02_usedcars;
	




	public class smokeTest extends baseclass {

		@Test(priority = 0)
		void upcome() throws IOException, InterruptedException {
			upcomingBikes ups=new upcomingBikes(driver);
			ups.search(driver);
		}

		
		@Test(priority = 1)
		void click_usedCar() throws InterruptedException {
			usedCars mk=new usedCars(driver);
			mk.usedcars();
		}
		
		@Test(priority = 2)
		void signin() throws InterruptedException {
			login log=new login(driver);
			log.login1(driver);
		}

		

		
		


	}



