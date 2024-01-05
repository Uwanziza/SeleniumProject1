package day18;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Locators {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();
    WebDriver driver =new ChromeDriver();
    //open app
    driver.get("http://automationpractice.com/index.php");
    driver.manage().window().maximize();
    
    //search box
    driver.findElement(By.id("search_query_top")).sendKeys("T_Shirt");
    
    //search button
    driver.findElement(By.name("submit_search")).click();
    
    //linktext
    driver.findElement(By.linkText("Printed Chiffon Dress")).click();
    //driver.findElement(By.partialLinkText("Printed Chiffo")).click();
    
    //how to find total number of links
    //find multiple web elements
    //find common locators
  
    // finding number of sliders on homepage  
  List <WebElement> sliders=  driver.findElements(By.className("homeslider_container"));
    System.out.println("Number of sliders:"+sliders.size());
    
    
    //Find total Number of images in homepage
    List <WebElement> images=  driver.findElements(By.tagName("img"));
    System.out.println("Total Number of images:"+images.size());
   
    //find Total number of links
    List <WebElement> links=  driver.findElements(By.className("a"));
    System.out.println("Total Number of links:"+links.size());
    
	}

}
