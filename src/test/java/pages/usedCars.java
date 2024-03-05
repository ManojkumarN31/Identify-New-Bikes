package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utilities.ExcelUtilis;

public class usedCars extends basePage {

	public usedCars(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	List<String> popularbikes;
	
	@FindBy(xpath="//*[@id='headerNewNavWrap']/nav/div/ul/li[7]/a")
	WebElement usedcars;
	
	@FindBy(xpath="//*[@id='headerNewNavWrap']/nav/div/ul/li[7]/ul/li/div[2]/ul/li[4]/span")
	WebElement chennai;
	
	@FindBy(xpath="//ul[@class='zw-sr-secLev usedCarMakeModelList popularModels ml-20 mt-10']/li")
	List<WebElement> popular;
	
	ExcelUtilis eu=new ExcelUtilis();
	elementtostring es = new elementtostring();
	
	public void usedcars() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-1800)");
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(usedcars).perform();
		chennai.click();
		Thread.sleep(3000);
	}
	
	public void popularCars() throws InterruptedException, IOException {
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("window.scrollBy(0,600)");
		for( int i=0; i<popular.size();i++) {
			String ll=popular.get(i).getText();
			System.out.println(ll);
			}
		Thread.sleep(4000);		
		popularbikes =es.convertData(popular,popularbikes);
		
		eu.writeData("popular models", popularbikes, 0, 0);
	}	
	
}
