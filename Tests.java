package Testng;

import static org.testng.Assert.assertFalse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.AmazonLoginPageObject;
import pageObjects.LoginPageObjects;
import qsp.AmazonLogin;

public class Tests extends AmazonLoginPage {
  @Test
  public void navigate() {
	  System.setProperty("webdriver.chrome.driver","D:\\Kcsm13\\AutomationProject\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(20));
				driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
				
				PageFactory.initElements(driver, LoginPageObjects.class);
				
				LoginPageObjects.emailLogin.sendKeys("9885052588");
				LoginPageObjects.submitbtn.click();
				LoginPageObjects.password.sendKeys("Pavan@118");
				LoginPageObjects.signinbtn.click();
				
	          //Searching Keyboard
	      	  LoginPageObjects.txt.sendKeys("keyboard");
	      	  LoginPageObjects.submitbtn1.click();
	      	  LoginPageObjects.open.click();
	      	  try {
	      		  driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]"));
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
	      	 //Searching Water Bottle
	    	  LoginPageObjects.txt.sendKeys("water bottle");
	    	  LoginPageObjects.submitbtn2.click();
	    	  LoginPageObjects.open1.click();
	    	  try {
	    		  driver.findElement(By.xpath("//input[@id=\\\"add-to-cart-button\\\"]"));
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	  
	    	  //Searching TV
	    	  LoginPageObjects.txt.sendKeys("TV");
	    	  LoginPageObjects.submitbtn1.click();
	    	  LoginPageObjects.open2.click();
	    	  try {
	    		  driver.findElement(By.xpath("//input[@id=\\\"add-to-cart-button\\\"]"));
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	  
	    	  //Searching ac
	    	  LoginPageObjects.txt.sendKeys("ac");
	    	  LoginPageObjects.submitbtn1.click();
	    	  LoginPageObjects.open3.click();
	    	  try {
	    		  driver.findElement(By.xpath("//input[@id=\\\"add-to-cart-button\\\"]"));
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	  
	    	  
  }
}
