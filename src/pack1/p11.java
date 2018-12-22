package pack1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p11
{
	
	static
	{
		
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				
	}
	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com/");
		  WebElement copyright=driver.findElement(By.xpath("//span[contains(text(),' Facebook © 2018')]"));
		  int x= copyright.getLocation().getX();
		  int y= copyright.getLocation().getY();
		  JavascriptExecutor j=(JavascriptExecutor)driver;
		 // j.executeScript("window.scrollBy(18,818)");
		  j.executeScript("window.scrollBy("+x+","+y+")");		  
		  
		  
	}
}