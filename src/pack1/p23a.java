package pack1;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class p23a
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://accounts.google.com/signin/v2/sl/pwd?service=wise&passive=1209600&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2F%3Fusp%3Dchrome_app&followup=https%3A%2F%2Fdrive.google.com%2Fdrive%2F%3Fusp%3Dchrome_app&emr=1&flowName=GlifWebSignIn&flowEntry=AddSession&cid=0&navigationDirection=forward");
		driver.findElement(By.id("identifierId")).sendKeys("dheerajdatta");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class=\"qhFLie\"])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("944");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class=\"qhFLie\"])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='a-D-B-Lc-j']")).click();
		//Thread.sleep(4000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='lb-k-Kk g-Gh']")).sendKeys("G-STAR");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='h-De-Vb h-De-Y']")).click();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("(//div[@class='bSmy5'])[1]"));
		Actions a=new Actions(driver);
		a.doubleClick(element).perform();	
	}
}
	
	