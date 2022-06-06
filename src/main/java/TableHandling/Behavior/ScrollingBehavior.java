package TableHandling.Behavior;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ScrollingBehavior {

	WebDriver driver;
	JavascriptExecutor js; //= ((JavascriptExecutor) driver);
	
	
	
	public ScrollingBehavior(WebDriver driver, JavascriptExecutor js) {
		this.driver = driver;
		//this.js = js;
	}
	
	
	public Object scrollpage() {
		
		return ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
	}
	
	
	public Object scrolltable() {
		return ((JavascriptExecutor) driver).executeScript("document.querySelector(\"div[class='tableFixHead']\").scrollBy(0,200)");
	}
			
}
