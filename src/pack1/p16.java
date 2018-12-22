package pack1;

import java.util.List;
import java.util.Set;
import java.util.set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class p16
{
	static
	{
		
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				
	}
	public static <webDriverWait> void main(String[] args) throws Throwable 	
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@class='content users']"));
		Thread.sleep(4000);
		
		//Alert a=driver.switchTo.alert();
		//a,accept;
		//a.dismiss();
		
		//driver.findElement(By.id("logoutLink")).click();
		//driver.close();
	}
}