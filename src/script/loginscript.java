package script;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Set;
import java.util.set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import POM.LoginActitime;

public class loginscript 
{
		static
		{	
				System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");			
		}
		public static  void main(String[] args) throws Throwable 	
		{
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");
		    LoginActitime ob=new LoginActitime(driver);
		    ob.setusername("admin");
		    ob.setpassword("manager");
		    ob.clicklogin();
		}
		
	
}
