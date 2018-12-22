package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facbooklogin 
{
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="pass")
	private WebElement pass;
	
	@FindBy(id="loginbutton")
	private WebElement loginbutton;
	
	 public facbooklogin(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	 public void setemailid(String em)
	 {
		 this.email.sendKeys(em);
	 }
	 public void setpassword(String psw)
	 {
		 this.pass.sendKeys(psw);
	 }
	 public void clicklogin()
	 {
		 this.loginbutton.click();
	 }
}
