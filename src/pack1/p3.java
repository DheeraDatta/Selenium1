package pack1;

import java.util.Set;
import java.util.set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p3
{
	static
	{
		
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				
	}
	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver = new ChromeDriver();
		  //driver.get("https://www.facebook.com/");
		  //driver.findElement(By.id("email")).sendKeys("abcd");
		  //driver.findElement(By.id("pass")).sendKeys("123456");
		  //driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("dhbdn");
	      //driver.findElement(By.id("loginbutton")).click();
		// for email
		 driver.get("https://accounts.google.com/");
		//driver.findElement(By.id("email")).sendKeys("abcd");
		//driver.findElement(By.id("pass")).sendKeys("123456");
		//driver.findElement(By.id("loginbutton")).click();
	  
		
	}


}
