package pageObjects;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

public class AmazonLoginPageObject {

	 ChromeDriver driver ;
	 WebDriverWait wait ; 
	 @BeforeSuite
		public void navigate(){
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\elcot\\eclipse-workspace\\firstday\\src\\resources\\chromedriver_97.0.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(20));
				driver.get("https://www.amazon.com/");
  				
}
