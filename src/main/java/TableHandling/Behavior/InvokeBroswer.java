package TableHandling.Behavior;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InvokeBroswer {

	public WebDriver driver ;
	public Properties prop;

	
	public WebDriver openbrowser() throws IOException {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\snehal\\eclipse-workspace\\Behavior\\src\\main\\java\\TableHandling\\Behavior\\data.properties");
		prop.load(fis);
		String BrowserName = prop.getProperty("browser");
		if(BrowserName.contains("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\snehal\\Documents\\chromedriver.exe\\");
		ChromeOptions co = new ChromeOptions();
		if(BrowserName.contains("headless")) {
			co.addArguments("headless");
		}
		driver = new ChromeDriver(co);
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(prop.getProperty("URL"));
		return driver;
				
	}
}
