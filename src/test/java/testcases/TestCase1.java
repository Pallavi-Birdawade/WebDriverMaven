package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestCase1 {

	public static WebDriver driver;

	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();	
		
	}
	
	
	@Test
	public void doLogin() {
		driver.get("http://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("p28.birdawade@gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();	
	}
	
	@AfterSuite
	public void tearDoen() {
		
		driver.quit();
	}

}
