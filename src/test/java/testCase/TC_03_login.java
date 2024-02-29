package testCase;

import testBase.baseclass;

import java.io.IOException;
import java.util.List;

//import org.apache.poi.xssf.usermodel.XSSFRow;
import org.testng.annotations.Test;

import pages.login;
//import utilities.ExcelUtilis;

public class TC_03_login extends baseclass {
	@Test(priority=3)
	public void login() throws InterruptedException, IOException {
		login log=new login(driver);		
		log.login1(driver);
		logger.info("login page navigated");
		List<String> s =log.winHandle(driver);
		System.out.println(s.size());
		log.signIn(driver);
		logger.info("printed error message");
		
		
		
		
	}

}
