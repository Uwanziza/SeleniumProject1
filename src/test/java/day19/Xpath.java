package day19;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		//types of absolute and relative of xpath
		String productname= driver.findElement(By.xpath("//a[normalize-space()='MacBook']")).getText(); 
		
		//String productname=driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/h4[1]/a[1]")).getText();
				
		System.out.println(productname);

	}

}
