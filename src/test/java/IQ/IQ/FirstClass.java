package IQ.IQ;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstClass {
	WebDriver driver;
	@BeforeTest
	public void setUp() throws InterruptedException {
		 //driver = new ChromeDriver();
		
		
		
	}
	
	@Test(invocationCount=100)
	public void methodOne() throws InterruptedException {
		 ChromeOptions options = new ChromeOptions();
	     options.addArguments("headless");
	     WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.youtube.com/watch?v=OU9zNHeBw4Q");
		Thread.sleep(5000);
		clickVideo(driver);
		System.out.println("clicked play button");
		Thread.sleep(2000);
		driver.quit();
}
	
	public static void clickVideo(WebDriver driver) throws InterruptedException {
		WebElement ele = driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']"));
		JavascriptExecutor sc = (JavascriptExecutor)driver;
		sc.executeScript("arguments[0].click();", ele);
		ele.click();
	}

}
