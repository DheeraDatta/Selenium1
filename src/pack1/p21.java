package pack1;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class p21
{
	static
	{
		
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				
	}
	public static  void main(String[] args) throws Throwable 	
	{
		WebDriver driver = new ChromeDriver();
		//driver.get("https://demo.actitime.com/");
		driver.get("file:///C:/Users/ADMIN/Desktop/day12..html");
		//WebElement  element=driver.findElement(By.xpath("//a[text()='actiTIME Inc.']"));
		WebElement  element=driver.findElement(By.id("demo"));
		Actions a=new Actions(driver);
		a.doubleClick(element).perform();
		//a.contextClick(element).perform();
		//Robot r=new Robot();
		//r.keyPress(KeyEvent.VK_W);
		//r.keyRelease(KeyEvent.VK_W)
		

			
	}
}