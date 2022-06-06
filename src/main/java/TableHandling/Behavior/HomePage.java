package TableHandling.Behavior;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	By PractiseButton = By.linkText("PRACTICE");
	
	public WebElement clickonpractise() {
		WebElement ClickPractise = driver.findElement(PractiseButton);
		return ClickPractise;
	}

}
