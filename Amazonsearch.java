package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazonsearch {

	public static void main(String[] args) {
		//EdgeDriver driver = new EdgeDriver();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("shoe",Keys.ENTER);

	}

}
