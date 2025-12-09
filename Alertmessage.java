package day5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Alertmessage {
@Test
	public void runAlert() {

		//FirefoxDriver driver = new FirefoxDriver();
		
		ChromeDriver driver = new ChromeDriver();
		 
		driver.get("https://leafground.com/alert.xhtml");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		Alert simpleAlert = driver.switchTo().alert();
		
		simpleAlert.accept();
		
	}

}
