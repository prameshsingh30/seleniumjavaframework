package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("banana");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.RETURN);
		
		//driver.close();
		//driver.quit();

	}
	
	
}


