package TableHandling.Behavior;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticePage {
	WebDriver driver;
		public PracticePage(WebDriver driver) {
		this.driver = driver;	
		}
	
	By amount = By.xpath("//table/tbody/tr/td[4]");
	By TotalAmount = By.className("totalAmount");
	By totalentries = By.xpath("//table/tbody/tr");
	int displayedsum = Integer.parseInt(driver.findElement(TotalAmount).getText().split(":")[1].trim());
	
	public int getAmount() {
		int sum = 0;
		List<WebElement> allamount = driver.findElements(amount);
		for(int i = 0; i<allamount.size(); i++) {
			sum = sum + Integer.parseInt(allamount.get(i).getText());	
		}
		int result = sum - displayedsum;
		return result;
	}
	public int getentries() {
		return driver.findElements(totalentries).size();
	}

}
