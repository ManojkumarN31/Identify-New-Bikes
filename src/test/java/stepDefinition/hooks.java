package stepDefinition;
 
import java.io.IOException;
import java.util.Properties;
 
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
 
import factory.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
 
 
public class hooks {
 
	 WebDriver driver;
	 Properties p;
	@Before
    public void setup() throws IOException, InterruptedException
    {
    	driver=BaseClass.initilizeBrowser();
    	p=BaseClass.getProperties();
    	driver.get(p.getProperty("appURL"));
    	driver.manage().window().maximize();
    	Thread.sleep(5000);
	}

    @After
    public void tearDown(Scenario scenario) {
       driver.quit();
    }

 
    @AfterStep
    public void addScreenshot(Scenario scenario) {
    	// this is for cucumber junit report

        	TakesScreenshot ts=(TakesScreenshot) driver;
        	byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
        	scenario.attach(screenshot, "image/png",scenario.getName());

    }
}