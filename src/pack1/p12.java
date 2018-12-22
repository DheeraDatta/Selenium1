package pack1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p12
{
	
	private static final String JavascriptExecutor = null;
	static
	{
		
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				
	}
	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver = new ChromeDriver();
		  driver.navigate().to("file:///C:/Users/ADMIN/Desktop/day8.html");
		  JavascriptExecutor j=(JavascriptExecutor)driver;
		  j.executeScript("document.getElementById('t1').value='abc'");
	}
}