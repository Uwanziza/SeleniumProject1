package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
	
	//Declare it as global variable
	WebDriver driver;
	@BeforeClass
  @Test(priority=1)
  void openApp () {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");
  }
  @Test(priority=2)
   void login () {
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  driver.findElement(By.name("password")).sendKeys("Admin123");
	  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	  
}
  @AfterClass
  @Test(priority=3)
   void closeApp () {
	  
  driver.quit();
}
  
}
