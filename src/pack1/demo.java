package pack1;


import java.util.Set;
import java.util.set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo
{
	static
	{
		
				System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				
	}
	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> alwh = driver.getWindowHandles();
		for(String loopvariable:alwh)
		{
			driver.switchTo().window(loopvariable);
			String title = driver.getTitle();
			System.out.println(title);
			if(title.equals("Topper"))
			{
				driver.close();
			}
			
			driver.close();
			Thread.sleep(1000);
		}
	}

}
