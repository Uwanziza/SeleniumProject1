package day22;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
          WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		System.out.println("title of the page "+driver.getTitle());
		
		System.out.println("Current Url "+driver.getCurrentUrl());
		
		//System.out.println("Current Page Source"+driver.getPageSource());
		
		//System.out.println("Windows Id "+driver.getWindowHandles());
		
		
		//To click to another page link to another page
		Thread.sleep(3000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String>windowids =driver.getWindowHandles();
		
		for (String winid:windowids)
		{
			System.out.println(winid);
		}
			
       
	}

}
