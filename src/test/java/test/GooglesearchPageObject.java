package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GooglesearchPageObject {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com/");
		
		driver.findElement(By.id("APjFqb")).sendKeys("banana");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.RETURN);
		
		
		//driver.close();
		driver.quit();		
		}

}
