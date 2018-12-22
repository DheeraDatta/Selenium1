package pack1;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Set;
import java.util.set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class p25
{
	static
	{
		
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				
	}
	public static  void main(String[] args) throws Throwable 	
	{
		FileInputStream f=new FileInputStream("./XL/data.xlsx");
		Workbook book=WorkbookFactory.create(f);
		book.getSheet("sheet1").getRow(0).getCell(0).setCellValue("dhee");
		FileOutputStream f1=new FileOutputStream("./XL/data.xlsx");
		book.write(f1);
		
	}
	
}