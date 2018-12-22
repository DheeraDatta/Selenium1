package pack1;

import java.util.Set;
import java.util.set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail
{
	static
	{
		
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				
	}
	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue");
		 driver.findElement(By.id("identifierId")).sendKeys("dheerajdatta85@gmail.com");
		 driver.findElement(By.id("identifierNext")).click();
		 Thread.sleep(1500);
		 driver.findElement(By.name("password")).sendKeys("kkkkkkk");
		 driver.findElement(By.id("passwordNext")).click();
		 
		
	  
		
	}


}
