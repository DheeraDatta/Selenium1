package pack1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p101
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
		  System.out.println(x);
		  System.out.println(y);
		  
	}
}