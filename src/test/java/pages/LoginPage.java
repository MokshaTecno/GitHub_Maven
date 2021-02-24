package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	
	@FindBy(linkText="Log in")
    WebElement lnkLogin;
    
    @FindBy(name="user_login")
    WebElement editUsername;
    
    @FindBy(name="user_pwd")
    WebElement editPwd;
    
    @FindBy(linkText="remember")
	WebElement chkBox;
	
	@FindBy(linkText="btn_login")
	WebElement btnPwd;
	
	
	public LoginPage(WebDriver testdriver) {
		this.driver= testdriver;
		PageFactory.initElements(driver, this);
	}
	
	public void Login(String Username,String Password) {
		
		WebElement lnkLogin = driver.findElement(By.linkText("Log in"));
		
		lnkLogin.click();
		editUsername.sendKeys(Username);
		editPwd.sendKeys(Password);
		chkBox.click();
		btnPwd.click();
		
	}
		
}		
		