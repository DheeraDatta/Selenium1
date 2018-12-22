package pack1;

import java.util.List;
import java.util.Set;
import java.util.set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p8
{
	static
	{
		
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				
	}
	public static void main(String[] args) throws Throwable 	
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement checkbox= driver.findElement(By.xpath("//input[@type='checkbox']"));
		WebElement  textbox= driver.findElement(By.xpath("//input[@type='textbox']"));
		System.out.println(checkbox.isSelected());
		checkbox.click();
		System.out.println(checkbox.isSelected());
		//driver.close();
	}
}