package pack1;

import java.util.List;
import java.util.Set;
import java.util.set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class p15
{
	static
	{
		
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				
	}
	public static <webDriverWait> void main(String[] args) throws Throwable 	
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("loginButton")).click();
		FluentWait w=new FluentWait(driver);
		w.pollingEvery(250, TimeUnit.MILLISECONDS);
		w.withTimeout(10, TimeUnit.SECONDS);
		w.ignoring(NoSuchElementException.class);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
		System.out.println(driver.getTitle());
		driver.findElement(By.id("logoutLink")).click();
		driver.close();
		
	}
}
