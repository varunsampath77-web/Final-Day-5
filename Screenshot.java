package day5;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Screenshot {

	public static void main(String[] args) throws IOException {
		//ChromeDriver driver = new ChromeDriver();
		
		FirefoxDriver driver = new FirefoxDriver();
		 
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("./KING/flipkart.png");
		
		FileUtils.copyFile(source, destination);
		

	}
	

}
