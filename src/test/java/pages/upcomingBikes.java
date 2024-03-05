package pages;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utilities.ExcelUtilis;


public class upcomingBikes extends basePage {

 	WebDriver driver;
 	
 	List<String> bikeNameList, dateList,amountList;
 	List<String> bikexl = new ArrayList<String>();
 	List<String> datexl =new ArrayList<String>();
 	List<String> amountxl = new ArrayList<String>();
	public upcomingBikes(WebDriver driver) 
	{
		super(driver);
	}
 
	
	@FindBy(xpath="//a[contains(text(),'New Bikes')]")
	WebElement newBikesMenu;
	
	@FindBy(xpath="//*[@id='headerNewNavWrap']/nav/div/ul/li[3]/ul/li[5]/span")
	WebElement upcomebike;
	
	@FindBy(xpath="//*[@id='makeId']")
	WebElement manufacture;
	
	@FindBy(xpath="//*[@id='makeId']/option[4]")
	WebElement honda;
	
	@FindBy(xpath="//*[@id='modelList']/li[16]/span")
	WebElement morebike;
			
	@FindBy(xpath="//*[@class='lnk-hvr block of-hid h-height']")
	List<WebElement> name;
	
	@FindBy(xpath="//*[@class='clr-try fnt-14']")
	List<WebElement> date;
	
	@FindBy(xpath="//*[@class='b fnt-15']")
	List<WebElement> amount;
	ExcelUtilis eu=new ExcelUtilis();
	elementtostring es = new elementtostring();
	
	public void search(WebDriver driver) throws InterruptedException {
			Thread.sleep(3000);
			Actions action = basePage.getAction(driver);
			action.moveToElement(newBikesMenu).build().perform();
//			if(action.moveToElement(newBikesMenu).perform());
			//System.out.println("Hover" + action.toString());
			Thread.sleep(2000);
			upcomebike.click();
			
	}
	public void honda() {
		manufacture.click();
		honda.click();
	}
	public void bikeDetails(WebDriver driver) throws InterruptedException, IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1700)");
		Thread.sleep(5000);
		morebike.click();
		
		List<Integer> a = new ArrayList<>();
		for( int i=0; i<amount.size();i++) {
			
//			String names=name.get(i).getText(); 
//			String dates=date.get(i).getText();
			String r=amount.get(i).getText();
			 float fixed=400000.0f;
			 String ra=r.replace("Rs. ","").replaceAll(",","");
			 //System.out.println("No : " + (i+1));
			 if (ra.contains("Lakh")) {
		           float value1 = Float.parseFloat(ra.split(" ")[0]) * 100000;	
		           if(value1<=fixed) {
		        	   System.out.println("\n" +name.get(i).getText());
		        	   System.out.println(date.get(i).getText());
		        	   System.out.println(amount.get(i).getText());
		        	   bikexl.add(name.get(i).getText());
			           datexl.add(date.get(i).getText());
			           amountxl.add(amount.get(i).getText());
			        	
		           }
		            
			 }
		         else {
		        	 float value1 = Float.parseFloat(ra);
//		           
		            if(value1<=fixed) {
		            	System.out.println("\n" +name.get(i).getText());
			        	   System.out.println(date.get(i).getText());
			        	     
		            	System.out.println(amount.get(i).getText());
		            	 bikexl.add(name.get(i).getText());
			        	 datexl.add(date.get(i).getText());
			        	 amountxl.add(amount.get(i).getText());
			        	
		            }
		            continue;
		            
      	
		        	

		        }
			    eu.writeData("bike models", bikexl, 0, 0);
	        	eu.writeData("bike models", datexl, 0, 1);
	        	eu.writeData("bike models", amountxl, 0, 2);
			}}}
		      
		           
		           
		           
		           
