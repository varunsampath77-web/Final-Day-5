package day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addtocart {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Tv",Keys.ENTER);
		
		driver.findElement(By.xpath("//div[@class='jIjQ8S']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> window =new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(window.get(1));
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@class='dSM5Ub ugg2XR IUmgrZ']")).click();		

	}

}
