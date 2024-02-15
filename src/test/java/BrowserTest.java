import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserTest {
	
	public static void main(String[] args) {
		
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com/");
		
		driver.findElement(By.id("APjFqb")).sendKeys("banana");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.RETURN);
		
		//WebElement textbox = driver.findElement(By.className("searchBox formInput"));
		//textbox.sendKeys("pramesh");
		
			try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.close();
		//driver.quit();
			
			System.out.println("Test completed successfully");
			
		
	}
	

}
