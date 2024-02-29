package pages;

import java.io.IOException;
import java.util.ArrayList;
//import utilities.ExcelUtilis;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ExcelUtilis;

public class login extends basePage {

	public login(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	WebDriver driver;
	public static Set<String>windowIds;
	public static List<String>windowIdl;
	
	@FindBy(id="forum_login_wrap_lg")
	WebElement login;
	
	@FindBy(xpath="//*[@id='myModal3-modal-content']/div[1]/div/div[3]/div[6]/div")
	WebElement google;
	
	@FindBy(id="identifierId")
	WebElement element;
	
	@FindBy(xpath="//*[@id='identifierId']")
	WebElement textbox;
	
	@FindBy(xpath="//*[@id='identifierNext']/div/button/span")
	WebElement Next;
	
	@FindBy(xpath="//*[@id='yDmH0d']/c-wiz/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[2]/div[2]/div")
	WebElement error;
	
	
	public void login1(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().refresh();
		login.click();
		google.click();
		Thread.sleep(3000);
	}
	public List<String> winHandle(WebDriver driver) {
		windowIds=driver.getWindowHandles();
		windowIdl=new ArrayList<String>(windowIds);
		return windowIdl;
	}
	public void signIn(WebDriver driver) throws InterruptedException, IOException {
		 driver.switchTo().window(windowIdl.get(1));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		 element.click();
		 for(int row=0;row<3;row++) 
	  	    {
			 	textbox.clear();
	  	    	String[] inputData = ExcelUtilis.readData("Sheet1",row);
	  	    	textbox.sendKeys(inputData[0]);
//		 textbox.sendKeys("fdskhkjad@gmail.com");
		 Next.click();
		 System.out.println(error.getText());
		 }
		 }
	}

