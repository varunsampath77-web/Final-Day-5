package day5;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class Screenshot {
@Test
	public void runScreenshot() throws IOException {
		//ChromeDriver driver = new ChromeDriver();
		
		FirefoxDriver driver = new FirefoxDriver();
		 
		driver.get("https://leafground.com/alert.xhtml");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='show']")).click();
		
		Alert simpleAlert = driver.switchTo().alert();
		
		simpleAlert.accept();
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("./KING/flipkart.png");
		
		FileUtils.copyFile(source, destination);
		

	}
	

}
