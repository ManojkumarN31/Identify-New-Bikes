package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class basePage {

	WebDriver driver;
	
	

	public basePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public static Actions getAction(WebDriver driver) {
		Actions act = new Actions(driver);
		return act;
	}
}
