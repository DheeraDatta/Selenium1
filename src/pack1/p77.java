package pack1;

import java.util.List;
import java.util.Set;
import java.util.set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p77
{
	static
	{
		
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				
	}
	public static void main(String[] args) throws Throwable 	
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("(//button)[2]")).click();
		Thread.sleep(3000);
		List<WebElement> li= driver.findElements(By.xpath("(//div[contains (text(),'Ends in')])"));
		System.out.println(li.size());
	}
}