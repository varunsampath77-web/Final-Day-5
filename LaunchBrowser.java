package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		 //Launch chrome browser
		//ChromeDriver driver=new ChromeDriver();
		
		EdgeDriver driver=new EdgeDriver();
		 
		//load url
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.id("email")).sendKeys("8925411170");
		
		driver.findElement(By.id("pass")).sendKeys("Prathap");
		
		driver.findElement(By.name("login")).click();
		
	}
}

