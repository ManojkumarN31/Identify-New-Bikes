package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class elementtostring {
	
		//WebElement to String method for Data Store and Dispaly the result
		public List<String> convertData(List<WebElement> a, List<String> b ){
			b = new ArrayList<String>();
			for(int i =0; i<a.size(); i++) {
				b.add(a.get(i).getText());			
			}
			return b;
		}
	 

}
