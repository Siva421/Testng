package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {

	//Login Page
	@FindBy(id="ap_email")
	public static WebElement emailLogin;
	
	@FindBy(id="continue")
	public static WebElement submitbtn;
	@FindBy(id="ap_password")
	public static WebElement password;
	
	@FindBy(id="signInSubmit")
	public static WebElement signinbtn;
	
	@FindBy(id="twotabsearchtextbox")
	public static WebElement txt;
	
	@FindBy(id="nav-search-submit-button")
	public static WebElement submitbtn1;
	
	//Searching KeyBoard
	@FindBy(xpath="https://m.media-amazon.com/images/I/61ltL022OEL._AC_UY218_.jpg")
	public static WebElement open;
	@FindBy(id="add-to-cart-button")
	public static WebElement button;
	@FindBy(id="nav-logo-sprites")
	public static WebElement home;
	
	@FindBy(id="twotabsearchtextbox")
	public static WebElement txt2;

    @FindBy(id="nav-search-submit-button")
    public static WebElement submitbtn2;
	
    //Searching Water Bottle
	@FindBy(xpath="//img[@src=\"https://m.media-amazon.com/images/I/713z0OOpgLL._AC_UL320_.jpg\"]")
    public static WebElement open1;
	@FindBy(id="add-to-cart-button")
	public static WebElement button1;
	@FindBy(id="nav-logo-sprites")
	public static WebElement home1;
	
	@FindBy(id="twotabsearchtextbox")
	public static WebElement txt3;
	
	@FindBy(id="nav-search-submit-button")
    public static WebElement submitbtn3;

	//Searching TV
	@FindBy(xpath="//img[@src=\"https://m.media-amazon.com/images/I/71KBZfqC8lL._AC_UY218_.jpg\"]")
	public static WebElement open2;
	@FindBy(id="add-to-cart-button")
	public static WebElement button2;
	@FindBy(id="nav-logo-sprites")
	public static WebElement home2;
	
	@FindBy(id="twotabsearchtextbox")
	public static WebElement txt1;
	
	@FindBy(id="nav-search-submit-button")
	public static WebElement submitbtn4;
	
	//Searching ac
	@FindBy(xpath="//img[@src=\"https://m.media-amazon.com/images/I/31cSwAiKh+L._AC_UY218_.jpg\"]")
	public static WebElement open3;
	@FindBy(id="add-to-cart-button")
	public static WebElement button3;
	

}
