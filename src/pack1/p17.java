package pack1;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class p17
{
	static
	{
		
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				
	}
	public static <webDriverWait> void main(String[] args) throws Throwable 	
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		//WebElement uplodecv=driver.findElement(By.xpath("//input[@value=\"Upload CV\"]"));
		WebElement uploadecv=driver.findElement(By.xpath("//input[@class='plainBtn']"));
        File cv = new File("./CV/dhee.docx");
        String path = cv.getAbsolutePath();
        uploadecv.sendKeys(path);
	}
}