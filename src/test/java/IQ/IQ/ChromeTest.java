package IQ.IQ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ChromeTest {
	
	
	@Test
	public void abc() {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-originas=*");
		WebDriver d = new FirefoxDriver();
		d.get("https://www.google.com");
		
	}

}
