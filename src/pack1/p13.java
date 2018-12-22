package pack1;

import java.io.File;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p13
{
	static
	{
		
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				
	}
	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver = new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  TakesScreenshot t=(TakesScreenshot)driver;
		  File Src=t.getScreenshotAs(OutputType.FILE);
		  File dest=new File("./screenshot/test1.png");
		  FileUtils.copyFile(Src, dest);  
	}
}