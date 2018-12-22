package pack1;

import java.awt.Checkbox;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.border.TitledBorder;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class p16a
{

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("loginButton")).click();
		WebDriverWait wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//a)[4]")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("createUserDiv")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userDataLightBox_firstNameField")));
		driver.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("jee");
		driver.findElement(By.id("closeUserDataLightBoxBtn")).click();
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
		
		
		
	}
	}