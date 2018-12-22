package pack1;

import java.util.Set;
import java.util.set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2
{
	static
	{
		
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				
	}
	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/ADMIN/Desktop/day4.html");
		//WebElement a = driver.findElement(By.id("t1"));
		//WebElement a = driver.findElement(By.tagName("a"));
		//a.click();
	    //driver.findElement(By.name("d1")).click();
	    //driver.findElement(By.linkText("Google")).click();
	    driver.findElement(By.partialLinkText("Google")).click();//when the lnk is daynmacialy changeing use this
		
	}


}
