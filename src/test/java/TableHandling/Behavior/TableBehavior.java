package TableHandling.Behavior;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TableBehavior extends InvokeBroswer{
	WebDriver driver;
	JavascriptExecutor js;
	List<WebElement> allamount;
	int a;
	//JavascriptExecutor js = ((JavascriptExecutor) driver);

	@BeforeTest
	public void GotoPactisepage() throws IOException {
		driver = openbrowser();
	HomePage hp = new HomePage(driver);
	hp.clickonpractise().click();
	}

	@Test
	public void Scrolling() {
	ScrollingBehavior sb = new ScrollingBehavior(driver,js);
	sb.scrollpage();
	sb.scrolltable();
	}
	
	@Test
	public void Comparevalue() {
		PracticePage pp = new PracticePage(driver);
		int result = pp.getAmount();
		System.out.println(result);
	}
	
	@Test
	public void totalentries() {
		PracticePage pp = new PracticePage(driver);
		System.out.println(pp.getentries());
	}
	
}
