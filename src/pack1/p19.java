package pack1;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class p19
{
	static
	{
		
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
				
	}
	public static <webDriverWait> void main(String[] args) throws Throwable 	
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/download/");
		driver.findElement(By.xpath("//a[text()='3.141.59']")).click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		driver.close();
	}
}